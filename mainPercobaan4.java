/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivalditoIlhamPratama.relasiclass.percobaan4;

/**
 *
 * @author WINDOWS 11
 */
public class mainPercobaan4 {
    public static void main(String args[]){
        Penumpang p = new Penumpang ("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong ("A", 10);
        gerbong.setPenumpang(p,1);
        System.out.println(gerbong.info());
    }
}
