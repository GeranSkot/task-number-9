package com.Aleksey;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("enter the number N: ");
        Scanner sc = new Scanner(System.in);
        int wow = sc.nextInt();
        int sum = 0;

        for(int i = 0; i <= wow; i++){
            if(i % 2 == 0) {
                sum += i;
            }
        }


        System.out.println("sum of the sequence is... " + sum);



        /*System.out.println("Введите количесвто охватываемых чисел ");
        int n;
        if (n % 2 != 0) {
            System.out.println("Invalid Input");
            return -1;
        }

        int sum = 0, count = 0;
        while (n >= 2) {

            // count even numbers
            count++;

            // store the sum of even numbers
            sum += n;

            n = n - 2;
        }
        return sum / count;
    }

    // driver function
    public static void main (String args[]) {
        Scanner wow = new Scanner(System.in);
        int N = wow.nextInt();
        System.out.println(n);*/
        /*List<Integer> evenNumbers = new ArrayList<>();

        int inception = 1;
        int sum = 0;

        while (evenNumbers.size() <= N) {
            if(inception % 2 == 0) {
                evenNumbers.add(inception);
                sum = sum + inception;
            }
            inception++;
        }

        System.out.print("Четные числа из: " + N);
        for (Integer evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
        System.out.println("\nСумма равна " + sum);*/
    }
}
