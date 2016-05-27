import java.io.*;
import java.util.Scanner;
public class PosNeg
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=0;
if(sc.hasNext())
i=sc.nextInt();
 if(i<0)
 {
 System.out.println("The number is negative");
 }
 if(i>0)
 {
 System.out.println("The number is positive");
 }
 if(i==0)
 {
 System.out.println("Zero is neither positive nor negative");
 }
}
}