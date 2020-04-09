package clase;

import clase.IPersoana;
import exceptii.CNPNullException;
import exceptii.CaractereInvalideException;
import exceptii.CifreInvalideException;
import exceptii.LungimeInvalidaException;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Persoana implements IPersoana {

    private String nume;
    public String CNP;

    public Persoana(){
        this.nume="Nume initial";
        this.CNP="1000000000001";
    }


    public Persoana(String nume, String CNP){
        this.nume=nume;
        this.CNP=CNP;
    }

    public String getSex(){
        switch(CNP.charAt(0)){
            case '1': return "M";
            case '2': return "F";
            case '3': return "M";
            case '4': return "F";
            case '5': return "M";
            case '6': return "F";
        }
        return "N/A";
    }

    public int getVarsta(){
        int an=0;
        if(CNP.charAt(0)=='1'|| CNP.charAt(0)=='2')
            an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        if(CNP.charAt(0)=='3'|| CNP.charAt(0)=='4')
            an=(1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        if(CNP.charAt(0)=='5'|| CNP.charAt(0)=='6')
            an=(2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
        if (an==0){
            throw new IllegalArgumentException();
        }
        int luna= Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4))-1;
        int zi= Integer.parseInt("" + CNP.charAt(5) + CNP.charAt(6));

        Calendar dataNasterii=Calendar.getInstance();
        dataNasterii.set(an,luna,zi);
        Calendar dataCurenta=Calendar.getInstance();
        if(dataNasterii.after(dataCurenta)){
            throw new IllegalArgumentException();
        }
        long varsta_zile=TimeUnit.MILLISECONDS.toDays(Math.abs(dataCurenta.getTimeInMillis()-dataNasterii.getTimeInMillis()));
        return (int) (varsta_zile/365);
    }

    public boolean checkCNP(){
        int s=0;
        boolean rezultat = false;
        if(CNP == null){
            throw new CNPNullException("CNP-ul este null!");
        }
        if(CNP.length()!=13)
            throw new LungimeInvalidaException("CNP-ul nu are lungimea corecta");
        if(CNP.charAt(0)== '0'){
            throw new CifreInvalideException("CNP-ul contine cifra 0 la inceput!");
        }
        String number="279146358279";
        try{
            for(int i=0;i<12;i++){
                s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+CNP.charAt(i));
            }
            int cifra=s%11;
            if(cifra==10)
                cifra=1;
            rezultat=cifra==Integer.parseInt(""+CNP.charAt(12));
        }catch(Exception ert)
        {
            throw new CaractereInvalideException("CNP-ul contine caractere incorecte");
        }

        return rezultat;
    }
}