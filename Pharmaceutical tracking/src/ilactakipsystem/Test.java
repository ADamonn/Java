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
        boolean ext = true;
        int count = 1;
        Scanner input = new Scanner(System.in);
        Medicine medicine =new Medicine();
        System.out.print("Adınızı Giriniz : ");
        k1.setAdi(input.next());
        System.out.print("Soyadınızı Giriniz : ");
        k1.setSoyadi(input.next());
        System.out.print("Adresinizi Giriniz : ");
        k1.setAdres(input.next());
        System.out.print("Telinizi Giriniz : ");
        k1.setTelNo(input.next());
        int asd;
        while (ext) {
            System.out.println();
            System.out.println("---------------------------------------------------------");
            System.out.println(" Kişisel bilgilerinizi Düzenlemek için 1, \n Şikayet İçin 2, \n Tüm Şikayetlerini Görmek İçin 3,  \n Tüm Şikayet Sayısı için 4 \n Programdan Çıkmak için 5");
            System.out.println();
            System.out.println("yazıp 'Enter'a basınız...");
            System.out.println("---------------------------------------------------------");
            System.out.print("Seçenek Numarasını Giriniz : ");
            asd = input.nextInt();
            System.out.println();
            if (asd == 1) {
                System.out.println("Neyi Düzenlemek İstersiniz? ");
                System.out.println(" Adınızı düzenlemek için 1, \n Soyadınızı düzenlemek için 2, \n Adresinizi düzenlemek için 3, \n Tel. No'nuzu düzenlemek için 4");
                System.out.println();
                System.out.println("yazıp 'Enter'a basınız...");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seçenek Numarasını Giriniz: ");
                asd = input.nextInt();
                if (asd == 1) {
                    System.out.print("Adınızı düzenleyiniz: ");
                    k1.setAdi(input.next());
                    System.out.println("İsminiz düzenlendi ----> " + k1.getAdi());
//                  System.out.println("Yeni Adınız: " + ""+k1.adi+"");
                } else if (asd == 2) {
                    System.out.print("Soyadınızı düzenleyiniz: ");
                    k1.setSoyadi(input.next());
                    System.out.println("Soyadınız düzenlendi ----> " + k1.getSoyadi());

                } else if (asd == 3) {
                    System.out.print("Adresinizi düzenleyiniz: ");
                    k1.setAdres(input.next());
                    System.out.println("Adresiniz düzenlendi ----> " + k1.getAdres());

                } else if (asd == 4) {
                    System.out.print("Tel.No'nuzu düzenleyiniz: ");
                    k1.setTelNo(input.next());
                    System.out.println("Tel. No.'nuz düzenlendi ----> " + k1.getTelNo());
                    System.out.println("Yeni Tel No.'nuz: " + k1.getTelNo());
                }

            } else if (asd == 4) {

                getToplamSikayetSayisi();
                
            } else if (asd == 2) {

                System.out.println("Şikayet Edilecek firma bilgilerini giriniz. \n");
                Sirket sirket = new Sirket();
                System.out.print("Firma Adı : ");
                sirket.setSirketAdi(input.next());
                System.out.print("Firma Sektörü : ");
                sirket.setSektor(input.next());

                System.out.print("Şikayet Bilgileri giriniz : \n\n");

                System.out.print("Şikayet Konusu : ");
                String konu = input.next();
                System.out.print("Şikayet Açıklama : ");
                String aciklama = input.next();

                Sikayet sikayet = new Sikayet(k1, sirket, konu, aciklama, count);

                sikayet.geriBildirimdeBulun(sikayet);

            } else if (asd == 3) {

                for (int i = 0; i < db.size(); i++) {
                    System.out.println("--------------------------------");
                    System.out.print("Şikayeti yapılan şirket : ");
                    System.out.println(((Sikayet) (db.get(i))).getSirket().getSirketAdi());
                    System.out.print("Şikayeti yapılan şirketin sektörü : ");
                    System.out.println(((Sikayet) db.get(i)).getSirket().getSektor());

                    System.out.print("Şikayet konusu: ");
                    System.out.println(((Sikayet) db.get(i)).getSikayetKonusu());
                    System.out.print("Şikayet açıklaması: ");
                    System.out.println(((Sikayet) db.get(i)).getSikayetAciklamasi());
                    System.out.print("Şİkayet takip no: ");
                    System.out.println(((Sikayet) db.get(i)).getTakipNo() + "");
                }

            } else if (asd == 5) {
                System.exit(0);
            } else {
                System.out.println("1'den 5'e kadar sayı giriniz.");
            }
        }

    }
                
    }
}
