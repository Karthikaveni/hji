# hji
import java.io.*;
import java.util.*;
public class ReverseInteger{
  public static void main(String args[])
  {
    int num=0;
    int reverse=0;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    
    System.out.println("Input your number and press enter:");
    while(num!=0)
    {
      
      reverse = reverse * 10;
      reverse = reverse + num%10;
      num = num/10;
    }
    System.out.println("Reverse of input number is: "+reverse);
  }
}
  
