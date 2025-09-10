package dag_3.library_system;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class LibrarySystem {
	/*Sebastian_BEGIN*/
	public static void main(String[] args) {
		ArrayList<String>  bookTitles    = new ArrayList<>();
		ArrayList<String>  bookAuthors   = new ArrayList<>();
		ArrayList<String>  bookISBN      = new ArrayList<>();
		ArrayList<Boolean> bookAvailable = new ArrayList<>();

		ArrayList<String> borrowerNames = new ArrayList<>();
		ArrayList<String> borrowedBooks  = new ArrayList<>();
		ArrayList<String> userNames     = new ArrayList<>();
		ArrayList<String> phoneNumbers  = new ArrayList<>();
// TEST DATA
		bookTitles.add("Harry Potter");
		bookTitles.add("Sagan om ringen");
		bookTitles.add("1984");
		bookAuthors.add("J.K. Rowling");
		bookAuthors.add("Tolkien");
		bookAuthors.add("Orwell");
		bookISBN.add("111");
		bookISBN.add("222");
		bookISBN.add("333");
		bookAvailable.add(true);
		bookAvailable.add(true);
		bookAvailable.add(false); // 1984 är utlånad
// Fördefinierade användare
		userNames.add("Anna");
		userNames.add("Erik");
		phoneNumbers.add("070-1234567");
		phoneNumbers.add("070-7654321");
// Fördefinierat lån
		borrowerNames.add("Anna");
		borrowedBooks.add("333"); // Anna har lånat 1984
// PROGRAM BEGINS
		Scanner sc = new Scanner(in);
		boolean exit = false;
		while (!exit) {
			displayMainMenu();
			int choice = sc.nextInt();
			sc.nextLine(); // Takes care of trailing newline

			switch (choice) {
				case 1:
					displayAllBooks(bookTitles, bookAuthors, bookISBN);
					break;
				case 2:
					out.printf("Titel: ");
					String title = sc.nextLine();
					out.printf("Författare: ");
					String author = sc.nextLine();
					out.printf("ISBN: ");
					String isbn = sc.nextLine();
					addBook(bookTitles, bookAuthors, bookISBN, title, author, isbn);
					break;
				case 3:
					//borrowBook(bookAvailable, borrowerNames, borrowedBooks, /*?*/, borrowerName, bookISBN);
					break;
				case 4:
					break;
				case 0:
					break;
			}
		}
	}
	public static void displayMainMenu() {
		out.printf(
			"""
			%n──── Biblitoekssystem ────%n
					1. Visa alla böcker
					2. Lägg till bok
					3. Låna bok
					4. Återlämna bok
					5. Visa statistik
					0. Avsluta
			"""
		);
	}

	public static void displayBookMenu() {
	}

	public static void displayLoanMenu() {
	}
	/*Sebastian_END*/

	// VALENTIN'S DEL NEDAN 👇🏽
	public static void addBook(
		ArrayList<String> titles,
		ArrayList<String> authors,
		ArrayList<String> isbn,
		String title,
		String author,
		String isbnNumber
	) {
		/**
		 * TODO:
		 * Add a 'title', 'author', and 'isbn' to the provided arguments
		 */
		titles.add(title);
		authors.add(author);
		isbn.add(isbnNumber);
	}

	public static void displayAllBooks(
		ArrayList<String> titles,
		ArrayList<String> authors,
		ArrayList<String> isbn
	) {
		/** TODO:
		 * For each index of 'titles' print a compiled string of 'title + author + isbn'
		 * */
		for (int i = 0; i < titles.size(); i++) {
			System.out.println("Book: " + titles.get(i) + ", by author: " + authors.get(i) + ".\nISBN: " + isbn.get(i));
		}
	}

	public static int searchBook(
		ArrayList<String> titles,
		ArrayList<String> authors,
		String searchTerm
	) {
		if (titles.contains(searchTerm)) {
			return titles.indexOf(searchTerm);
		} else if (authors.contains(searchTerm)) {
			return titles.indexOf(searchTerm);
		}

		System.out.println("No book, or author with the title/name of : " + searchTerm + " exists in the library");
		return -1;
	}
	// VALENTIN'S DEL ÖVER 👆🏽

	/**
	 * ArrayList<Boolean> available - true/false
	 * ArrayList<String> borrowers - Namn på alla som lånar en book
	 * ArrayList<String> borrowedBooks - ISBN-nummer (bok-ID)
	 * int bookIndex
	 * String borrowerName Namn på den som lånat boken
	 */
	public static boolean borrowBook(ArrayList<Boolean> available, ArrayList<String> borrowers, ArrayList<String> borrowedBooks, int bookIndex, String borrowerName, ArrayList<String> isbnBooks) {

		if (available.get(bookIndex) == false) {
			return false;
		}

		available.set(bookIndex, false);
		borrowers.add(borrowerName);
		borrowedBooks.add(isbnBooks.get(bookIndex));

		return true;
	}

	public static boolean returnBook(ArrayList<Boolean> available, ArrayList<String> borrowers, ArrayList<String> borrowedBooks, String isbnNumber) {

		int index = borrowedBooks.indexOf(isbnNumber);

		if (index < 0) {
			return false;
		}
		available.set(index, true);

		borrowedBooks.remove(index);
		borrowers.remove(index);

		return true;
	}

	public static void displayBorrowedBooks(ArrayList<String> borrowers, ArrayList<String> borrowedBooks) {
		for (int index = 0; index < borrowers.size(); index++) {
			System.out.printf("%-20s has borrowed: %s", borrowers.get(index), borrowedBooks.get(index));
		}
	}

	// Användarhantering - Alexander
	public static void registerUser(
		ArrayList<String> userNames,
		ArrayList<String> phoneNumbers,
		String newUserName,
		String newUserPhoneNumber
	) {
		userNames.add(newUserName);
		phoneNumbers.add(newUserPhoneNumber);
		System.out.printf("Registered new user as %s (%s)!", newUserName, newUserPhoneNumber);
	}

	public static void displayAllUsers(ArrayList<String> userNames, ArrayList<String> phoneNumbers) {
		for (int i = 0; i < userNames.size(); i++)
			System.out.printf("%s - %s", userNames.get(i), phoneNumbers.get(i));
	}

	// searchUser -> getUserID
	public static int getUserID(ArrayList<String> userNames, String search) {
		for (int i = 0; i < userNames.size(); i++)
			if (userNames.get(i).equals(search))
				return i;

		return -1;
	}

	// Från James
	public static int countAvailableBooks(ArrayList<Boolean> Available) {
		int count = 0;
		for (Boolean aBoolean : Available) {
			if (aBoolean) {
				count++;
			}
		}
		return count;
	}

	public static int countBorrowedBooks(ArrayList<Boolean> Available) {
		int count = 0;
		for (Boolean aBoolean : Available) {
			if (!aBoolean) {
				count++;
			}
		}
		return count;
	}

	public static void displayLibraryStatistics(ArrayList<String> titles, ArrayList<Boolean> available, ArrayList<String> userNames) {
		//assuming 1-1 corresponding index positions...
		out.println("ENTRY\tTITLE\tAVAILABLE");
		for (int i = 0; i < titles.size(); i++) {
			out.println(i + "\t" + titles.get(i) + "\t" + available.get(i));
		}
		out.println("USER REGISTRY:");
		for (String user : userNames) {
			out.println(user);
		}
	}
}
