import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        User currentUser = null;

        System.out.println("Welcome to the Library Management System");

        // User Registration/Login
        System.out.print("Enter your user ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        currentUser = library.findUserById(userId);
        if (currentUser == null) {
            currentUser = new User(userId, name);
            library.registerUser(currentUser);
        } else {
            System.out.println("Welcome back, " + currentUser.getName() + "!\n");
        }

        // Menu
        int choice;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                }
                case 2 -> library.viewBooks();
                case 3 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = sc.nextInt();
                    library.issueBook(bookId, currentUser);
                }
                case 4 -> {
                    System.out.print("Enter Book ID to return: ");
                    int bookId = sc.nextInt();
                    library.returnBook(bookId, currentUser);
                }
                case 5 -> System.out.println("Thank you! Exiting...");
                default -> System.out.println("Invalid choice. Try again.\n");
            }

        } while (choice != 5);

        sc.close();
    }
}
