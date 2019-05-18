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
public class Ilac {

    private String SeriNumber, info;
    private int refill, expireydate, age;
    private boolean cencorship;
    public final String tiype[] = {"buccal", "enteral", "inhalable", "infused"};

    public String getSeriNumber() {
        return SeriNumber;
    }

    public void setSeriNumber(String SeriNumber) {
        this.SeriNumber = SeriNumber;
    }

    public String getinfo() {
        return info;
    }

    public void setinfo(String info) {
        this.info = info;
    }

    public int getrefill() {
        return refill;
    }

    public void setrefill(int refill) {
        this.refill = refill;
    }

    public int getexpireydate() {
        return expireydate;
    }

    public void setexpireydate(int expireydate) {
        this.expireydate = expireydate;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public boolean getcencorship() {
        return cencorship;
    }

    public void setcencorship(boolean cencorship) {
        this.cencorship = cencorship;
    }

    @Override
    public String toString() {
        String function ="SeriNumber:" + this.SeriNumber + "info:" + this.info + "refill:" + this.refill + "expireydate:" + this.expireydate + "age:" + this.cencorship;
        return function;

    }

}
