/**
 * A subclass of Person that represents a Student
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */

public class Student extends Person {
    // TODO: Modify and complete this class
    private int grade;

    public Student(String firstName, String lastName, String phoneNumber, boolean isFavorite, int grade) {
        super(firstName, lastName, phoneNumber, isFavorite);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " - #" + getPhoneNumber() + " Grade: " + grade + " Favorite: " + isFavorite();
    }
}
