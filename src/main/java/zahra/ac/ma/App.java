package zahra.ac.ma;



public class App {
    public static void main(String[] args) {
    Compte c1=new CompteCourant(1000,1,780) ;
    Compte c2=new CompteEpargne(2,6788,10);
    c1.verser(345);
    c2.verser(677);
    c1.virement(400,c2);
        System.out.println("Les solde est :" +c1.getSolde());
        System.out.println("Le solde est :" +c2.getSolde());
        System.out.println("Total des versement du compte 1: "+c1.TotalVersement());
        System.out.println("Le total des versement du compte 2: "+c2.TotalVersement());
        System.out.println("Total des retraits: "+c1.TotalRetrait());

    }
}

