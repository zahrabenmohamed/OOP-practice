package zahra.ac.ma;

import java.util.Date;

public class CompteCourant extends Compte{
    private double decouvert;

    @Override
    public void retirer(double mt) {
        if(mt>solde+decouvert) throw new RuntimeException("Solde est insuffisant ");
        Retraite r=new Retraite(operations.size()+1,new Date(),mt);
        operations.add(r);
        solde-=mt;
    }

    @Override
    public void updateSolde() {

    }

    public CompteCourant(){}
    public CompteCourant(double decouvert,int code,double solde){
        super(code,solde);
        this.decouvert=decouvert;

    }
}
