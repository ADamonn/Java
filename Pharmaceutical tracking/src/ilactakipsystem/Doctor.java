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
public class Doctor extends User {

    String name, title;
    int id, age;
    
    public Doctor(String name, String title, int id, int age) {
        super(name, title, id, age);
        
    }
}
