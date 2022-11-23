package UdacityJavaOOP;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();
        Contact brad = new Contact();

        brad.name = "Bradley";
        brad.email = "bradley@example.com";
        brad.phoneNumber = "0123456789";

        myContactManager.addContact(brad);

        String contactNameToSearch = "Bradley";

        Contact searchedContact = myContactManager.searchContact(contactNameToSearch);

        if(searchedContact != null){
            System.out.println(searchedContact.phoneNumber);
        }
    }
}