package com.dicoding.javafundamental.basic;

import com.dicoding.fundamental.basic.kendaraan.Kereta;
import com.dicoding.fundamental.basic.kendaraan.Mobil;
import com.dicoding.fundamental.basic.kendaraan.Motor;
import com.dicoding.fundamental.basic.musik.Gitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gitar.bunyi();
        
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
    }
}