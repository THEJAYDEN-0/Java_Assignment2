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
//Name:-Gopal Shar,a
public class Q1_1 {
    class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num=0;
      int r=0;
      System.out.println("Enter:");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      while( num != 0 )
      {
          r=r*10;
          r=r+num%10;
          num=num/10;
      }
      System.out.println("Reverse of input number is: "+r);
   }
}
}
