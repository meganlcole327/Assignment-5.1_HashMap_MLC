import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Megan Cole
 * CS 215 
 * ASSIGNMENT 5.1 Hash Maps
 */

/**
 * Class loads, prints, and searches for words in the hash map
 */
public class Dictionary {
	
	/**
	 * Create hash map
	 */
	
	private HashMap<String, String> dictionary;
	
	
	/**
	 * Define the constructor 
	 */
	
	public Dictionary() {
		dictionary = new HashMap<>();
	} //end constructor
	
	/** 
	 * Loads the dictionary from a CSV file
	 * CSV file has 2 columns (word, definition)
	 * @param fileName - Path to CSV file
	 */
	
	public void loadDictionary(String fileName) {
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
					String[] parts = line.split(",", 2);
					if (parts.length == 2) {
						String word = parts[0].trim();
						String definition = parts[1].trim();
						dictionary.put(word, definition);
					}
				}
				scanner.close();
			} catch (FileNotFoundException error) {
			System.out.println("File not found: " + fileName);
		}
	} //end loadDictionary
	
	/**
	 * Print all the words and corresponding definition from the dictionary
	 */
	
	public void printDictionary() {
		for (String word : dictionary.keySet()) {
			System.out.println("Word " + word + "Definition: " + dictionary.get(word));
		}
	} //end printDictionary
	
	/**
	 * Searches for a word in the dictionary and prints its definition and hashKey
	 * @parm word - The word to search for
	 */
	
	public void searchDictionary(String word) {
		if (dictionary.containsKey(word)) {
			String definition = dictionary.get(word);
			int hashKey = word.hashCode();
			System.out.println("Word: " + word);
			System.out.println("Definition: " + definition);
			System.out.println("Hash Key: " + hashKey);
		} else {
			System.out.println("The following word was not found in the dictionary: " + word);
		}
	} //end searchDictionary
	

} //end class
