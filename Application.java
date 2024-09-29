/**
 * @author Megan Cole
 * CS 215 
 * ASSIGNMENT 5.1 Hash Maps
 */

/**
 * Application class tests the Dictionary and searchDictionary classes
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Create a Dictionary object
		 */
		
		Dictionary dictionary = new Dictionary();
		
		/**
		 * Load the dictionary from the CSV file
		 */
		
		dictionary.loadDictionary("DictionaryWordValuePairs.csv");
		
		
		/**
		 * Print each word and their definition
		 */
		System.out.println("Dictionary Contents: ");
		dictionary.printDictionary();
		
		
		System.out.println("\n==================================================\n");
		
		/**
		 * Search for specific words
		 */
		
		System.out.println("Let's search for a word in our dictionary: ");
		dictionary.searchDictionary("sea coal");
		dictionary.searchDictionary("meet"); 
		dictionary.searchDictionary("bootless");
		dictionary.searchDictionary("fishwife");
		dictionary.searchDictionary("invest");
		

	} //end main

} //end class
