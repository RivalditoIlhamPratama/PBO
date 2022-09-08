/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author IF RIVALDITO
 */
public class Penjumlahan {
    public static void main(String args[]){
        int nim [] = {2,1,4,1,7,6,2,1,4,6};
        int jumlah = 0;
        for(int angka : nim){
            jumlah = jumlah + angka;
        }
        System.out.println("====== Hasil NIM setelah dijumlahkan =======");
        System.out.println("Total NIM : "+jumlah);
    }
}
