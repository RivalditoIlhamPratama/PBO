/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3Koperasi;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 11
 */
public class TestKoperasi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Koperasi donny = new Koperasi("111333444", "donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getnama()); 
        System.out.println("Limit Pinjaman: " + donny.getlimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000..."); 
        donny.pinjam(10000000);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000..."); 
        donny.pinjam(4000000);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000"); 
        donny.angsur(1000000);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000"); 
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        
        System.out.println("Nama Anggota\t\t: " + donny.getnama());
        System.out.println("Limit Pinjaman\t\t" + donny.getlimitPinjaman());
        
        System.out.println("\npinjaman uang Rp. ");
        int uang = input.nextInt();
        donny.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp."+ donny.getJumlahPinjaman());
        
        System.out.println("\nPinjam uang: Rp.");
        uang = input.nextInt();
        donny.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp. "+ donny.getJumlahPinjaman());
        
        System.out.println("\nPinjam uang: Rp.");
        uang = input.nextInt();
        donny.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp. "+ donny.getJumlahPinjaman());
        
        System.out.println("\nPinjam uang: Rp.");
        uang = input.nextInt();
        donny.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp. "+ donny.getJumlahPinjaman());
        
    }
}
