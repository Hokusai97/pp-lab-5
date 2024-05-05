import company.beans.Person;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Rafał Wiącek", 16);
            people[2] = new Person("John Cooper", 40);
            people[3] = new Person("James Hetfield", 35);
            people[4] = new Person("Adam Gontier", 28);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                int age = people[i].getAge();
                int value = MathUtils.add(age, b);

                String message = "Hello World! This is a test email message! " + people[i].getName() + " your age is: " + value;

                EmailMessenger emailMessenger = new EmailMessenger();

                emailMessenger.sendMessage(message);
            }
        }
    }
}
