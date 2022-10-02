/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author WINDOWS 11
 */
public class Pegawai {
    private String Nama;
    private String NIP;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private double TotalGaji;
    private int jumlahJamKerja;
    private int jumlahPegawai;
    
    
    Pegawai(String Nama, String NIP,int jumlahJamKerja){
        this.Nama = Nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jumlahJamKerja;
    
    }
    public void gajiPokok(){
        gajiPokok = 2000 * jumlahJamKerja;
    }
    public void lembur(){
        if(jumlahJamKerja > 7){
            lembur = (jumlahJamKerja - 7) * (1.5 * gajiPokok);
        }else{
        lembur = 0;
        }
    }
    public void uangMakan(){
        if(jumlahJamKerja >=8){
            uangMakan = 3500;
        }else{
            uangMakan = 0;
        }
    }
    public void transport(){
        if(jumlahJamKerja >= 9){
            transport = 4000;
        }else{
            transport = 0;
        }
    }
    
    public void cetakPenghasilan(){
        TotalGaji = uangMakan + lembur + transport + gajiPokok;
        System.out.println("==================");
        System.out.println("Penghasilan");
        System.out.println("==================");
        System.out.println("Uang Makan: " + uangMakan);
        System.out.println("Lembur : " + lembur);
        System.out.println("transport : " + transport);
        System.out.println("gajiPokok : " + gajiPokok);
        System.out.println("Total Gaji: " + TotalGaji);
    }
}

