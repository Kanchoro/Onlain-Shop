package OnlainShop.DAO.Impl;

import OnlainShop.DAO.UserDAO;
import OnlainShop.DataBase.DataBase;
import OnlainShop.Models.Products;
import OnlainShop.Models.User;

import java.util.Arrays;

public class UserImpl implements UserDAO {
    @Override
    public String saveUser(User user) {
        DataBase.users = Arrays.copyOf(DataBase.users,DataBase.users.length+1);
        DataBase.users[DataBase.users.length-1]=user;
        return "Successfully!";
    }

    @Override
    public User[] getAll() {
        return DataBase.users;
    }


}
