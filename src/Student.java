/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick & Ethan Friesel
 * @version: 2022-2023
 */
//Class with inheritance from Person Class
public class Student extends Person {
    //instance variable grade
    private int grade;

    //Constructor with call for the super class
    public Student(String firstName, String lastName, String phoneNumber, boolean isFavorite, int grade) {
        super(firstName, lastName, phoneNumber, isFavorite);
        this.grade = grade;
    }

    //Getter function for grade instance variable
    public int getGrade() {
        return grade;
    }

    // override for toString function in parent class
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " - #" + getPhoneNumber() + " Grade: " + grade + " Favorite: " + isFavorite();
    }
}
