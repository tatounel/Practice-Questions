/**
 * CISC. 3130 Data Structures
 * Prof. Katherine Chuang
 * MY9, Fall 2018
 * @author Tania Nelzy
 * 9/30/18
 */


import java.util.*;
import java.io.*;

public class Assignment2_LinkedList_Palindrome {

	

	/**
	 * Process: takes in a LinkedList and creates a stack 
	 * 			and iterator, pushes each item in list to stack,
	 * 			pops out last half and compares it to first half of
	 * 			list, sets isPalindrome to false if they don't match
	 * @param s: a LinkedList
	 * @return isPalindrome: boolean variable
	 */
	public static boolean isPalindrome(LinkedList ll) {
		Stack stack = new Stack();
		Iterator itr = ll.iterator();
		boolean isPalindrome = true;
		
		while(itr.hasNext()) {
			System.out.print(stack.push(itr.next()) + " ");
		}
		System.out.println();
		
        for (int i = 0; i < ll.size()/2; i++) {
            if(!stack.pop().equals(ll.get(i))) {
            	isPalindrome = false;
            }
        }
        
        return isPalindrome;
        
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		//create scanner to read input from text file
    	Scanner scanner = new Scanner(new File("linkedlist_palindrome_input.txt"));
    	int i=0;
		LinkedList llist = new LinkedList();

        // read in data line by line and determine whether it is palindrome
        while (scanner.hasNext()) {
    		llist.add(scanner.next());
    		i++;
    		if(i==5) {
                System.out.println(isPalindrome(llist) + "\n");
                llist.clear();
                i=0;
    		}
        }

        scanner.close();
		
	}
	
	
}


/*** INPUT FILE
"hi" "hello" "goodbye" "hello" "hi"
"hi" "hello" "goodbye" "hello" "hiya"
0 1 2 1 0
0 1 2 1 1
101.1 101.1 201.1 101.1 101.1
750.2 749.57 789.92 712.23 765.90
h a n a h
t a n i a
**/
