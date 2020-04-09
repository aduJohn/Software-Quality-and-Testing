package dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {

    private String sex;
    private int varsta;
    private boolean checkCNP;

    public PersoanaFake() {
    }

    public PersoanaFake(String sex, int varsta, boolean checkCNP) {
        this.sex = sex;
        this.varsta = varsta;
        this.checkCNP = checkCNP;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return checkCNP;
    }
}
