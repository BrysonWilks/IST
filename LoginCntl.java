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
public class LoginCntl {
    
    private UserList list1;
    private LoginUI theUI;
    private NavCntl theNavCntl;
    
    LoginCntl(){
        list1 = new UserList();
        theUI = new LoginUI(this);
        theUI.setVisible(true);
        theNavCntl = new NavCntl();
        getTheUI().getfailLabel().setVisible(false);
    }
    
    public boolean requestAuthenticate(){
        boolean result= false;
        result = getList1().Authenticate(getTheUI().getUserNameText().getText(), getTheUI().getPasswordText().getText());
        return result;
    }
    
    public void recieveAuthenticate(boolean result2){
        if(result2 == true){
            getTheUI().setVisible(false);
            getTheNavCntl().setNavUIVisible();
            
        }
        else{
            getTheUI().getfailLabel().setVisible(true);
        }
    }

    /**
     * @return the list1
     */
    public UserList getList1() {
        return list1;
    }

    /**
     * @param list1 the list1 to set
     */
    public void setList1(UserList list1) {
        this.list1 = list1;
    }

    /**
     * @return the theUI
     */
    public LoginUI getTheUI() {
        return theUI;
    }

    /**
     * @param theUI the theUI to set
     */
    public void setTheUI(LoginUI theUI) {
        this.theUI = theUI;
    }

    /**
     * @return the theNavCntl
     */
    public NavCntl getTheNavCntl() {
        return theNavCntl;
    }

    /**
     * @param theNavCntl the theNavCntl to set
     */
    public void setTheNavCntl(NavCntl theNavCntl) {
        this.theNavCntl = theNavCntl;
    }
}
