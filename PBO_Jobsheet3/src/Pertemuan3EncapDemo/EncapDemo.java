/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3EncapDemo;

/**
 *
 * @author WINDOWS 11
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge > 30){ //nilai maksimum
            age = 30;
        }
        else if (newAge < 18){ //nilai minimal
            age = 18;
        }
        else{
            age = newAge;
        }
    }
}
