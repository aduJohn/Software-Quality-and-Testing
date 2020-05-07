package Facade;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Persoana {
    private String CNP;

    public Persoana(String CNP) {
        this.CNP = CNP;
    }
    public int getVarsta(){
        int an=0;
        if(CNP.charAt(0)=='1'|| CNP.charAt(0)=='2') {
            an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        }
        if(CNP.charAt(0)=='3'|| CNP.charAt(0)=='4') {
            an=(1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        }
        if(CNP.charAt(0)=='5'|| CNP.charAt(0)=='6') {
            an=(2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        }

        int luna= Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4)) -1 ;
        int zi= Integer.parseInt("" + CNP.charAt(5) + CNP.charAt(6));

        if(an == 0) {
            throw new IllegalArgumentException();
        }

        Calendar dataNasterii=Calendar.getInstance();
        dataNasterii.set(an,luna,zi);
        Calendar dataCurenta=Calendar.getInstance();
        if(dataNasterii.after(dataCurenta)) {
            throw new IllegalArgumentException();
        }

        long varsta_zile= TimeUnit.MILLISECONDS.toDays(Math.abs(dataCurenta.getTimeInMillis()-dataNasterii.getTimeInMillis()));
        return (int) (varsta_zile/365);

    }

    public String getCNP() {
        return CNP;
    }
}
