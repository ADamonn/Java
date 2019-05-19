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
    public void addmedicine(Medicine ilac);
    public void medicinesale(Medicine ilec);
    public void medicinesort(ArrayList<Medicine> arrayList);
    public void medicinesearch (Medicine ilac);
    public void medicinesearch (String SeriNumber);
    public void medicineremove (Medicine ilac);
    public int medicinecounter (Medicine ilac);
   
}