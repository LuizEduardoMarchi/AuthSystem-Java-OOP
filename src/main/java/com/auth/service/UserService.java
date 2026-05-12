package com.auth.service;

import java.util.List;
import java.util.ArrayList;
import com.auth.model.User;

public class UserService {

    // Dynamic class list.
    private List<User> users = new ArrayList<>();

    // Verify username availability.
    public boolean checkUserNameAvailability (String username) {
        return users.stream().anyMatch(userName -> userName.getUserName().equalsIgnoreCase(username));
    }

    // Register new user
    public boolean registerUser(String username, String password) {
        // Verifies if password is at least with 8 digits.
        if (password.length() < 8) {
            return false;
        }
        
        // Checks if username is availble and creates a new user.
        if (checkUserNameAvailability(username)) {
            
            // Creates a new object.
            User newUser = new User(); 
            
            // Fill up newUser with data.
            newUser.setNewUserName(username);
            newUser.setNewPassword(password);
            
            // Storage in users
            users.add(newUser);

            return true;
        }
        return false; // Returns false when username already exist.
    }

    public boolean authenticate(String username, String password) { 
        if (users.stream().filter(userName -> userName.getUserName().equalsIgnoreCase(username))) {
            
        }
    }

}