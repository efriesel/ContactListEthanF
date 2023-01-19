/**
 * A subclass of Person that represents a Family Member
 *
 * Created for Menlo School CS2
 *
 * @author: Ethan Friesel
 * @version: 2022-2023
 */
public class FamilyMember extends Person{
    //Instance Variable
    public String relation;
    //Constructor
    public FamilyMember(String firstName, String lastName, String phoneNumber, boolean isFavorite, String relation) {
        super(firstName, lastName, phoneNumber, isFavorite);
        this.relation = relation;
    }
    //getter function for the relation instance variable
    public String getRelation() {
        return relation;
    }
    //Override for toString in superclass
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " - #" + getPhoneNumber() + " Relation: " + relation + " Favorite: " + isFavorite();
    }
}
