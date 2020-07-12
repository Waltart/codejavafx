package TestLampe;

public class lampe {
    private boolean Etat;

    public lampe(boolean Etat)
    {
        this.Etat=Etat;
    }

    public boolean LampeAllumer() {
        return Etat;
    }

    public void ChangeEtat() {
        this.Etat=!this.Etat;
        
    }







}