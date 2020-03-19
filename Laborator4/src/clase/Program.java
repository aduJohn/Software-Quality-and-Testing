package clase;

public class Program {
    public static void main(String[] args) {
        Matematica mate = new Matematica();
        int rezultatObtinut = mate.suma(6,9);
        int rezultatAsteptat = 15;
        if(rezultatAsteptat==rezultatObtinut){
            System.out.println("Metoda este corecta");
        }else{
            System.out.println("Metoda nu calculeaza corect");
        }
    }
}
