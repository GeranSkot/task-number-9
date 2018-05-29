package com.Aleksey;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("enter the number N: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for(int i = 0; i <= a; i++){
            if(i % 2 == 0) {
                b += i;
            }
        }
        System.out.println("sum of the sequence is... " + b);
    }
}
