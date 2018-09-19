package Structure;

import Visitor.CountVisitor;
import Visitor.FindVisitor;
import Visitor.JavaCleanVisitor;
import Visitor.RazVisitor;

public class Principale
{
    public static void main(String[] args)
    {
		/*

		Structure.Directory racine = new Structure.Directory("racine") ;
		Structure.Directory d1 = new Structure.Directory("JAVA") ;
		Structure.Directory d2 = new Structure.Directory("src") ;
		
		Structure.File f1 = new Structure.File("Structure.File.java","classe Structure.File") ;
		Structure.File f2 = new Structure.File("Structure.Principale.java","classe Structure.Principale") ;
		
		Structure.Symlink sl = new Structure.Symlink("mon_lien_1",f2) ;
		Structure.Symlink s2 = new Structure.Symlink("JAVA") ;
		
		racine.add(d1) ;
		d1.add(d2) ;
		d2.add(f1) ;
		d2.add(f2) ;
		d2.add(s2) ;
		racine.add(sl) ;
		
		System.out.println(racine.absoluteAdress()) ;
		System.out.println("ls : ") ;
		racine.ls() ;
		System.out.println("taille : "+racine.size()) ;
		System.out.println("\n") ;
		
		System.out.println(d1.absoluteAdress()) ;
		System.out.println("ls : ") ;
		d1.ls() ;
		System.out.println("taille : "+d1.size()) ;
		System.out.println("\n") ;
		
		System.out.println(d2.absoluteAdress()) ;
		System.out.println("ls : ") ;
		d2.ls() ;
		System.out.println("taille : "+d2.size()) ;
		System.out.println("\n") ;
		
		System.out.println(f1.absoluteAdress()) ;
		System.out.println("cat : ") ;
		f1.cat() ;
		System.out.println("taille : "+f1.size()) ;
		System.out.println("\n") ;
		
		System.out.println(sl.absoluteAdress()) ;
		System.out.println("cat : ") ;
		sl.cat() ;
		System.out.println("taille : "+sl.size()) ;
		System.out.println("\n") ;
		
		ArrayList<String> rechercheSimple = racine.find("JAVA") ;
		
		System.out.println("resultat de notre recherche simple sur JAVA dans racine : ") ;
		racine.afficheCollection(rechercheSimple) ;
		System.out.println("\n") ;
		
		ArrayList<String> rechercheTransitive = racine.findR("JAVA") ;
		
		System.out.println("resultat de notre recherche transitive sur JAVA dans racine : ") ;
		racine.afficheCollection(rechercheTransitive) ;
		System.out.println("\n") ;
		
		racine.remove(d1) ;
		
		System.out.println(racine.absoluteAdress()) ;
		System.out.println("ls : ") ;
		racine.ls() ;
		System.out.println("taille : "+racine.size()) ;
		System.out.println("\n") ;

		*/

        Directory d = new Directory("Pastis") ;
        File f = new File("Martini.class","martini") ;
        File f2 = new File("Ricard","ricard") ;
        Directory d2 = new Directory("Eau") ;
        File f3 = new File("Glaçons.class","tout pleins de glaçons") ;

        d.add(f) ;
        d.add(f2) ;
        d.add(d2) ;
        d2.add(f3) ;

        File f4 = new File("Duval","duval") ;

        System.out.println("AVANT"+"\n") ;
        System.out.println("taille "+d.name+" : "+d.size()) ;
        System.out.println("taille "+d2.name+" : "+d2.size()) ;
        System.out.println("taille "+f.name+" : "+f.size()) ;
        System.out.println("taille "+f2.name+" : "+f2.size()) ;
        System.out.println("taille "+f3.name+" : "+f3.size()) ;
        System.out.println("taille "+f4.name+" : "+f4.size()) ;

        d.ls();
        d2.ls();

        System.out.println("\n ==== Count Visitor ====");

        CountVisitor countVisitor = new CountVisitor();
        d2.accept(countVisitor);
        System.out.println("Nombre de fichier de taille supérieur à 10 : " + countVisitor.getCount());

        System.out.println("\n ==== RAZ Visitor ====");

        RazVisitor razVisitor = new RazVisitor();
        System.out.println("Taille avant : " + d.size());
        d.accept(razVisitor);
        System.out.println("Taille après : " + d.size());

        System.out.println("\n ==== Find Visitor ====");

        FindVisitor findVisitor = new FindVisitor("Eau");
        d.accept(findVisitor);
        System.out.println("Adresses absolue : " + findVisitor.getAbsoluteAdresses());

        System.out.println("\n === JavaClean Visitor ====");

        JavaCleanVisitor jvc = new JavaCleanVisitor(m -> {
            if(m.getName().endsWith(".class")){
                System.err.println("Match sur " + m.absoluteAdress());
                return true;
            }

            return false;
        });
        d.accept(jvc);

        d.ls();






    }
}