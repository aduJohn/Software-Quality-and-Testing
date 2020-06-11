package TH_Flyweight;

public class ExtrinsicState {
    private boolean option1;
    private boolean option2;

    public ExtrinsicState(boolean option1, boolean option2) {
        this.option1 = option1;
        this.option2 = option2;
    }

    public boolean isOption1() {
        return option1;
    }

    public void setOption1(boolean option1) {
        this.option1 = option1;
    }

    public boolean isOption2() {
        return option2;
    }

    public void setOption2(boolean option2) {
        this.option2 = option2;
    }

    @Override
    public String toString() {
        return "ExtrinsicState{" +
                "option1=" + option1 +
                ", option2=" + option2 +
                '}';
    }
}
