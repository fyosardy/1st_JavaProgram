package com.dicoding.fundamental.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program Penjumahan Sangat Sederhana");
        int value = 0;
        int anothervalue = 0;
        try {
            System.out.print("Masukan Angka Pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka Kedua : ");
            anothervalue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        int resul = value + anothervalue;
        System.out.println("Hasilnya Adalah : " + resul);

    }
}
