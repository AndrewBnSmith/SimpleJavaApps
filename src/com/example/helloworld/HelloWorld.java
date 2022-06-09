package com.example.helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Racer Times Program");

        System.out.println("What was Alice's time?");
        double aliceTime = sc.nextDouble();

        System.out.println("What was Bobby's time?");
        double bobbyTime = sc.nextDouble();

        if(aliceTime < bobbyTime){
            System.out.println("Bobby was the fastest");
        } else if (aliceTime == bobbyTime) {
            System.out.print("TIE!");

        } else{
            System.out.print("Alice was the fastest");
        }

    }
}



