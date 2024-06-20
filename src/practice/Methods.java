package practice;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        print("ajay",22);
        calculateSum();
    }
    public static void print(String name,int age){
        System.out.println("hello world");

        System.out.println("your name is "+name+" and your age is "+age);
    }
    public static void calculateSum(){
        System.out.println("enter the first number:");
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("enter the second number:");
//        Scanner sc = new Scanner(System.in);
        int num2= sc.nextInt();
        int c= num1+num2;
        System.out.println("Sum of num 1 and num2 is "+c);

    }
}
