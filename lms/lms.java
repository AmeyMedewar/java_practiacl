import java.io.*;
import java.util.*;

class Book {
    private String bookName;
    private String author;
    private String isbn;
    private boolean availability;

    public Book(String bookName, String author, String isbn, boolean availability) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    public String toString() {
        return bookName + "," + author + "," + isbn + "," + availability;
    }

    public static Book fromString(String bookString) {
        String[] parts = bookString.split(",");
        if (parts.length == 4) {
            return new Book(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3]));
        }
        return new Book("", "", "", false);
    }
}

class User {
    private String name;
    private String id;
    private String contactInfo;
    private List<String> bookHistory;

    public User(String name, String id, String contactInfo) {
        this.name = name;
        this.id = id;
        this.contactInfo = contactInfo;
        this.bookHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void addBookToHistory(String bookInfo) {
        bookHistory.add(bookInfo);
    }

    public void displayBookHistory() {
        System.out.println("Book history for " + name + ":");
        if (bookHistory.isEmpty()) {
            System.out.println("No books borrowed yet.");
        } else {
            for (String book : bookHistory) {
                System.out.println(book);
            }
        }
    }

    public List<String> getBookHistory() {
        return bookHistory;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private final String BOOKS_FILE = "books.txt"; // File to store books data
    private final String USERS_FILE = "users.txt"; // File to store users data
    private final String HISTORY_FILE = "history.txt"; // File to store book borrowing history

    public void addBooks(String bookName, String author, String isbn) {
        books.add(new Book(bookName, author, isbn, true));
        System.out.println("Book added successfully.");
    }
    public User findUserByName(String name) {
    for (User user : users) {
        if (user.getName().equals(name)) {
            return user;
        }
    }
    return null;
}

    public void searchBook(String searchTerm) {
        System.out.println("Search results:");
        boolean found = false;
        for (Book book : books) {
            if (book.getBookName().contains(searchTerm) || book.getAuthor().contains(searchTerm)) {
                System.out.println("Title: " + book.getBookName() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN()
                        + ", Availability: " + (book.isAvailable() ? "Available" : "Not Available"));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    public void borrowBook(String userName, String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book successfully borrowed.");
                recordBorrowHistory(userName, book);
            } else {
                System.err.println("Error: Book is not available for borrowing.");
            }
        } else {
            System.err.println("Error: Book not found.");
        }
    }

    private void recordBorrowHistory(String userName, Book book) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.addBookToHistory("Borrowed: " + book.getBookName() + ", ISBN: " + book.getISBN());
                break;
            }
        }
    }

    public void returnBook(String userName, String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book successfully returned.");
                recordReturnHistory(userName, book);
            } else {
                System.err.println("Error: The book is already available in the library.");
            }
        } else {
            System.err.println("Error: Book not found.");
        }
    }

    private void recordReturnHistory(String userName, Book book) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.addBookToHistory("Returned: " + book.getBookName() + ", ISBN: " + book.getISBN());
                break;
            }
        }
    }

    public void generateAvailableBooksReport() {
        System.out.println("Available books in the library:");
        boolean found = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getBookName() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books in the library.");
        }
    }

    private Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void addUser(String name, String id, String contactInfo) {
        users.add(new User(name, id, contactInfo));
        System.out.println("User added successfully.");
    }

    public void saveBooksToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(BOOKS_FILE))) {
            for (Book book : books) {
                writer.println(book.toString());
            }
            System.out.println("Books data saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving books data to file: " + e.getMessage());
        }
    }

    public void loadBooksFromFile() {
        try (Scanner scanner = new Scanner(new File(BOOKS_FILE))) {
            books.clear(); // Clear existing books
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Book book = Book.fromString(line);
                books.add(book);
            }
            System.out.println("Books data loaded from file.");
        } catch (FileNotFoundException e) {
            System.err.println("Books file not found. Creating a new file.");
        }
    }

    public void saveUsersToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(USERS_FILE))) {
            for (User user : users) {
                writer.println(user.getName() + "," + user.getID() + "," + user.getContactInfo());
            }
            System.out.println("Users data saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving users data to file: " + e.getMessage());
        }
    }

    public void loadUsersFromFile() {
        try (Scanner scanner = new Scanner(new File(USERS_FILE))) {
            users.clear(); // Clear existing users
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    users.add(new User(parts[0], parts[1], parts[2]));
                }
            }
            System.out.println("Users data loaded from file.");
        } catch (FileNotFoundException e) {
            System.err.println("Users file not found. Creating a new file.");
        }
    }

    public void saveHistoryToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE))) {
            for (User user : users) {
                for (String history : user.getBookHistory()) {
                    writer.println(user.getName() + "," + history);
                }
            }
            System.out.println("Borrow history saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving borrow history to file: " + e.getMessage());
        }
    }

    public void loadHistoryFromFile() {
        try (Scanner scanner = new Scanner(new File(HISTORY_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    for (User user : users) {
                        if (user.getName().equals(parts[0])) {
                            user.addBookToHistory(parts[1]);
                            break;
                        }
                    }
                }
            }
            System.out.println("Borrow history loaded from file.");
        } catch (FileNotFoundException e) {
            System.err.println("Borrow history file not found. Creating a new file.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t Welcome to Library Management System");

        // Load data from files at the start
        library.loadBooksFromFile();
        library.loadUsersFromFile();
        library.loadHistoryFromFile();

        int choice;
        do {
            System.out.println("What do you want me to do?");
            System.out.println("Press 1 to add book");
            System.out.println("Press 2 to search for a book");
            System.out.println("Press 3 to borrow a book");
            System.out.println("Press 4 to return a book");
            System.out.println("Press 5 to generate a report");
            System.out.println("Press 6 to add a user");
            System.out.println("Press 7 to display book history for a user");
            System.out.println("Press 8 to exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the title: ");
                    scanner.nextLine(); // Consume newline
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBooks(title, author, isbn);
                    break;
                case 2:
                    System.out.print("Enter the search term (title or author): ");
                    scanner.nextLine(); // Consume newline
                    String searchTerm = scanner.nextLine();
                    library.searchBook(searchTerm);
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    scanner.nextLine(); // Consume newline
                    String userName = scanner.nextLine();
                    System.out.print("Enter the ISBN of the book to borrow: ");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(userName, borrowISBN);
                    break;
                case 4:
                    System.out.print("Enter your name: ");
                    scanner.nextLine(); // Consume newline
                    String returnUserName = scanner.nextLine();
                    System.out.print("Enter the ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnUserName, returnISBN);
                    break;
                case 5:
                    library.generateAvailableBooksReport();
                    break;
                case 6:
                    System.out.print("Enter the name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter the ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter the contact info: ");
                    String contactInfo = scanner.nextLine();
                    library.addUser(name, id, contactInfo);
                    break;
                case 7:
                    System.out.print("Enter the name of the user: ");
                    scanner.nextLine(); // Consume newline
                    String userNameHistory = scanner.nextLine();
                    User user = library.findUserByName(userNameHistory);
                    if (user != null) {
                        user.displayBookHistory();
                    } else {
                        System.err.println("User not found.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting the program. Saving data...");
                    // Save data to files before exiting
                    library.saveBooksToFile();
                    library.saveUsersToFile();
                    library.saveHistoryToFile();
                    break;
                default:
                    System.err.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}

