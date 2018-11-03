/**
 * CISC. 3130 Data Structures
 * Prof. Katherine Chuang
 * MY9, Fall 2018
 * @author Tania Nelzy
 * 9/10/18
 */

import java.io.*;
import java.util.*;

public class Assignment1 {

	/**
	 * Process: takes in a string and passes it to 
	 * 			sortWord, then using a for loop
	 * 			checks each character and the one next
	 * 			to it to see if they're equal
	 * @param s: a String
	 * @return isUnique: boolean variable
	 */
    private static boolean isUniqueChar(String s){
        boolean isUnique = true;
        char[] sortedS = sortWord(s);
    	for(int i=0; i<sortedS.length-1; i++) {
    		if(sortedS[i+1] == sortedS[i])
    			isUnique = false;
    	}
        System.out.println(isUnique + "\n");
        return isUnique;
    }
    
    /**
     * Process: takes in a string, makes it all lowercase, 
     * 			then converts it to char array, passes it to
     * 			insertionSort
     * @param s: a String
     * @return c: array of characters
     */
    private static char[] sortWord(String s){
    	s = s.toLowerCase();
        char[] c = s.toCharArray();
        insertionSort(c);
        return c;
    }

    /**
     * Process: takes in a char array, compares each character
     * 			against those before it to see where it needs to go
     * @param word: char array
     */
    public static void insertionSort(char[] word) {
        if (word == null || word.length == 0)
            return;
        for (int i=0; i<word.length; i++) {
            char temp = word[i];
            int j = i;
            while (j>0 && word[j-1]>temp) {
                word[j] = word[j-1];
                j--;
            }
            word[j] = temp;
        }
        System.out.println(word);
        return;
    }

    public static void main(String[] args) throws FileNotFoundException {
        
    	//create scanner to read input from text file
    	Scanner scanner = new Scanner(new File("input.txt"));

        // read in words and determine whether it is composed of unique characters
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            isUniqueChar(s);
        }

      scanner.close();
    }
}
