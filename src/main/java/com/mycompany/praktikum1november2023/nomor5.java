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
public class nomor5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int golongan, masaKerja;
        double bonus = 0.0;
        
        System.out.println("Program menghitung bonus akhir tahun karyawan");
        System.out.print("masukan golongan (1, 2, 3, & 4) : ");
        golongan = in.nextInt();
        System.out.print("masukan masa kerja : ");
        masaKerja = in.nextInt();
        
        switch (golongan) {
            case 1 :
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.5;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.6;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 0.7;
                }
                break;
            case 2 :
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.6;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.7;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 0.8;
                }
                break;
            case 3 :
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.7;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.8;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 0.9;
                }
                break;
            case 4 :
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.8;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.9;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 1.0;
                }
                break;
            default: System.out.println("mboten enten, amergo input salah ");
        }
        System.out.println("_______________________________________");
        System.out.println("bonus akhir tahun anda sejumlah "+bonus*100+" % ");

    }
}
