import java.util.*;
public class Prob02{
  public static void main(String args[])
  { 
     
  
    try{
      Scanner input = new Scanner(System.in);
      int testCases = Integer.parseInt(input.nextLine());
     for(int testcase = 0; testcase < testCases; testcase++) {
        String input1 = input.nextLine();
        int index = input1.indexOf(" ");
        int num1 = Integer.parseInt(input1.substring(0,index));
        int num2 = Integer.parseInt(input1.substring(index+1,input1.length()));
        if(num1 == num2){
          System.out.println(num1*4);
        }
        else{
          System.out.println(num1+num2);
        }
      }
    }
    finally{}
  }
}