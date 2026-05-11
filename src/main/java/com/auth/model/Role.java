package main.java.com.auth.model;

public class Role {
    
    // Attributes
    private Long roleID;
    private String roleName;

    // Attributes from user
    private User user;

    // Getters and Setters for name
    public String getName(){
        return this.roleName;
    }

    public void setName(String name){
        this.roleName = name;
    }

    // Verifies if user has role 'Admin'
    public boolean isAdmin() {
        return "Admin".equals(this.roleName); 
    }
}
