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
public class nomor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         int month;
        System.out.println("masukan bulan (1-12) : ");
        month=in.nextInt();
        String monthString;
        switch (month) {
            case 1:  System.out.println("bulan January");
                     System.out.println("jumlah hari : 31 hari");
                     break;
            case 2:  System.out.println("bulan February");
                     System.out.println("jumlah hari : 28 hari");
                     break;
            case 3:  System.out.println("bulan March");
                     System.out.println("jumlah hari : 31 hari");;
                     break;
            case 4:  System.out.println("bulan April");
                     System.out.println("jumlah hari : 30 hari");
                     break;
            case 5:  System.out.println("bulan May");
                     System.out.println("jumlah hari : 31 hari");
                     break;
            case 6:  System.out.println("bulan June");
                     System.out.println("jumlah hari : 30 hari");
                     break;
            case 7:  System.out.println("bulan July");
                     System.out.println("jumlah hari : 31 hari");
                     break;
            case 8:  System.out.println("bulan August");
                     System.out.println("jumlah hari : 31 hari");
                     break;
            case 9:  System.out.println("bulan september");
                     System.out.println("jumlah hari : 30 hari");
                     break;
            case 10: System.out.println("bulan Oktober");
                     System.out.println("jumlah hari : 31 hari");
                     break;
            case 11: System.out.println("bulan November");
                     System.out.println("jumlah hari : 30 hari");
                     break;
            case 12: System.out.println("bulan Desember");
                     System.out.println("jumlah hari : 31 hari");
                     break;
            default: monthString = "Invalid month";
                     break;
        }
    }
  
}
