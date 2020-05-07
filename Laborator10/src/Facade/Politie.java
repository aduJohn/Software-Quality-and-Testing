package Facade;

public class Politie {

    public static boolean esteUrmarit(String CNP){
        return Integer.parseInt(String.valueOf(CNP.charAt(CNP.length()-1)))%2==1;
    }
}
