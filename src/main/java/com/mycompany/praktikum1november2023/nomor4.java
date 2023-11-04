/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum1november2023;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double hargaBaju = 0;
        double totalHarga ;
        int jumlahBaju;
        String ukuranBaju;
        
        System.out.println("PROGRAM PERHITUNGAN TOTAL BELANJA");
        System.out.println("Daftar Harga Baju per buah dan Size");
        System.out.println("""
                           S    : Rp 30.000
                           M    : Rp 38.000
                           L    : Rp 45.000
                           XL   : Rp 50.000
                           XXL  : Rp 60.000
                           """);
        System.out.print("Masukan ukuran baju : ");
        ukuranBaju=in.nextLine();
        System.out.print("Masukan jumlah baju : ");
        jumlahBaju=in.nextInt();
        
        switch (ukuranBaju) {
            case "s" :
                hargaBaju = 30000;
                break;
            case "m":
                hargaBaju = 38000;
                break;
            case "l":
                hargaBaju = 45000;
                break;
            case "xl":
                hargaBaju = 50000;
                break;
            case "xxl":
                hargaBaju = 60000;
            default:
                System.out.println("input salah");
        }
        totalHarga = hargaBaju*jumlahBaju;
        System.out.println("total belanja anda sejumlah : "+totalHarga);
    }
}
