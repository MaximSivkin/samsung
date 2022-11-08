package com.samsung;

import com.samsung.model.Pet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pets' count:");
        String a, b, c;
        int n = sc.nextInt();
        Pet[] arr = new Pet[n];
        for (int i = 0; i < n; i++) {
            System.out.println("pet's name: ");
            a = sc.next();
            System.out.println("b's owner: ");
            b = sc.next();
            System.out.println("pet's type: ");
            c = sc.next();
            arr[i] = new Pet(a, b, c);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("pet number" + (i + 1));
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}