package TestLampe;

public class test {
    
    public static void main(String[] args) {
        lampe L1=new lampe(true);
        interrupteur Inter1=new interrupteur(L1);

    
        System.out.println(L1.LampeAllumer());// true la lampe est allumer
        System.out.println(Inter1.getPosition());// On normalement il est sur on 
    
         Inter1.PresserInterrupteur();

         System.out.println("apres la presser de l'interrupteur");
        System.out.println(L1.LampeAllumer());// flase la lampe est ettint
        System.out.println(Inter1.getPosition());// Off normalement il est sur off 
    
        Inter1.PresserInterrupteur();
        System.out.println("apres la presser de l'interrupteur");
        System.out.println(L1.LampeAllumer());// true la lampe est allumer
        System.out.println(Inter1.getPosition());// On normalement il est sur on 
    

    }
}