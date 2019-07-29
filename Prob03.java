import java.util.Scanner;
public class Prob03 {
  
  
  public static void main(String[] args) { 
    try{
      Scanner input = new Scanner(System.in);
      int testCases = Integer.parseInt(input.nextLine());
      //String[] arr = new String[r];
      for(int testcase = 0; testcase < testCases; testcase++) {
        String input1 = input.nextLine();
        int index = input1.indexOf(" ");
        String num1 = input1.substring(0,index);
        String num2 = input1.substring(index+1,input1.length());
        if(num1.equals("false")&&num2.equals("false"))
        {
          System.out.println("true");
        }
        else if(num1.equals("true")&&num2.equals("true"))
        {
          System.out.println("true");
        }
        else
        {
          System.out.println("false");
        }
      }
    }
    finally{}
  
  }
  
  /* ADD YOUR CODE HERE */
  
}
