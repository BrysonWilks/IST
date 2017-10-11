*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;

/**
 *
 * @author bqw5233
 */
public class User {
    
    private String username;
    private String password;
    
    public User(String newUsername, String newPassword){
        this.username = newUsername;
        this.password = newPassword;
    }
    
    public boolean authenticate(String theUsername, String thePassword){
        if (theUsername.equals(this.username) && thePassword.equals(this.password)){
            return true;
        }
        
        return false;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
