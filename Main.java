import com.auth.controller.AuthController;

public class Main {
    
    public static void main(String[] args) {
        // Instance from AuthController.
        AuthController authController = new AuthController();

        // Call for the display the menu.
        authController.displayMenu();
    }
}
