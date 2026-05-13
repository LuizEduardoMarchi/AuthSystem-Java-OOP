package com.auth.model;

public class User {
    
    // Attributes.
    private Long userID;
    private String userName;
    private String passwordHash;

    // Attributes from role.
    private Role role;

    // Check again this attribute.
    public boolean authenticate(String password) {
        if (this.passwordHash.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    // Getter and setter for UserName.
    public String getUserName() {
        return this.userName;
    }

    public void setNewUserName(String newName) {
        this.userName = newName;
    }

    // Method for users delete their own account.
    public boolean deleteOwnAccount(String passwordHashConfirm) {

        // If password is wrong return false;
        if (!this.passwordHash.equals(passwordHashConfirm)) {
            return false;
        }

        // Return true when passwords is right.
        return true;
    }

    // Setter for new password.
    public void setNewPassword(String newPassword) {
        this.passwordHash = newPassword; 
    }

    // Getter for password
    public String getPasswordHash() {
        return this.passwordHash;
    }

}