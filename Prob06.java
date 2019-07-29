import java.util.Scanner;
import java.text.NumberFormat;
public class Prob06
{
  public static void main(String[] args) { 
      try{
      Scanner input = new Scanner(System.in);
      int testCases = Integer.parseInt(input.nextLine());
     for(int testcase = 0; testcase < testCases; testcase++) {
       
        String input1 = input.nextLine();
        int radiusAdd = Integer.parseInt(input1);
        double radius = 6381+radiusAdd;
        System.out.println(6.3*radius);
      }
    }
    finally{}
  }
}
