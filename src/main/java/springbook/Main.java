package springbook;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // write your code here
        System.out.print("HELLO !!!");

        UserDao userDao = new UserDao();

        User user = new User();
        user.setId("autumnlee");
        user.setName("가을");
        user.setPassword("winter");

        userDao.add(user);
    }
}
