import company.beans.Person;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            new Person("Rafał", 26);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            new Person("Rafał", 126); 
        } catch (Exception ex) {
            System.out.println(ex);
        }

        int result = MathUtils.add(7, 7);

        System.out.println("Results are: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();

        emailMessenger.sendMessage("Hello World! This is a test email message! Results are: " + result);
    }
}
