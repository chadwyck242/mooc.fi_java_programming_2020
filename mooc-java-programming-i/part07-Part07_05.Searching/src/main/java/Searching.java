
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    // Part 1 of 2 of excersise: Linear Search
    public static int linearSearch(ArrayList<Book> books, int searchedId) {

        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    // Part 2 of 2 of exercise: Linear Search
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
    
        // initialize variables
        int start = 0;
        int end = books.size() - 1;
        int middle = 0;
        
        // perform binary search in this while loop
        while (start <= end) {
            // initialize middle at midpoint of list
            middle = (start + end) / 2;
            
            // determine next search interval,
            // halving search space each iteration
            Book book = books.get(middle);
            int bookId = book.getId();
            if (bookId == searchedId) {
                return middle;
            } else if (bookId < searchedId) {
                start = middle + 1;
            } else if (bookId > searchedId) {
                end = middle - 1;
            }
        }

        return -1;
    }
}
