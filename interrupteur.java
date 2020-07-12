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
              return "iraka";
          }
          else
          return "irajimije";
          
      }

      public void PresserInterrupteur()
      {
          this.position=!this.position;
          lampe.ChangeEtat();
      }
    
}