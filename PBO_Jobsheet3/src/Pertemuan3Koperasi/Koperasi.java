/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3Koperasi;

/**
 *
 * @author WINDOWS 11
 */
public class Koperasi {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlah;
    private int angsur;
    
  
  Koperasi (String noKtp, String nama, int limitPinjam){
      this.noKtp = noKtp;
      this.nama = nama;
      this.limitPinjaman = limitPinjam;
      
  }
  public String getnama(){
      return nama;
  }
  public int getlimitPinjaman(){
      return limitPinjaman;
  }
    public void pinjam(int jumlah){
      if(jumlah > limitPinjaman){
          System.out.println("Maaf,jumlah pinjaman melebihi limit");
      }else{
          this.jumlah = jumlah;
      }
  }
  
  public int getJumlahPinjaman(){
      jumlah = jumlah - angsur;
      return jumlah;
  }
  public void angsur(int angsur1){
            if(angsur >=  0.1 * jumlah ){
                jumlah -= angsur;
            }else{
                System.out.println("Maaf Angsuran Anda Kurang");
            }
        }
}

