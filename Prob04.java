import java.util.Scanner;
public class Prob04
{
  public static void main(String[] args) { 
    try{
      Scanner input = new Scanner(System.in);
      int testCases = Integer.parseInt(input.nextLine());
      for(int testcase = 0; testcase < testCases; testcase++) {
        String input1 = input.nextLine();
        int index = input1.indexOf(" ");
        int num1 = Integer.parseInt(input1.substring(0,index));
        String num2 = input1.substring(index+1,input1.length());
        if(num2.equals("false"))
        {
         if(num1<=60)
         {
           System.out.println("no ticket");
         }
         else if((num1>60)&&(num1<=80))
         {
           System.out.println("small ticket");
         }
         else
         {
           System.out.println("big ticket");
         }
        }
        else 
        {
          if(num1<=65)
         {
           System.out.println("no ticket");
         }
         else if((num1>65)&&(num1<=85))
         {
           System.out.println("small ticket");
         }
         else
         {
           System.out.println("big ticket");
         }
        }
       
      }
    }
    finally{}
  }
}