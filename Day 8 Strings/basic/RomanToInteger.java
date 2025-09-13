import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static int RomanToInteger(String s){
    Map<Character,Integer> map=new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int result=0;
    int prev=0;
    for(int i=s.length()-1;i>=0;i--){
          int current=map.get(s.charAt(i));
          if(current>prev){
            result+=current;
          }
          else{
            result-=current;
          }
          prev=current;

    }return result;

  }
  public static void main(String[] args) {
      String str="XIV";
      System.out.println(RomanToInteger(str));
  }


































    // public static int romanToInt(String s) {
    //     // Mapping of Roman numerals to their integer values
    //     Map<Character, Integer> romanMap = new HashMap<>();
    //     romanMap.put('I', 1);
    //     romanMap.put('V', 5);
    //     romanMap.put('X', 10);
    //     romanMap.put('L', 50);
    //     romanMap.put('C', 100);
    //     romanMap.put('D', 500);
    //     romanMap.put('M', 1000);

    //     int result = 0;
    //     int prevValue = 0;

    //     // Loop through the string from the end to the beginning
    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         int currentValue = romanMap.get(s.charAt(i));

    //         // If the current value is less than the previous one, subtract it
    //         if (currentValue < prevValue) {
    //             result -= currentValue;
    //         } else {
    //             // Otherwise, add it to the result
    //             result += currentValue;
    //         }

    //         // Update the previous value for the next iteration
    //         prevValue = currentValue;
    //     }

    //     return result;
    // }

    // public static void main(String[] args) {
    //     // Test the function with a sample Roman numeral
    //     String romanNumeral = "XI";  // Example: 1994
    //     int integerValue = romanToInt(romanNumeral);
    //     System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);
    // }
}
