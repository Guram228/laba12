package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter IP address:");
        Scanner scanner1 = new Scanner(System.in);
        String ip = scanner1.nextLine();
        String input = ip;
        boolean result = input.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");
        if (result) {
            System.out.println("Ok");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C://laba12//Correct code.txt"))) {

                bw.write(ip);
            } catch (IOException ex) {

            }
        }

        else {
            System.out.println("Error");
        }
    }

}