package Facade;

public class MainFacade {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("1981107460094");
        if(Facade.verificaPersoana(persoana)){
            System.out.println("Contul pentru aceasta persoana se poate crea cu succes!");
        }else{
            System.out.println("Contul pentru aceasta persoana nu se poate crea cu succes!");
        }
    }
}
