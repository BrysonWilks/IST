/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author brend
 */
public class UserList {
    
    private ArrayList <User> theUserList;
    
    public UserList(){
        theUserList = new ArrayList();
        User User1 = new User("bob94","pAssWord");
        User User2 = new User("JohnS","Example");
        User User3 = new User("AnotherName","Words");
        theUserList.add(User1);
        theUserList.add(User2);
        theUserList.add(User3);
    }
    
    public boolean Authenticate(String attemptUserName, String attemptPassword){
        boolean result = false;
        
        for(int i=0; i < getTheUserList().size();i++){
            if(attemptUserName.equals(getTheUserList().get(i).getUserName())){
                if(attemptPassword.equals(getTheUserList().get(i).getPassword())){
                     result = true;
                }
            }
        }
        return result;
    }

    /**
     * @return the theUserList
     */
    public ArrayList <User> getTheUserList() {
        return theUserList;
    }

    /**
     * @param theUserList the theUserList to set
     */
    public void setTheUserList(ArrayList <User> theUserList) {
        this.theUserList = theUserList;
    }
    
}
