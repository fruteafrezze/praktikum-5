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
public class nomor6 {
    public enum agama {
        HINDU, BUDDHA, YAHUDI, KATOLIK, KRISTEN,ISLAM
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        String namaAgama, kitabSuci = null, nabi = null;
        
        System.out.println("Program menentukan kitab suci dan nabi berdasarkan agama");
        System.out.println("""
                           1. Hindu
                           2. Buddha
                           3. Yahudi
                           4. Katolik
                           5. Kristen
                           6. Islam
                           """);
        System.out.print("masukan agama : ");
        namaAgama = in.nextLine().toUpperCase();
        agama hasilInput = agama.valueOf(namaAgama);
        
        switch (hasilInput) {
            case HINDU :
                kitabSuci = "veda";
                nabi = "-";
                break;
            case BUDDHA :
                kitabSuci = "Tripitaka";
                nabi = "Sidarta Gautama";
                break;
            case YAHUDI :
                kitabSuci = "Taurat";
                nabi = "Musa";
                break;
            case KATOLIK :
                kitabSuci = "Injil";
                nabi = "Kristus";
                break;
            case KRISTEN :
                kitabSuci = "Injil";
                nabi = "Kristus";
                break;
            case ISLAM :
                kitabSuci = "Al-Quran";
                nabi = "Muhammad SAW";
                break;
            default: System.out.println("input salah masbro");
        }
        System.out.println("kitab sucinya "+kitabSuci+" dan nabinya "+nabi); 
    }
}
