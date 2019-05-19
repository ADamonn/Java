/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilactakipsystem;

/**
 *
 * @author Toshiba
 */
public class Patient extends User {

    String name, title, illness;
    int id, age;

    public Patient(String name, String title, String illness, int id, int age) {
        super(name, title, id, age);
        this.illness = illness;
        
    }
}
