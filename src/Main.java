import java.io.Console;
import java.math.BigDecimal;

public class Main {

    public static strictfp void main(String[] args) {

        Console console = System.console();
        String username = console.readLine("Username: ");
        char[] password = console.readPassword("Password: ");
    }
}
