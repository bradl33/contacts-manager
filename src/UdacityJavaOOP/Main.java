package UdacityJavaOOP;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();
        Contact brad = new Contact();

        brad.name = "Bradley";
        brad.email = "bradley@example.com";
        brad.phoneNumber = "0123456789";

        myContactManager.addContact(brad);

        //Convert search name to Title Case to match what is stored
        String rawSearchName = "brADleY";
        String searchNameInTitleCase = StringToTitleCase.convertToTitleCaseIteratingChars(rawSearchName);
        Contact searchedContact = myContactManager.searchContact(searchNameInTitleCase);

        if(searchedContact != null){
            System.out.println(searchedContact.phoneNumber);
        }
    }
}