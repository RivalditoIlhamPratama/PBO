/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivalditoIlhamPratama.relasiclass.percobaan4;

/**
 *
 * @author WINDOWS 11
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
        
    }
    
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    
    public void setNama(String nama){
        this.nama =  nama;
    }
    
    public String getKtp(){
        return ktp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "ktp:"+this.ktp +"\n";
        info += "Nama:"+this.nama +"\n";
        return info;
    }
}
