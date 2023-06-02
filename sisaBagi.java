/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester2.sisaBagi;

import java.util.Scanner;

/**
 *
 * @author ichaww
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        boolean exit = false;
        
        while (!exit){
            
        System.out.println("=== Sisa Bagi ===");
        System.out.print("Masukkan angka : ");
        int angka = scan.nextInt();
        
        System.out.print("Mau kamu bagi sama angka berapa : ");
        int pembagi = scan.nextInt();
        
        System.out.println(" ");
        int sisaBagi = angka % pembagi;
        System.out.print("Hasil sisa bagi = " + sisaBagi);
        System.out.println("\n");
        
        }
    }
    
    
}
