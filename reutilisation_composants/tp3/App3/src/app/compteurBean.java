/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author achaillot
 */
public class compteurBean  implements Serializable {
    
    public static final String PROP_CPT = "Valeur";
    public static final String PROP_SALLE = "Etat de la salle";
    
    private static final Integer NB_PLACES = 20;
    
    private Integer valeur = new Integer(0);
    private boolean isFull = false;
    public  String etatSalle = "Place disponible !";
    private PropertyChangeSupport propertySupport;
    
    
    public compteurBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    
    public void incremente(){
        if(!isFull){
            this.setValeur(this.getValeur() + 1);
        }       
    }
    
    public void decremente(){
        if(valeur > 0){
            this.setValeur(this.getValeur() - 1);
        }        
    }
    
    public void isFull(){
        System.out.println("je passe par la ! ====> " + etatSalle);
        if(valeur >= NB_PLACES){
            this.stop();
        }
        else {
            this.start();
        }
    }
    
    public Integer getValeur() {
        return valeur;
    }
    
    public void setValeur(Integer value) {
        Integer oldValue = valeur;
        valeur = value;
        propertySupport.firePropertyChange(PROP_CPT, oldValue, valeur);
    }
    
    public String getEtat(){
        return etatSalle;
    }
    public void setEtatSalle(String newEtat){
        String oldEtat = etatSalle;
        etatSalle = newEtat;   
        propertySupport.firePropertyChange(PROP_SALLE, oldEtat, etatSalle);
      
        
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public void start(){
        isFull = false;
        this.setEtatSalle("Place disponible !");
    }
    
    public void stop(){
        isFull = true;
        this.setEtatSalle("Salle pleine !");
    }
    
}
