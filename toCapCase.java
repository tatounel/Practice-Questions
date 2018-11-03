/***
Input: pineapple deserves to go on pizza
Output: Pineapple Deserves To Go On Pizza
**/


public class CapCase {

	public String toCapCase(String phrase) {
		// TODO put your code below this comment
        if(phrase==null || phrase.equals(""))
            return null;
        
        char[] tempArray = phrase.toCharArray();
        
        tempArray[0] = Character.toUpperCase(tempArray[0]);

        for(int i=0; i<tempArray.length; i++){
            if(tempArray[i]==' '){
                tempArray[i+1] = Character.toUpperCase(tempArray[i+1]);
            }
        }
        return String.valueOf(tempArray);
  
    }

}
