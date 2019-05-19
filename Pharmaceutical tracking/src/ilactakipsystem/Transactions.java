/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilactakipsystem;

import java.util.ArrayList;

/**
 *
 * @author ajohanson
 */
public interface Transactions {
    public void ilaceEkle(Medicine ilac);
    public void ilaceSatin(Medicine ilec);
    public void ilacSiralama(ArrayList arrayList);
    public void ilacArama (Medicine ilac);
    public void ilacArama (String SeriNumber);
    public void ilacSillme (Medicine ilac);
    public int ilacesayisi (Medicine ilac);
   
}