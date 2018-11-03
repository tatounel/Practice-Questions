/***
A valid pin has to be either four or six integers
**/




class Challenge {
  public static boolean validPin( String input ) {
      boolean isValid = true;
      
      if(input.equals("")){
         isValid = false;
      }
      
      if(!(input.length()==4 || input.length()==6)){
          isValid = false;
      }
      
      try{
          Integer.parseInt(input);
      }
      catch(NumberFormatException e){
          isValid = false;
      }
      
      return isValid;
  }
}
