import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Prob01{
  public static void main(String args[]) throws IOException
  { 
    try{
      Scanner input = new Scanner(System.in);
      int testCases = Integer.parseInt(input.nextLine());
      //String[] arr = new String[r];
      for(int testcase = 0; testcase < testCases; testcase++) {
        System.out.println(input.nextLine().toLowerCase());
      }
    }
    finally{}
  }
}