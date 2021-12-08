package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Привет! Hi");

        user2.sendMessage(user1, "User 2 to User 1");
        user2.sendMessage(user1, "User 2 to User 1 aaaaaa");
        user2.sendMessage(user1, "User 2 to User 1 bbbbbb");

        user3.sendMessage(user1, "Hi");
        user3.sendMessage(user1, "How are u?");
        user3.sendMessage(user1, "How is ur day?");

        user1.sendMessage(user3, "Hello");
        user1.sendMessage(user3, "Who are the fuck you?");
        user1.sendMessage(user3, "And what u want");

        user3.sendMessage(user1, "It's me. Your mother");

        MessageDatabase.showDialog(user1, user3);
    }
}
