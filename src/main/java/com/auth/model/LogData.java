package com.auth.model;

import java.time.LocalDateTime;

public class LogData {
    
    // Attributes.
    private Long logID;
    private LocalDateTime accessDate;
    private boolean status;

    // Attributes from user.
    private User user;

    // Getter for access date.
    public LocalDateTime getAcessDate() {
        return this.accessDate;
    } 

    // Getter for Status.
    public boolean getStatus() {
        return this.status;
    }
}
