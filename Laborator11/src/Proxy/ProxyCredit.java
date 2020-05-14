package Proxy;

public class ProxyCredit implements ICredit {
    private Credit credit;

    public ProxyCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void oferaCredit(String moneda) {
        if(moneda.equals("RON")){
            credit.oferaCredit(moneda);
        }else{
            System.out.println("Creditul nu poate fi realizat pentru aceasta moneda!");
        }
    }
}
