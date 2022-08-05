/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.Controller;

import static dashboardapp.Controller.koneksi.rs;
import static dashboardapp.Controller.koneksi.stm;
import dashboardapp.View.LoginPage;
import dashboardapp.model.loginModel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class loginController {
    
    private loginModel model;

    public loginModel getModel() {
        return model;
    }
    public void setModel(loginModel model) {
        this.model = model;
    }
    
    //Method di dalam Controller
    public void loginForm(LoginPage view){
        Connection conn;
        String username = view.getUser().getText();
        String password = view.getPass().getText();
        
        //Validasi
        String message = null;
        if(username.length() == 0){
            message = "'Username Tidak Boleh Kosong'";
        }else if(password.length() == 0){
            message = "'Password Tidak Boleh Kosong'";
        }else{
            //Pengecekan Username dan Password dari database
            try{
                String sql = "SELECT user.nama,user.password FROM `user` WHERE user.nama='"+username+"' AND user.password='"+password+"'";
                conn = new koneksi().getConnetion(sql);
                rs = stm.executeQuery(sql);

                if(!rs.next()){
                    message = "'Username atau Password Yang Anda Masukan Salah'";
                }
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal" + e.getMessage());
            }
        }
        
        if(message == null){
            model.setUser(username);
            model.setPass(password); 
            view.dispose();
            
            model.loginForm(username);
        }else{
            JOptionPane.showMessageDialog(view, message);
//            model.resetForm();
        } 
        
    }
    
}
