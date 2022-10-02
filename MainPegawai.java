/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 11
 */
public class MainPegawai {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Pegawai PT XYZ");
        System.out.println("==============");
        
        System.out.println("");
        System.out.println("===================");
        System.out.print("Masukkan Jumlah Pegawai :");
        int jumlahPegawai = input.nextInt();
        
        for (int i=1; i<=jumlahPegawai;i++){
            
            System.out.print(+1+ "Nama : ");
            input.next();
            String Nama = input.nextLine();
            System.out.print("NIP : ");
            String NIP = input.nextLine();
            System.out.print("Jumlah Jam Kerja: ");
            int jumlahJamKerja = input.nextInt();
            System.out.println("====================");
            
            Pegawai pegawai = new Pegawai(Nama, NIP, jumlahJamKerja);
            System.out.println("");
         
            pegawai.gajiPokok();
            pegawai.lembur();
            pegawai.uangMakan();
            pegawai.transport();
            pegawai.cetakPenghasilan();
            System.out.println("=========================");
            System.out.println("");
        }
    }
}
 