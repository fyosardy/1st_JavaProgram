package com.dicoding.fundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan Sangat Sederhana");
        System.out.print("Masukan Angka Pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        int anothervalue = scanner.nextInt();
        int result = value + anothervalue;
        System.out.println("Hasilnya Adalah : " + result);
    }
}
