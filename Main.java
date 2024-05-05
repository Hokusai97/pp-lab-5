import company.beans.Person;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Rafał", 26);
            System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            new Person("Rafał2", 126); 
        } catch (Exception ex) {
            System.out.println(ex);
        }

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Hello World! This is a test email message!");
    }
}
