package com.auth.controller;

import java.util.Scanner;
import com.auth.service.UserService;

public class AuthController {
    
    // Attribute for scanner.
    private Scanner input = new Scanner(System.in);

    // Instance from  UserService class.
    private UserService userService = new UserService();


    // Display menu method.
    public void displayMenu() {
        
        boolean running = true;

        while (running) {
            System.out.println("\n--- AUTHENTICATION SYSTEM ---");
            System.out.println("1- Register-In");
            System.out.println("2- Log-In");
            System.out.println("3- Exit");
            System.out.println("Choose an option: ");

            String option = input.nextLine();

            switch (option) {
                case "1":
                    registerMenu();
                    break;
                case "2":
                    loginMenu();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }

    // Menu for register.
    public void registerMenu() {
        System.out.print("Type your new username: ");
        String name = input.nextLine();

        System.out.print("Type your password: ");
        String password = input.nextLine();
        
        boolean authenticated = userService.registerUser(name, password);

        if (authenticated) {
            System.out.println("Successfully authenticated!");
        } else {
            System.out.println("Error: Username already exists or password is invalid.");
        }
    }   
    
    // Menu for login.
    public void loginMenu() {
        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine(); 

        boolean authenticated = userService.authenticate(username, password);

        if (authenticated) {
            System.out.println("Login successful! Welcome back, " + username + ".");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
