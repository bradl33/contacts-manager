package UdacityJavaOOP;

public class ContactsManager {
    private Contact[] myFriends;
    private int friendsCount;

    public ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    public ContactsManager(Contact[] myFriends, int friendsCount) {
        this.myFriends = myFriends;
        this.friendsCount = friendsCount;
    }

    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].getName().equals(searchName)){
                return myFriends[i];
            }else{
                System.out.println("Contact " + searchName + " not found!");
            }
        }
        return null;
    }
}
