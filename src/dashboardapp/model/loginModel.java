/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.model;

import dashboardapp.Event.loginListener;
import dashboardapp.View.Home;

/**
 *
 * @author LENOVO
 */
public class loginModel {
    private String user,pass;
    private loginListener listener;

    public loginListener getListener() {
        return listener;
    }
    public void setListener(loginListener listener) {
        this.listener = listener;
    }
    
    

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
        this.fireOnChange();
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
        this.fireOnChange();
    }
    
    protected void fireOnChange(){
    if(listener != null){
        this.listener.onChange(this);
        }
    }
    
    public void loginForm(String username){        
        Home dashboard = new Home();
        dashboard.setVisible(true);
        
    }
    
    public void resetForm(){
        this.setUser("");
        this.setPass("");
    }
    
}
