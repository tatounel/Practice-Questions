/**
Write a function called validBraces that takes a string of braces, and determines if the order of the braces is valid. validBraces should return true if the string is valid, and false if it's invalid.

All input strings will be nonempty, and will only consist of open parentheses '(' , closed parentheses ')', open brackets '[', closed brackets ']', open curly braces '{' and closed curly braces '}'.

What is considered Valid?

A string of braces is considered valid if all braces are matched with the correct brace. For example:

'(){}[]' and '([{}])' would be considered valid, while '(}', '[(])', and '[({})](]' would be considered invalid.

**/


import java.util.*;

public class BraceChecker {

  public static boolean isValid(String braces) {
	      boolean valid = true;
	      Stack<Character> s = new Stack<Character>();
	      
	      for(int i=0; i<braces.length(); i++){
	          char ch = braces.charAt(i);
	          if(ch == '(' || ch == '{' || ch == '['){
	              s.push(ch);
	          }
	          else if(ch == ']') {
	                if(s.isEmpty() || s.pop() != '[') {
	                    return false;
	                }
	            } else if(ch == ')') {
	                if(s.isEmpty() || s.pop() != '(') {
	                    return false;
	                }           
	            } else if(ch == '}') {
	                if(s.isEmpty() || s.pop() != '{') {
	                    return false;
	                }
	            }
	      }
          if(!s.isEmpty())
              return false;
	      return valid;
  }

}
