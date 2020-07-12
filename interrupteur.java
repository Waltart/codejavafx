package TestLampe;

public class interrupteur {
    private boolean position;
    private lampe lampe;
    
    public interrupteur(lampe lampe)
    {
        this.lampe=lampe;
        this.position=lampe.LampeAllumer();
    }

      public String getPosition() {
          if(position)
          {
              return "on";
          }
          else
          return "off";
          
      }

      public void PresserInterrupteur()
      {
          this.position=!this.position;
          lampe.ChangeEtat();
      }
    
}