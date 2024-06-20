package practice;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("hii");
        Scanner age = new Scanner(System.in);
        int age1 = age.nextInt();
        System.out.println("age = "+age1);
        if (age1<18){
            System.out.println("You are teenager");
        }else if (age1>=18){
            System.out.println("you are adult");
        }else {
            System.out.println("u r "+age +"years old");
        }
    }
}
