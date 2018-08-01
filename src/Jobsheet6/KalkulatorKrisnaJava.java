/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;
import java.util.Scanner;
public class KalkulatorKrisnaJava {
    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);
        String pilihan;
        System.out.println("PILIHAN 1");
        System.out.print("Tentukan jenis operasi (tanpa spasi) : ");
        pilihan = tt.next();
      
        switch(pilihan){
            case "perkalian" :
                System.out.print("Masukkan angka : ");
                int angka1 =tt.nextInt();
                System.out.print("Masukkan angka lagi : "  );
                int angka2 =tt.nextInt();
                System.out.print(+angka1 + " X " +angka2 + " = ");
                int hasil = angka1 * angka2;
              break;
            case "pembagian" :
                System.out.print("Masukkan angka : ");
                int angka3 = tt.nextInt();
                System.out.print("Masukkan angka lagi : "  );
                int angka4 =tt.nextInt();
                System.out.print(+angka3 + " : " +angka4 + " = ");
                int hasil2 = angka3 / angka4;
                break;
            case "penjumlahan" :
                System.out.print("Masukkan angka : ");
                int angka5 = tt.nextInt();
                System.out.print("Masukkan angka lagi : ");
                int angka6 = tt.nextInt();
                System.out.print(+angka5 + " + " + angka6 + " = ");
                int hasil3 = angka5 + angka6;
                break;
            case "pengurangan" :
                System.out.print("Masukkan angka : ");
                int angka7 = tt.nextInt();
                System.out.print("Masukkan angka lagi : ");
                int angka8 = tt.nextInt();
                System.out.print(+angka7 + " - " + angka8 +" = ");
                int hasil4 = angka7 - angka8;
                break;
            case "sisahasilbagi" :
                System.out.print("Masukkan angka : ");
                int angka9 = tt.nextInt();
                System.out.print("Masukkan angka lagi : ");
                int angka10 = tt.nextInt();
                System.out.print(+angka9 + " + " + angka10 + " = ");
                int hasil5 = angka9 % angka10;
                System.out.println(hasil5);
                break;
            default:
                System.out.println("serah wes!!!");
                
                
            
          
               }
    }
    
}
