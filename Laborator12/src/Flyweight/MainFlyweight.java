package Flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        IClientBanca client = Banca.getOrCreateClient("Gabi","1234","Prima","012");
        ContBancar contBancar = new ContBancar("RO123",500.5);
        client.printeazaDetaliiClient(contBancar);

        IClientBanca client2 = Banca.getOrCreateClient("Alex","1235","Doi","013");
        ContBancar contBancar2 = new ContBancar("RO124",500.5);
        client2.printeazaDetaliiClient(contBancar2);

        System.out.println("Numarul actual de clienti "+Banca.dimensiuneMap());

        creareConturi();

        System.out.println("Numarul actual de clienti "+Banca.dimensiuneMap());
    }
    public static void creareConturi(){
        IClientBanca client = Banca.getOrCreateClient("Alex","1235","Doi","013");
        ContBancar contBancar = new ContBancar("RO236",9000.5);
        client.printeazaDetaliiClient(contBancar);
    }
}
