package assignment.day1.day2;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        int number = 10;
        Person person = new Person("John");

        System.out.println("Before calling methods:");
        System.out.println("Number: " + number);
        System.out.println("Person: " + person.getName());

        // Call methods
        updateNumber(number);
        updatePerson(person);

        System.out.println("After calling methods:");
        System.out.println("Number: " + number);
        System.out.println("Person: " + person.getName());
    }

    public static void updateNumber(int value) {
        value = 20; // Modify the value parameter
    }

    public static void updatePerson(Person p) {
        p.setName("Mike"); // Modify the person object
    }
}
