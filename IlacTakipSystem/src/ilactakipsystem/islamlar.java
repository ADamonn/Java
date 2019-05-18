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
public interface islamlar {
    public void ilaceEkle(Ilac ilac);
    public void ilaceSatin(Ilac ilec);
    public void ilacSiralama(ArrayList arrayList);
    public void ilacArama (Ilac ilac);
    public void ilacArama (String SeriNumber);
    public void ilacSillme (Ilac ilac);
    public int ilacesayisi (Ilac ilac);
    
}