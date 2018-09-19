package Structure;

import Visitor.*;

public class Link extends ElementStockage{
    public ElementStockage reference  ;

    public Link(String nom)
    {
        super(nom,0) ;
        reference=null ;
    }

    public Link(String nom,ElementStockage e){
        super(nom,0) ;
        reference=e ;
    }

    public int size(){
        if (reference==null)
            return 0 ;
        else return reference.size()  ;
    }

    @Override
    protected  void accept(Visitor v) {
        v.visitConcreteLink(this);
    }

    public void cat()
    //affiche le symbole du lien puis l'adresse absoule de sa rfrence
    {
        System.out.println("ln -s "+reference.absoluteAdress()+" "+name) ;
    }

}
