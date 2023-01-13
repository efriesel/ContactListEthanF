public class FamilyMember extends Person{
    public String relation;

    public FamilyMember(String firstName, String lastName, String phoneNumber, String relation) {
        super(firstName, lastName, phoneNumber);
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " - #" + getPhoneNumber() + " Relation: " + relation;
    }
}
