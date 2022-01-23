/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
//Name:- Gopal Sharma
public class Q1 {
    class a
{
 public static void main(String args[])
 {
     int no;
 Scanner sc=new Scanner(System.in);
     System.out.println("Enter:");
     no=sc.nextInt();
 
     System.out.println("Sum of first "+no+" natural numbers = "+sum(no));
 }
 static int sum(int n)
 {
     if(n==0)
         return n;
     else 
         return (n+sum(n-1));
 }
}
}
