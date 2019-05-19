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
public class Test {

    public static void main(String[] args) {
        User doctor = new Doctor("AliNizem", "Pharmacist", 19999, 27);
        User assistant = new Assistant("Sama", "Assistant", 19998, 24);
        User Patient = new Patient("Mehmet", "studnte", "headache", 19997, 20);

//String SeriNumber, String info, int refill,
//int expireydate, int Counter, boolean cencorship) {
        Medicine medicine1 = new Medicine("189qo", "panadol", 3, 50, 250, true);
        Medicine medicine2 = new Medicine("188qo", "Anazol", 3, 30, 200, true);
        Medicine medicine3 = new Medicine("187qo", "Brofen", 3, 50, 190, true);
        Medicine medicine4 = new Medicine("186qo", "Astemizole", 3, 40, 240, true);
        Medicine medicine5 = new Medicine("185qo", "Biaxin", 3, 60, 260, true);
//    (String location, String name, int storage, Doctor doktor, Assistant assistant, Patient patient) {

        Pharmacy pharmacy = new Pharmacy("gaziosmanpasa", "AliNizemEcsanisi", 10000, doctor, assistant, Patient);
        pharmacy.ilaceEkle(medicine1);
        pharmacy.ilaceEkle(medicine2);
        pharmacy.ilaceEkle(medicine3);
        pharmacy.ilaceEkle(medicine4);
        pharmacy.ilaceEkle(medicine5);
         boolean exit = true;
         
    
        
        
        
        
        
        
        
        
        
      
    }
}
