/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pbo.prak5;
import java.util.Scanner;

/**
 *
 * @Created By Nadya Annisa Juventina 21343060
 */
public class Scanner1 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Masukan nama lengkap : ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");      
        int NIM = in.nextInt();
        
        System.out.print("Masukan Nilai: ");   
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : " + nama +
                            "\nNim :" + NIM +
                            "\nNilai : " + nilai );
    }
}
