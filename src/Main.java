
import OnlainShop.DAO.Impl.ProductsImpl;
import OnlainShop.DAO.Impl.UserImpl;
import OnlainShop.DAO.ProductsDAO;
import OnlainShop.DAO.UserDAO;
import OnlainShop.Service.ProductsService;
import OnlainShop.Service.UserService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final String emailAdmin = "admin@gmail.com";
        final String passwordAdmin = "Admin12";
        UserDAO userDAO = new UserImpl();
        UserService userService = new OnlainShop.Service.Impl.UserImpl(userDAO);
        while (true) {
            System.out.println("""
                    1.Register
                    2.log in
                    3.Exit
                    """);
            switch (numberForCommand()) {
                case 1 -> {
                   userService.registration();
                }
                case 2 -> {
                    userService.logIn(emailAdmin, passwordAdmin);
                }
                case 3->{
                    System.out.println("bye-bye!");
                    return;
                }
                default -> {
                    System.out.println("invalid number!");
                }
            }
        }
    }
    public static int numberForCommand() {
        int number = 0;
        boolean cickle = false;
        do {
            try {
                System.out.print("Write the number: ");
                number = new Scanner(System.in).nextInt();
                cickle = false;
            } catch (Exception e) {
                cickle = true;
                System.out.println("invalid command ");
            }

        } while (cickle);
        return number;
    }
}