package Structure;

import Visitor.*;

public class File extends ElementStockage
//classe reprsentant un fichier
{
    protected String contenu ; // possde un contenu

    public File(String nom){
        super(nom,0) ;
        this.contenu="" ;
    }

    public File(String nom,String contenu){
        super(nom,0) ;
        this.contenu=contenu ;
    }

    public int size(){
        return (contenu.length());
    }

    @Override
    protected void accept(Visitor v) {

        v.visitConcreteFile(this);
    }

    public void cat(){
        System.out.println(contenu) ;
    }

    public boolean contains(String sub){
        return (contenu.indexOf(sub) != -1);
    }

    public void setContents(String c)
    //change le contenu du fichier. Le contenu devient c
    {
        contenu = c ;
    }
}
