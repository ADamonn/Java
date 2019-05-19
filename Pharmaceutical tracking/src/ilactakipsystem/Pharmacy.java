/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilactakipsystem;

import java.util.ArrayList;

/**
 *
 * @author Toshiba
 */
public class Pharmacy implements Transactions {

    String location, name, date;
    int storage;
    Doctor Doktor;
    ArrayList<Medicine> medicines = new ArrayList<>();

    @Override
    public void ilaceEkle(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getSeriNumber().equals(medicine.getSeriNumber())) {
                found = false;
            } else {
                found = true;
            }
        }
        if (found) {
            medicines.add(medicine);
        } else {
            System.out.println("the medicine is already added");
        }
    }

    @Override
    public void ilaceSatin(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getSeriNumber().equals(medicine.getSeriNumber())) {
                found = false;
            } else {
                found = true;
            }
        }
        if (found == false) {
            medicine.setCaunter(medicine.getCaunter() - 1);
        }
    }

    private void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void ilacSiralama(ArrayList<Medicine> arrayList) {
        Medicine arrayMedicine[]= (Medicine[]) arrayList.toArray();
        
    }

    @Override
    public void ilacArama(Medicine medicine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ilacArama(String SeriNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ilacSillme(Medicine medicine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ilacesayisi(Medicine medicine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
