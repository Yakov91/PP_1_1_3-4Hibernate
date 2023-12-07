package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 22);
        userService.saveUser("Piter", "Petrov", (byte) 26);
        userService.saveUser("Bob", "Steven", (byte) 33);
        userService.saveUser("Jack", "Vorobey", (byte) 43);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
     //   userService.dropUsersTable();
    }
}
