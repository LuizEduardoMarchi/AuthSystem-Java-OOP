package main.java.com.auth.model;

public class User {
    
    // Attributes
    private Long userID;
    private String userName;
    private String passwordHash;

    // Attributes from role
    private Role role;

    // Check again this attribute
    public boolean authenticate(String password) {
        if (this.passwordHash.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void updateUserName(String newName) {
        this.userName = newName;
    }

    public boolean deleteOwnAccount(String passwordConfirm) {

        // If password is wrong return false;
        if (!this.passwordHash.equals(passwordConfirm)) {
            return false;
        }

        // Return true when passwords is right
        return true;
    }

    public void updatePassword (String newPassword){
        this.passwordHash = newPassword; 
    }
}
