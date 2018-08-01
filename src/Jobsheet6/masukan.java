/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class masukan {
    public static void main(String[] args){
        
    Scanner baca = new Scanner(System.in);
    
    int a, b;
    
    System.out.print("Masukkan nilai A : ");
    a = baca.nextInt();
    
    System.out.print(" Masukkan nilai B : ");
    b = baca.nextInt();
    
    System.out.println();
    System.out.println("Nilai variabel yang ada di program : ");
    System.out.println("a = " +a);
    System.out.println("b = " +b);
    }
    
    
}
