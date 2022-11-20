package zahra.ac.ma;

import java.util.Date;

public class Operations {
    private int numero;
    private Date dateOperations;
    private double montant;
//constructeur sans parametre
    public Operations(){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateOperations() {
        return dateOperations;
    }

    public void setDateOperations(Date dateOperations) {
        this.dateOperations = dateOperations;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Operations(int n, Date d, double mt){
        this.numero=n;
        this.dateOperations=d;
        this.montant=mt;

    }
}
