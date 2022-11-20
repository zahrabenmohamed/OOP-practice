package zahra.ac.ma;

import java.util.Date;

public class CompteEpargne extends Compte{
    private double taux;
    @Override
    public void retirer(double mt) {
        if(mt>solde) throw new RuntimeException("Solde est insuffisant ");
        Retraite r=new Retraite(operations.size()+1,new Date(),mt);
        operations.add(r);
        solde-=mt;

    }

    @Override
    public void updateSolde() {
        solde+=(solde*taux/100);

    }
    public CompteEpargne(){}
    public CompteEpargne(int code,double solde,double taux){
        super(code,solde);
        this.taux=taux ;
    }

}
