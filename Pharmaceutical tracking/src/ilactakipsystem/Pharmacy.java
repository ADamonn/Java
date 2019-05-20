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

    String location, name;
    int storage;
    User doktor;
    User assistant;
    User patient;

    public Pharmacy(String location, String name, int storage, User doktor, User assistant, User patient) {
        this.location = location;
        this.name = name;
        this.storage = storage;
        this.doktor = doktor;
        this.assistant = assistant;
        this.patient = patient;
    }

    ArrayList<Medicine> medicines = new ArrayList<>();

    @Override
    public void addmedicine(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getserialnumber().equals(medicine.getserialnumber())) {
                found = false;
                break;
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
    public void medicinesale(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getserialnumber().equals(medicine.getserialnumber())) {
                found = false;
            } else {
                found = true;
            }
        }
        if (found == false) {
            System.out.println("the medicine is sold " + medicine.getCounter());

            medicine.setCounter(medicine.getCounter() - 1);
           System.out.println("conutet  " + medicine.getCounter());
        }
    }

    private void bubbleSort() {
        int n = medicines.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (medicines.get(j).getexpireydate() > medicines.get(j + 1).getexpireydate()) {
                    // swap arr[j+1] and arr[i] 
                    Medicine temp = medicines.get(j);
                    medicines.set(j, medicines.get(j + 1));
                    medicines.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public void medicinesort(ArrayList<Medicine> arrayList) {
        bubbleSort();
    }

    @Override
    public void medicinesearch(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i) == medicine) {
                found = true;
            } else {
                found = false;
            }
        }
        if (found) {
            System.out.println("the Medicine has been founded");
            System.out.println(medicine.toString());
        }
    }

    @Override
    public void medicinesearch(String serialnumber) {
        Medicine medicine = null;
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getserialnumber().equals(serialnumber)) {
                medicine = medicines.get(i);
                found = true;
            } else {
                found = false;
            }
        }
        if (found) {
            System.out.println("the Medicine hasbeen founded" + medicine.toString());
        } else {
            System.out.println("the Medicine not found ");
//            System.out.println("nerede "+medicine.getinfo()+" , "+medicine.getinfo()+" nerede "+medicine.getinfo()+" yok ya ");
        }
    }

    @Override
    public void medicineremove(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicine.getserialnumber().equals(medicines.get(i).getserialnumber())) {
                found = true;
            }
        }

        if (found) {
            medicines.remove(medicine);
            System.out.println("the medicine has been successfully removed");
        }
    }

    @Override
    public int medicinecounter(Medicine medicine) {
        boolean found = false;
        for (int i = 0; i < medicines.size(); i++) {
            if (medicine.getserialnumber().equals(medicines.get(i).getserialnumber())) {
                found = true;
            }
        }
        if (found) {
            return medicine.getCounter();
        }
        if (found) {

        }
        if (found) {
            return medicine.getCounter();
        }
        return 0;
    }
}
