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

    private String serialnumber, info;

    private int refill, expireydate, age, Counter;

    private boolean cencorship;

    public Medicine() {
    }

    public Medicine(String serialnumber, String info, int refill, int expireydate, int Counter, boolean cencorship) {
        this.serialnumber = serialnumber;
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

    public String getserialnumber() {
        return serialnumber;
    }

    public void setserialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
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
        String function = "serialnumber:" + this.serialnumber + "    info:" + this.info + "    refill:"  + this.refill + "   expireydate:" + this.expireydate + "   cencorship:" + this.cencorship;
        return function;

    }
}
