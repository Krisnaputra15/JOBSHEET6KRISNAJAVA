/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;
import java.io.Console;

/**
 *
 * @author ASUS
 */
public class ContohInputCOnsole {
    public static void main(String[] args){
        String nama;
        int usia;
        String alamat;
        
        Console con = System.console();
        System.out.print("inputkan nama anda : ");
        nama = con.readLine();
        System.out.println("inputkan usia : ");
        usia = Integer.parseInt(con.readLine());
        System.out.println("inputkan alamat anda : ");
        alamat = con.readLine();
        
        System.out.println("nama kamu adalah " +nama);
        System.out.println("saat ini kamu berusia " +usia);
        System.out.println("alamat kamu berada di " + alamat);
    }
}
