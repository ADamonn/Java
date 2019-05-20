/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilactakipsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Test {

    public static void main(String[] args) {
        User doctor = new Doctor("AliNizem", "Pharmacist", 19999, 27);
        User assistant = new Assistant("Sama", "Assistant", 19998, 24);
        User Patient = new Patient("Mehmet", "studnte", "headache", 19997, 20);
        ArrayList<Medicine> medicineler = new ArrayList<>();
//String SeriNumber, String info, int refill,
//int expireydate, int Counter, boolean cencorship) {
        Medicine medicine1 = new Medicine(" 189qo", " panadol", 3, 50, 250, true);
        Medicine medicine2 = new Medicine(" 188qo", " Anazol", 3, 30, 200, true);
        Medicine medicine3 = new Medicine(" 187qo", " Brofen", 3, 50, 190, true);
        Medicine medicine4 = new Medicine(" 186qo", " Astemizole", 3, 40, 240, true);
        Medicine medicine5 = new Medicine(" 185qo", " Biaxin", 3, 60, 260, true);

        medicineler.add(medicine1);
        medicineler.add(medicine2);
        medicineler.add(medicine3);
        medicineler.add(medicine4);
        medicineler.add(medicine5);
//    (String location, String name, int storage, Doctor doktor, Assistant assistant, Patient patient) {

        Pharmacy pharmacy = new Pharmacy("gaziosmanpasa", "AliNizemEcsanisi", 10000, doctor, assistant, Patient);
        pharmacy.medicines.add(medicine1);
        //  pharmacy.addmedicine(medicine1);
        pharmacy.addmedicine(medicine2);
        pharmacy.addmedicine(medicine3);
        pharmacy.addmedicine(medicine4);
        pharmacy.addmedicine(medicine5);
        boolean ext = true;
        Scanner input = new Scanner(System.in);
        int asd;
        Medicine medicine = new Medicine();

        while (ext) {

            System.out.println();
            System.out.println("---------------------------------------------------------");
            System.out.println(
                    "  Add a new Created Medicine ==> 0"
                    + "\n  Add Medicine ==>  1"
                    + " \n  Sale ==> 2 "
                    + "\n  Sort ==> 3"
                    + "  \n  Search ==> 4"
                    + "\n  Remove ==> 5 "
                    + "\n  Medicine counter == > 6 "
                    + "\n  Show Medicines == >  7");
            System.out.println();
            System.out.println(" write and Press 'Enter'...");
            System.out.println("---------------------------------------------------------");
            System.out.print("chose the Number: ");
            asd = input.nextInt();
            System.out.println();

            switch (asd) {
                case 0:
                    System.out.println();
                    System.out.print("Enter the Serial number: ");
                    medicine.setserialnumber(input.next());
                    System.out.print("Enter the Info: ");
                    medicine.setinfo(input.next());
                    System.out.print("Enter the Counter: ");
                    medicine.setCounter(input.nextInt());
                    System.out.print("Enter the Expiry date: ");
                    medicine.setexpireydate(input.nextInt());
                    System.out.println("Enter the Refill: ");
                    medicine.setrefill(input.nextInt());
                    medicine.setcencorship(true);
                    medicineler.add(medicine);
                    System.out.println("---------------------------------------------------------");
                    //   pharmacy.addmedicine(medicine);
                    System.out.print("chose the Number: ");
                    break;
                case 1:
                    System.out.println();
                    System.out.println("for adding plz  press Enter ..");
                    System.out.println("---------------------------------------------------------");
                         for (int i = 0; i < medicineler.size(); i++) {
                            System.out.println(i + " : " + medicineler.get(i).getinfo());
                        }
                        System.out.println("plz select the medicine");
                        pharmacy.addmedicine(medicineler.get(input.nextInt()));
                        System.out.println("the new Medicine is successfully Added");
                    break;
                case 2:
                    System.out.print("Medicine  Sale: ");
                    System.out.println("which medicine you want to Sale: ");
                    for (int i = 0; i < pharmacy.medicines.size(); i++) {
                        System.out.println(i + " : " + pharmacy.medicines.get(i).getinfo());
                    }
                    System.out.println("plz select the medicine");
                    pharmacy.medicinesale(pharmacy.medicines.get(input.nextInt()));

                    System.out.println("the Medicine is successfully sold");
                    break;
                case 3:
                    System.out.print("medicine Sort: ");
                    pharmacy.medicinesort(pharmacy.medicines);
                    for (Medicine medicinelers : pharmacy.medicines) {
                        System.out.println(medicinelers.toString());
                    }
                    break;
                case 4:
                    System.out.print("medicine search : ");
                    System.out.println("1 for serial number , 2 for given medicine ");
                    int c = input.nextInt();
                    if (c == 1) {
                        System.out.println("enter the Serial number: ");
                        pharmacy.medicinesearch(input.next());

                    } else {
                        pharmacy.medicinesearch(medicine);

                    }
                    System.out.println("--------------------------------------");
                    break;
                case 5:
                    System.out.print("medicine remove: ");
                    System.out.println("which Medicine you want to remove? ");
                    for (int i = 0; i < pharmacy.medicines.size(); i++) {
                        System.out.println(i + " : " + pharmacy.medicines.get(i).getinfo());
                    }
                    System.out.println("plz select the Medicine");
                    pharmacy.medicineremove(pharmacy.medicines.get(input.nextInt()));
                    System.out.println();
                    break;
                case 6:
                    System.out.println("which medicine's Counter: ");
                    for (int i = 0; i < pharmacy.medicines.size(); i++) {
                        System.out.println(i + " : " + pharmacy.medicines.get(i).getinfo());
                    }
                    System.out.println("plz select the Medicine");
                    System.out.println("the counter is: " + pharmacy.medicinecounter(pharmacy.medicines.get(input.nextInt())));
                    break;
                case 7:
                    System.out.println(" Show the Medicine: ");
                    for (Medicine medicinelers : pharmacy.medicines) {
                        System.out.println(medicinelers.toString());
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("404... Enter 0-7 only");
                    break;

            }
        }

    }
}
