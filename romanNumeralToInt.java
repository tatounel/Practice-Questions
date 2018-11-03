/**
Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.
**/
class Challenge {
  public static Integer decode( String roman ) {
      int result = 0;
      for(int i=0; i<roman.length(); i++){
          char ch = roman.charAt(i);
          switch(ch){
              case 'I':
                  if((i+1) < roman.length()){
                      if(roman.charAt(i+1) == 'V'){
                          result += 4;
                          i+=1;
                          break;
                      }
                      else if(roman.charAt(i+1) == 'X'){
                          result += 9;
                          i+=1;
                          break;
                      }
                      result += 1;
                  }
                  else{
                      result += 1;
                  }
                  break;
              case 'C':
                  if((i+1) < roman.length()){
                      if(roman.charAt(i+1) == 'D'){
                          result += 400;
                          i+=1;
                          break;
                      }
                      else if(roman.charAt(i+1) == 'M'){
                          result += 900;
                          i+=1;
                          break;
                      }
                      result += 100;
                  }
                  else{
                      result += 100;
                  }
                  break;
              case 'D':
                  result += 500;
                  break;
              case 'L':
                  result += 50;
                  break;
              case 'M':
                  result += 1000;
                  break;
              case 'V':
                  result += 5;
                  break;
              case 'X':
                  if((i+1) < roman.length()){
                      if(roman.charAt(i+1) == 'L'){
                          result += 40;
                          i+=1;
                          break;
                      }
                      else if(roman.charAt(i+1) == 'C'){
                          result += 90;
                          i+=1;
                          break;
                      }
                      result += 10;
                  }
                  else{
                      result += 10;
                  }
                  break;
              default: 
                  System.out.println ("Invalid char: " + ch);
                  break;
          }
      }
      return result;
  }
}
