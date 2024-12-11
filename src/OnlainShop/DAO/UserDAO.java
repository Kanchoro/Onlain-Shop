package OnlainShop.DAO;

import OnlainShop.Models.Products;
import OnlainShop.Models.User;

public interface UserDAO {
    String saveUser(User user);
    User[] getAll();

}
