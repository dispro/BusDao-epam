package by.epam.task4.entity;

public class Driver {

    private String firstName;
    private String lastName;

    public Driver(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(this.firstName);
        string.append(" ");
        string.append(this.lastName.charAt(0));
        string.append(".");
        return string.toString();
    }
}
