/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivalditoIlhamPratama.relasiclass.percobaan3;

/**
 *
 * @author WINDOWS 11
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    
    public void setNama(String nama){
        this.nama = nama;
        
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    
    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }
    
     public String getNama(){
        return nama;
        
    }
    public String getKelas(){
        return kelas;
    }
    
    public Pegawai getMasinis(){
        return masinis;
    }
    
    public Pegawai getAsisten(){
        return asisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas+ "\n";
        info += "Masisinis : " + this.masinis+ "\n";
        info += "Asisten : " + this.asisten+ "\n";
        return info;
    }
}
   
