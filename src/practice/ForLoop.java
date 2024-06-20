package practice;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        System.out.println("hello loops");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i+=2){
            System.out.println(i);
        }
    }
}
