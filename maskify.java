/**
mask everything but the last four characters
good for credit card info...etc.
Example:
Input: 4116 7789 0284 2134
Output: #### #### #### 2134
**/


class Challenge {
  public static String maskify( String cc ) {
      if(cc.equals("")){
          return "";
      }
      if(cc.length() <= 4){
          return cc;
      }
      String result = "";
     
      for(int i=0; i<cc.length()-4; i++){
          result += "#";
      }
      result += cc.substring(cc.length()-4);
      
      return result;
  }
}
