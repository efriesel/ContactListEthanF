import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick & Ethan
 * @version: 2022-2023
 */

public class ContactList
{
    //ArrayList instance variable for all contacts
    ArrayList<Person> contacts;

    //Constructor will arraylist declaration
    public ContactList() {
        contacts = new ArrayList<Person>();
    }

    // this method will print out the menu
    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. List All Favorites");
        System.out.println("7. Search By First Name");
        System.out.println("8. Search By Last Name");
        System.out.println("9. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact() {
        Scanner s = new Scanner(System.in);
        System.out.println("Select the type of contact to add:\n1. Student\n2. Family Member\n3. Person");
        int selection = s.nextInt();
        s.nextLine();
        System.out.println("Please fill in the following information.\nFirst Name:");
        String firstName = s.nextLine();
        System.out.println("Last Name:");
        String lastName = s.nextLine();
        System.out.println("Phone Number:");
        String phoneNumber = s.nextLine();
        System.out.println("is a favorite (true/false):");
        boolean isFavorite = s.nextBoolean();
        s.nextLine();
        if (selection == 1){
            System.out.println("Grade:");
            selection = s.nextInt();
            s.nextLine();
            contacts.add(new Student(firstName, lastName, phoneNumber, isFavorite, selection));
        }
        else if (selection == 2){
            System.out.println("Relation to Family Member:");
            String relation = s.nextLine();
            contacts.add(new FamilyMember(firstName, lastName, phoneNumber, isFavorite, relation));
        }
        else {
            contacts.add(new Person(firstName, lastName, phoneNumber, isFavorite));
        }
    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        System.out.println("Contacts:");
        for (Person p: contacts){
            System.out.println(p);
        }
    }

    /**
     * Loops through and prints all favorites
     */
    public void listFavorites(){
        System.out.println("Favorites:");
        for (Person p : contacts){
            if (p.isFavorite()){
                System.out.println(p);
            }
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        for (int i = 0; i < contacts.size() - 2; i++){
            for (int j = 0; j < contacts.size() - 2 - i; j++){
                if (sortBy == 0){
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName()) > 0){
                        Person swap = contacts.remove(i);
                        contacts.add(j + 1, swap);
                    }
                }
                else if (sortBy == 1){
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j + 1).getLastName()) > 0){
                        Person swap = contacts.remove(i);
                        contacts.add(j + 1, swap);
                    }
                }
                else {
                    if (contacts.get(j).getPhoneNumber().compareTo(contacts.get(j + 1).getPhoneNumber()) > 0){
                        Person swap = contacts.remove(i);
                        contacts.add(j + 1, swap);
                    }
                }
            }
        }
    }

    /**
     * This function will search for every contact will a matching firstName
     * @param firstName
     * @return an arraylist with every instance of the name (if any).
     */
    public ArrayList<Person> searchByFirstName(String firstName){
        ArrayList<Person> search = new ArrayList<>();
        for (Person p : contacts){
            if (p.getFirstName().equals(firstName)){
                search.add(p);
            }
        }
        if (search.isEmpty())
            return null;
        return search;
    }

    /**
     * This function will search for every contact will a matching lastName
     * @param lastName
     * @return an arraylist with every instance of the name (if any).
     */
    public ArrayList<Person> searchByLastName(String lastName){
        ArrayList<Person> search = new ArrayList<>();
        for (Person p : contacts){
            if (p.getLastName().equals(lastName)){
                search.add(p);
            }
        }
        if (search.isEmpty())
            return null;
        return search;
    }

    /**
     * This function will search for every contact will a matching phoneNumber
     * @param phoneNumber
     * @return an arraylist with every instance of the number (if any).
     */
    public ArrayList<Person> searchByPhoneNumber(String phoneNumber){
        ArrayList<Person> search = new ArrayList<>();
        for (Person p : contacts){
            if (p.getPhoneNumber().equals(phoneNumber)){
                search.add(p);
            }
        }
        if (search.isEmpty())
            return null;
        return search;
    }

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i) instanceof Student){
                System.out.println(contacts.get(i));
            }
        }
    }

    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        printMenuOptions();

        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        s.nextLine();
        // Uses a while loop for continuing inputs, as well as a c style case switch statement using prebuilt function
        while (in != 0){
            if (in == 1)
                addContact();
            else if (in == 2){
                sort(0);
                printContacts();
            }
            else if (in == 3){
                sort(1);
                printContacts();
            }
            else if (in == 4){
                sort(2);
                printContacts();
            }
            else if (in == 5){
                listStudents();
            }
            else if (in == 6){
                listFavorites();
            }
            else if (in == 7){
                System.out.println("Enter a name:");
                String name = s.nextLine();
                ArrayList<Person> firsts = searchByFirstName(name);
                if (firsts == null){
                    System.out.println(name + " is not in the list.");
                }
                else {
                    for (Person p : firsts)
                        System.out.println(p);
                }
            }
            else if (in == 8){
                System.out.println("Enter a name:");
                String name = s.nextLine();
                ArrayList<Person> lasts = searchByLastName(name);
                if (lasts == null){
                    System.out.println(name + " is not in the list.");
                }
                else {
                    for (Person p : lasts)
                        System.out.println(p);
                }
            }
            else if (in == 9){
                System.out.println("Enter a name:");
                String name = s.nextLine();
                ArrayList<Person> numbers = searchByPhoneNumber(name);
                if (numbers == null){
                    System.out.println(name + " is not in the list.");
                }
                else {
                    for (Person p : numbers)
                        System.out.println(p);
                }
            }
            // ask for input again at the end for iteration, as well as add a s.nextLine() so the user can look at their inputs before moving on to the next line
            s.nextLine();
            printMenuOptions();
            in = s.nextInt();
            s.nextLine();
        }

    }

    //main method for the whole contact list
    public static void main(String[] args)
    {
        ContactList cl = new ContactList();
        cl.run();
    }
}
