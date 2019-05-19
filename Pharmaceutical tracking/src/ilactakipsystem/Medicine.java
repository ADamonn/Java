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
public class Medicine {

    private String SeriNumber, info;

    private int refill, expireydate, age, Counter;

    private boolean cencorship;

    public Medicine() {
    }

    public Medicine(String SeriNumber, String info, int refill, int expireydate, int Counter, boolean cencorship) {
        this.SeriNumber = SeriNumber;
        this.info = info;
        this.refill = refill;
        this.expireydate = expireydate;
        this.Counter = Counter;
        this.cencorship = cencorship;
    }

   
    
    public int getCounter() {
        return Counter;
    }

    public void setCounter(int Caunter) {
        this.Counter = Caunter;
    }

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

    public boolean getcencorship() {
        return cencorship;
    }

    public void setcencorship(boolean cencorship) {
        this.cencorship = cencorship;
    }

    @Override
    public String toString() {
        String function = "SeriNumber:" + this.SeriNumber + "    info:" + this.info + "    refill:"  + this.refill + "   expireydate:" + this.expireydate + "   cencorship:" + this.cencorship;
        return function;

    }
}
