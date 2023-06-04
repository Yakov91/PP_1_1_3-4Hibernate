package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Ivan", "Ivanov", (byte) 22);
        userDao.saveUser("Piter", "Petrov", (byte) 26);
        userDao.saveUser("Bob", "Steven", (byte) 33);
        userDao.saveUser("Jack", "Vorobey", (byte) 43);
        System.out.println(userDao.getAllUsers());
        //userDao.cleanUsersTable();
       // userDao.dropUsersTable();
    }
}
