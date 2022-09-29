/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @Created By Nadya Annisa Juventina
 */
public class BufferedReader1 {
    public static void main(String [] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
       float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");
        
        try{
            System.out.print("Masukkan angka pertama :");
            a = dataIn.readLine();
            /* Data yang akan diproses aritmatika harus dikonversikan dulu 
            dari tipe data styring ke tipe data angka yang diperlukan.
            data yang diperoleh dari inputkan kelas Buffereade tipe datanya selalu String */
            angka1 = Float.parseFloat(a); //konversi dari string ke float
            
            System.out.print("Masukkan angka kedua:");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b); //konversi dari string ke float
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah :" + jumlah);
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
    }  
}
