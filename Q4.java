/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
//Name:-Gopal Sharma
 import java.util.Scanner;    
public class Q4 {
 
   public static void main(String[] args) {
      String grade = null;
      System.out.print("Enter a number: ");  
      Scanner x=new Scanner(System.in); 
      int score=x.nextInt(); 
      switch(score/10) 
      {
        case 10:
        case 9:
           grade="O";
           break;
        case 8:
           grade="A1";
           break;
            case 7:
               grade="A2";
           break;
        case 6:
           grade="B1";
           break;
        case 5:
           grade="B2";
           break;
        case 4:
           grade="C1";
           break;
        case 3:
           grade="P";
           break;   
        default:
           grade="F";
           break;
      }
      System.out.println("Your Grade is  = " + grade);
   }
}

