package Builder;

public class PacientBuilderConcret implements PacientBuilderAbstract {
    private Pacient pacient;

    public PacientBuilderConcret() {
        this.pacient = new Pacient();
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }

    public PacientBuilderConcret setNume(String nume) {
        this.pacient.setNume(nume);
        return this;
    }

    public PacientBuilderConcret setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilderConcret setMicDejunInclus(boolean micDejunInclus) {
        this.pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilderConcret setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilderConcret setHalatPentruInterior(boolean halatPentruInterior) {
        this.pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }
}
