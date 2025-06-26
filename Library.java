import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private Map<Integer, Integer> issuedBooks = new HashMap<>(); // bookId -> userId

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName() + "\n");
    }

    public User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.\n");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.\n");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void issueBook(int bookId, User user) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    book.setIssued(true);
                    issuedBooks.put(bookId, user.getUserId());
                    System.out.println("Book issued to " + user.getName() + ".\n");
                } else {
                    System.out.println("Book is already issued.\n");
                }
                return;
            }
        }
        System.out.println("Book not found.\n");
    }

    public void returnBook(int bookId, User user) {
        if (issuedBooks.containsKey(bookId) && issuedBooks.get(bookId) == user.getUserId()) {
            for (Book book : books) {
                if (book.getId() == bookId) {
                    book.setIssued(false);
                    issuedBooks.remove(bookId);
                    System.out.println("Book returned successfully.\n");
                    return;
                }
            }
        } else {
            System.out.println("Book not issued to this user.\n");
        }
    }
}
