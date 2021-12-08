package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Max");
        User user3 = new User("Kate");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are u?");

        user2.sendMessage(user1, "Hello");
        user2.sendMessage(user1, "How are you?");
        user2.sendMessage(user1, "What time is it");

        user3.sendMessage(user1, "Hi");
        user3.sendMessage(user1, "How is ur day?");
        user3.sendMessage(user1, "Where are u?");

        user1.sendMessage(user3, "Hello");
        user1.sendMessage(user3, "You little freak");
        user1.sendMessage(user3, "Oh sorry");

        user3.sendMessage(user1, "Who are the fuck u?");

        MessageDatabase.showDialog(user1, user3);

    }
}
