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
public class Assistant extends User{

    String name, title;
    int age, id;
    public Assistant(String name, String title, int age, int id){
        super (title, name, age, id);
        
    }
}