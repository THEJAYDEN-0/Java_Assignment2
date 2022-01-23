/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
// Name:Gopal Sharma
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
    Scanner x= new Scanner(System.in);
    double a;
    System.out.println("Enter the length and Breadth for Rectangle:");
    double l=x.nextDouble();
    double b=x.nextDouble();
    double area_r=l*b;
     System.out.println("Area of Rectangle:"+area_r);
     
    System.out.println("Enter the Side of Square:");
    a=x.nextDouble();
    double area_s=a*a;
    System.out.println("Area of Rectangle:"+area_s);
}
}
