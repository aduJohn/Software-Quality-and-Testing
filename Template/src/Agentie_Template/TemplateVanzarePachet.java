package Agentie_Template;

public abstract class TemplateVanzarePachet {
    public abstract void cautareCazare();
    public abstract void cautareTransport();
    public abstract void rezervaPachet();
    public abstract void realizarePlata();
    public final void vanzarePachet(){
        cautareCazare();
        cautareTransport();
        rezervaPachet();
        realizarePlata();
    }
}
