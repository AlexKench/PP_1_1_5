package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alexandr", "Maksimov", (byte) 30);
        userService.saveUser("Mihail", "Yarcev", (byte) 25);
        userService.saveUser("Leonid", "Lenin", (byte) 99);
        userService.saveUser("Aleksey", "Gorohov", (byte) 74);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
