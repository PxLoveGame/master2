
package app;

import javax.swing.JLabel;

/**
 *
 * @author achaillot
 */
public class Test1 extends JLabel {
    
    private String texte1 = "Bonjour";
    private String texte2 = "Au revoir";
    private String temp;
    
    public Test1(){}
    
    
    public void mSwitch(){
        this.setText(texte1);
    }
    
    public void switchText(String newText){
        temp = texte1;
        texte1 = texte2;
        texte2 = temp;
        
        this.mSwitch();
        
    }

}
