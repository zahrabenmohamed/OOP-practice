package zahra.ac.ma;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class  Compte {
    private int code;
    protected double solde;
    protected List<Operations> operations=new ArrayList<>();
    //constructeur sans parametre
    public Compte(){

    }
    //constructeur avec paramatere
    public Compte(int c,double s){
        this.code=c;
        this.solde=s;
    }

    public  void verser(double mt){
        Versement v=new Versement(operations.size()+1,new Date(),mt);
        operations.add(v);
        solde=solde+mt;
    }
    public abstract  void retirer(double mt);

    public void virement(double mt,Compte cp2){
        retirer(mt);
        cp2.verser(mt);

    }

    public double getSolde(){
        return solde;

    }

    public abstract void updateSolde();

    public List<Operations> getOperations() {
        return operations;
    }

    public double TotalVersement(){

        double somme=0;
        for(Operations o:operations) {
            if(o instanceof Versement)
               somme += o.getMontant();
        }
        return somme;
    }

    public double TotalRetrait(){
        double somme=0;
        for(Operations o:operations) {
            if(o instanceof Retraite)
                somme += o.getMontant();
        }
        return somme;
    }




}
