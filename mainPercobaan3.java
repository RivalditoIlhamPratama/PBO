/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivalditoIlhamPratama.relasiclass.percobaan3;

/**
 *
 * @author WINDOWS 11
 */
public class mainPercobaan3 {
    public static void main(String args[]){
        Pegawai masinis = new Pegawai("1234","Spongebob Squarepants");
        Pegawai asisten = new Pegawai("456", "Patrick");
        KeretaApi keretaapi = new KeretaApi("Gaya Baru","Bisnis", masinis,asisten );
        
        System.out.println(keretaapi.info());
    }
}
