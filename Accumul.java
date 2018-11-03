/***
Input: tania
Output: T-Aa-Nnn-Iiii-Aaaaa
**/



public class Accumul {
    
    public static String accum(String s) {
        String result = "";
        s = s.toLowerCase();
        char[] tempArray = s.toCharArray();
        
        for(int i=0; i<tempArray.length; i++){
            result += Character.toUpperCase(tempArray[i]);
            
            for(int j=0; j<i; j++){
                result += tempArray[i];
            }
            
            if(i!=tempArray.length-1){
                result += "-";
            }
        }
        
        return result;
    }
}
