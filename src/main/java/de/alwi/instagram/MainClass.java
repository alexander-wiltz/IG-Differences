package de.alwi.instagram;

import de.alwi.instagram.dao.UserDAO;
import de.alwi.instagram.dto.UserDTO;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        List<UserDTO> users = userDAO.getAllUsers();
        if(users != null) {
            for (UserDTO u : users) {
                System.out.println(u);
            }
        }
    }
}
