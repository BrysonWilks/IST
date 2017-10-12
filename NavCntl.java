/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark2.pkg0;

/**
 *
 * @author brend
 */
public class NavCntl {
    
    private NavUI theNavUI;
    
    public NavCntl(){
       theNavUI = new NavUI();
       
    }
    
    public void setNavUIVisible(){
        getTheNavUI().setVisible(true);
    }

    /**
     * @return the theNavUI
     */
    public NavUI getTheNavUI() {
        return theNavUI;
    }

    /**
     * @param theNavUI the theNavUI to set
     */
    public void setTheNavUI(NavUI theNavUI) {
        this.theNavUI = theNavUI;
    }
    
}
