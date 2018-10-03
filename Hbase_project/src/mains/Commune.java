package mains;

public class Commune {
        private String  codeInsee ;
        private String  nom ;
        private String  nomDep ;
        private Integer numDep ;
        private Double population1975 ;
        private Double population2010 ;
        
        public Commune(){}

        public Commune(String Id, String nom, String nomDep){
        	    this.codeInsee = Id;
                this.nom = nom;
                this.nomDep = nomDep;
        }
        public Commune(String Id, String nom, String nomDep, Integer numDep){
             this.codeInsee = Id;
        	 this.nom = nom;
             this.nomDep = nomDep;
             this.numDep = numDep ;
    }
        
        
        public Commune(String Id, String nom, String nomDep, Integer numDep, Double p75, Double p2010){
            this.codeInsee = Id;
            this.nom = nom;
            this.nomDep = nomDep;
            this.numDep = numDep ;
            this.population1975=p75;
            this.population2010=p2010;
   }
        
        
        public String getId(){return codeInsee;}
        public String getNom(){return nom;}
        public String getNomDep(){return nomDep;}
        public Integer getNumDep(){return numDep;}
        public Double getPopulation1975(){return population1975;}
        public Double getPopulation2010(){return population2010;}
       
        public void setId(String Id)
        {this.codeInsee = Id;}
        public void setNom(String nom)
        {this.nom = nom;}
        public void setNomDep(String nomDep)
        {this.nomDep = nomDep;}
        public void setNumDep(Integer numDep)
        {this.numDep = numDep;}
        public void setPopulation1975(Double population1975){this.population1975=population1975;}
        public void setPopulation2010(Double population2010){this.population2010=population2010;}
        
        public String toString()
        {return getId()+" "+getNom()+" "+getNomDep()+" "+getNumDep()+" "+getPopulation1975()+" "+getPopulation2010();}
        
       
}