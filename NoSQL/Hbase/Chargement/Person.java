package tp;


public class Person {
        private String  Id ;
        private String  nom ;
        private String  prenom ;
        private Integer age ;

        
        public Person(){}

        public Person(String Id, String nom, String prenom ){
        	    this.Id = Id;
                this.nom = nom;
                this.prenom = prenom;
        }
        public Person(String Id, String nom, String prenom, Integer age){
             this.Id = Id;
        	 this.nom = nom;
             this.prenom = prenom;
             this.age = age ;
    }
        
        
        public String getId(){return Id;}
        public String getNom(){return nom;}
        public String getPrenom(){return prenom;}
        public Integer getAge(){return age;}
       
       
        public void setId(String Id)
        {this.Id = Id;}
        public void setNom(String nom)
        {this.nom = nom;}
        public void setPrenom(String prenom)
        {this.prenom = prenom;}
        public void setAge(Integer age)
        {this.age = age;}
       
        
        public String toString()
        {return getId()+" "+getNom()+" "+getPrenom()+" "+getAge();}
        
       
}