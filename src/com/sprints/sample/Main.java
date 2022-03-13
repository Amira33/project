package com.sprints.sample;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {  // defination

	// write your code here

                int num1, num2, sum; // decliration
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter First Number: ");
                num1 = sc.nextInt();

                System.out.println("Enter Second Number: ");

                num2 = sc.nextInt(); // first


                sc.close();
                sum = num1 + num2;
                System.out.println("Sum of these numbers: "+sum);
            }
        }



