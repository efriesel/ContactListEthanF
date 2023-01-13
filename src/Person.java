/**
 * A class that represents a Person
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Person {




    private String firstName;
    private String lastName;
    private String phoneNumber;

    private boolean isFavorite;

    public Person(String firstName, String lastName, String phoneNumber, boolean isFavorite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.isFavorite = isFavorite;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString(){
        return firstName + " " + lastName + " - #" + phoneNumber;
    }


}
