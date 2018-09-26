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
public class compteur  implements Serializable {
    
    public static final String PROP_CPT = "Valeur";
    
    private Integer valeur = new Integer(0);
    private PropertyChangeSupport propertySupport;
    
    
    public compteur() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    
    
    public void incremente(){
        this.setValeur(this.getValeur() + 1);
    }
    
    public void decremente(){
        this.setValeur(this.getValeur() - 1);
    }
    
    public Integer getValeur() {
        return valeur;
    }
    
    public void setValeur(Integer value) {
        Integer oldValue = valeur;
        valeur = value;
        propertySupport.firePropertyChange(PROP_CPT, oldValue, valeur);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
