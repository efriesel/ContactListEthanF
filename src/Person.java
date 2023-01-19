/**
 * A class that represents a Person
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick & Ethan Friesel
 * @version: 2022-2023
 */

public class Person {



    // instance variables
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private boolean isFavorite;

    // constructor for the Person class
    public Person(String firstName, String lastName, String phoneNumber, boolean isFavorite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.isFavorite = isFavorite;
    }

    //getter functions for each instance variable
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
    //to string function that will be overrided twice
    public String toString(){
        return firstName + " " + lastName + " - #" + phoneNumber + " Favorite: " + isFavorite;
    }
}
