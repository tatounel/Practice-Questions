/**
 * You are provided a string containing a list of positive integers separated by a space (" "). Take each value and calculate the sum of its digits, which we call it's "weight". Then return the list in ascending order by weight, as a string joined by a space.

For example 99 will have "weight" 18, 100 will have "weight"
1 so in the ouput 100 will come before 99.

Example:

"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
"100 180 90 56 65 74 68 86 99"

When two numbers have the same "weight", let's consider them to be strings and not numbers:

100 is before 180 because its "weight" (1) is less than the one of 180 (9)
and 180 is before 90 since, having the same "weight" (9) it comes before as a string.

All numbers in the list are positive integers and the list can be empty.
 **/
 
 public class WeightSort {
	
	public static String orderWeight(String strng) {
        if(strng.equals(""))
            return "";
        
        String[] s = strng.split(" ");
        
        if(s.length == 1)
            return strng;
        
        // parallel arrays
        int[] tempArray =  new int[s.length];
        for(int i=0; i<s.length; i++) {
            try{
        	tempArray[i] = Integer.parseInt(s[i]);
            }
            catch(NumberFormatException e){
                return strng;
            }
        }
        int[] weightArray = new int[tempArray.length];
        
        //find weight
        for(int i=0; i<tempArray.length; i++){
            int weight = 0;
            int temp = tempArray[i];
            while (temp > 0) {
                weight += temp % 10;
                temp = temp / 10;
            }
            
            weightArray[i] = weight;

        }
        
        //sort both arrays by increasing weight
        int n = weightArray.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) {
                int compare =String.valueOf(tempArray[j]).compareTo(String.valueOf(tempArray[j+1]));

                if (weightArray[j] > weightArray[j+1] || (weightArray[j] == weightArray[j+1] && compare > 0))
                { 
                    // swap temp and weightArray[i] 
                    int temp = weightArray[j]; 
                    weightArray[j] = weightArray[j+1]; 
                    weightArray[j+1] = temp; 
                    
                    //swap temp2 and tempArray[i]
                    int temp2 = tempArray[j]; 
                    tempArray[j] = tempArray[j+1]; 
                    tempArray[j+1] = temp2; 
                } 
             }
        
        String result = "";
        for(int i=0; i<tempArray.length; i++){
            //System.out.println(tempArray[i]);
            result += tempArray[i];
            if(i!=tempArray.length-1){
                result += " ";
            }
        }
        return result;
	}
    
   
}
