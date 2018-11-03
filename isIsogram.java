
/**isIsogram (similar to isUniqueCharacter
 * Task
An isogram is a word that has no repeating letters, consecutive or non-consecutive.

Implement a function that determines whether a string is an isogram. Assume an empty string is an isogram, and ignore letter case.

Examples
Input	Output	Comments
"Dermatoglyphics"	true	
"aba"	false	
"moOse"	false	Ignore letter case.
"ααβγδ"	false	Make sure to handle any characters
Documentation
isIsogram(str)
Parameters:
str: String
A string of characters.

Guaranteed Constraints:
The string will never be null or undefined.
The string may be empty (""), and may contain any character.
Returns: boolean
Return true if the string contains only unique characters (ignoring case), otherwise return false.
**/


class Challenge {
  public static boolean isIsogram( String str ) {
        boolean isUnique = true;
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        insertionSort(c);
    	for(int i=0; i<c.length-1; i++) {
    		if(c[i+1] == c[i])
    			isUnique = false;
    	}
        return isUnique;
  }
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
        return;
    }
    
    
}
