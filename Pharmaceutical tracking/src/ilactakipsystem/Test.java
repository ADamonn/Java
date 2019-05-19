/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilactakipsystem;

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

//String SeriNumber, String info, int refill,
//int expireydate, int Counter, boolean cencorship) {
        Medicine medicine1 = new Medicine("189qo", "panadol", 3, 50, 250, true);
        Medicine medicine2 = new Medicine("188qo", "Anazol", 3, 30, 200, true);
        Medicine medicine3 = new Medicine("187qo", "Brofen", 3, 50, 190, true);
        Medicine medicine4 = new Medicine("186qo", "Astemizole", 3, 40, 240, true);
        Medicine medicine5 = new Medicine("185qo", "Biaxin", 3, 60, 260, true);
//    (String location, String name, int storage, Doctor doktor, Assistant assistant, Patient patient) {

        Pharmacy pharmacy = new Pharmacy("gaziosmanpasa", "AliNizemEcsanisi", 10000, doctor, assistant, Patient);
        pharmacy.addmedicine(medicine1);
        pharmacy.addmedicine(medicine2);
        pharmacy.addmedicine(medicine3);
        pharmacy.addmedicine(medicine4);
        pharmacy.addmedicine(medicine5);
        int size = pharmacy.medicines.size();System.out.println("ljthtnotnon onr outbno wnoi bno  "+size);
        boolean ext = true;
        int count = 1;
        Scanner input = new Scanner(System.in);
        int asd;
        Medicine medicine = new Medicine();

        while (ext) {

            System.out.println();
            System.out.println("---------------------------------------------------------");
            System.out.println(
                    "       creat new Medicine ==> 0"
                    + "\n   Add Medicine ==>  1"
                    + " \n  Medicine Sale ==> 2 "
                    + "\n   Medicine sort ==> 3"
                    + "  \n Medicine Search ==> 4"
                    + " \n  Medicine Removen ==> 5 "
                    + "\n   Medicinecounter == > 6 "
                    + "\n   Medicines show == >  7");
            System.out.println();
            System.out.println(" write and Press 'Enter'...");
            System.out.println("---------------------------------------------------------");
            System.out.print("chose the Number  : ");
            asd = input.nextInt();
            System.out.println();
            if (asd == 0) {
                System.out.println();
                System.out.print("enter the serilnumber: ");
                medicine.setSeriNumber(input.next());
                System.out.print("Enter the info: ");
                medicine.setinfo(input.next());
                System.out.print("Enter the counter: ");
                medicine.setCounter(input.nextInt());
                System.out.print("Enter the Expireyeday : ");
                medicine.setexpireydate(input.nextInt());

                System.out.println("Enter the refill :");
                medicine.setrefill(input.nextInt());
                medicine.setcencorship(true);

                System.out.println("---------------------------------------------------------");
                //   pharmacy.addmedicine(medicine);
                System.out.print("chose the Number: ");

            } else if (asd == 1) {
                System.out.println();
                System.out.println("for adding plz  press Enter ..");
                System.out.println("---------------------------------------------------------");
                pharmacy.addmedicine(medicine);
                System.out.print("chose the Number: ");
                asd = input.nextInt();
            } else if (asd == 2) {
                System.out.print("Medicine  Sale: ");
                pharmacy.medicinesale(medicine);
                System.out.println("");
                System.out.print("chose the Number: ");
                asd = input.nextInt();

            } else if (asd == 3) {
                System.out.print("medicine  Sort: ");
                pharmacy.medicinesort(pharmacy.medicines);
                for (Medicine medicineler : pharmacy.medicines) {
                    System.out.println(medicineler.toString());
                }
                System.out.print("chose the Number: ");
                asd = input.nextInt();

            } else if (asd == 4) {
                System.out.print("medicine search : ");
                System.out.println("1 for serinumber , 2 for given medicine ");
                int c = input.nextInt();
                if (c == 1) {
                    System.out.println("enter the seri number  :");
                    pharmacy.medicinesearch(input.next());
                } else {
                    pharmacy.medicinesearch(medicine);

                }
                System.out.println("--------------------------------------");
            } else if (asd == 5) {
                System.out.print("medicine remove : ");
                pharmacy.medicineremove(medicine);
                System.out.println();
            } else if (asd == 6) {
                System.out.println("which medicine to need to to know his counter :");
                for (int i = 0; i < pharmacy.medicines.size(); i++) {
                    System.out.println(i + " : " + medicine.getinfo());
                }
                pharmacy.medicinecounter(medicine);
            } else if (asd == 7) {
                System.out.println(" Show medicine :");
                for (Medicine medicineler : pharmacy.medicines) {
                    System.out.println(medicineler.toString());
                }
                System.out.println();
            }

        }
    }

}
