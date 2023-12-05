package edu.neu.mseg.HWtoC14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class ChatApplication {
    private Map<String, User> users;
    private Map<String, StringBuilder> chatHistory;

    public ChatApplication() {
        users = new HashMap<>();
        chatHistory = new HashMap<>();
    }

    public void signUp(String username, String password) {
        User newUser = new User(username, password);
        users.put(username, newUser);
        chatHistory.put(username, new StringBuilder());
        System.out.println("Sign-up successful for user: " + username);
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    public void sendMessage(String sender, String receiver, String message) {
        StringBuilder chat = chatHistory.get(receiver);
        if (chat != null) {
            chat.append(sender).append(": ").append(message).append("\n");
        } else {
            System.out.println("Receiver not found.");
        }
    }

    public void displayChat(String username) {
        StringBuilder chat = chatHistory.get(username);
        if (chat != null) {
            System.out.println("Chat History for " + username + ":\n" + chat);
        } else {
            System.out.println("User not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatApplication chatApp = new ChatApplication();

        while (true) {
            System.out.println("1. Sign-up");
            System.out.println("2. Login");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String signUpUsername = scanner.next();
                    System.out.print("Enter password: ");
                    String signUpPassword = scanner.next();
                    chatApp.signUp(signUpUsername, signUpPassword);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.next();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.next();

                    if (chatApp.login(loginUsername, loginPassword)) {
                        System.out.println("Login successful!");
                        chatLoop(scanner, chatApp, loginUsername);
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting chat application. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void chatLoop(Scanner scanner, ChatApplication chatApp, String username) {
        while (true) {
            System.out.println("\n1. Send Message");
            System.out.println("2. Display Chat History");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int chatChoice = scanner.nextInt();

            switch (chatChoice) {
                case 1:
                    System.out.print("Enter recipient's username: ");
                    String receiver = scanner.next();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter your message: ");
                    String message = scanner.nextLine();
                    chatApp.sendMessage(username, receiver, message);
                    break;

                case 2:
                    chatApp.displayChat(username);
                    break;

                case 3:
                    System.out.println("Logging out. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

