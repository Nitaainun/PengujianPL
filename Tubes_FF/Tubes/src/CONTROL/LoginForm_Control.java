/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import DATABASE.UserDatabaseConnections;
import MODEL.User_Model;
import VIEW.Dashboard;
import VIEW.LoginForm;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fachrur fatanillah
 */
public class LoginForm_Control {
    
    LoginForm LoginForm;
    Dashboard Dashboard;
    
    public List <User_Model> User;
    
    public LoginForm_Control(LoginForm LoginForm){
        User = UserDatabaseConnections.GetData();
        this.LoginForm = LoginForm;
    }
    
//    public void FindDataUser (String UserName, String UserPassword, LoginForm LoginForm)
//    {
//        if (LoginForm.getUserName().intern() == " " && LoginForm.getUserPassword().intern() == " ") {
//           JOptionPane.showMessageDialog(null, "Email dan Password tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
//           
//        } else if (LoginForm.getUserName().intern() == " ") {
//           JOptionPane.showMessageDialog(null, "Email tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
//           
//        } else if (LoginForm.getUserPassword().intern() == " ") {
//           JOptionPane.showMessageDialog(null, "Password tidak terisi", "Warning",JOptionPane.WARNING_MESSAGE);
//           
//        } else {
//           boolean FindUser = false;
//            int index = 0;
//            while (FindUser == false & index < User.size()){
//                if (UserName.intern() == User.get(index).getusername().intern() && UserPassword.intern() == User.get(index).getpassword().intern()){
//                    FindUser = true;
//                }
//                index = index + 1;
//            if (FindUser == true ) {
//            }
//                index = index - 1;
//                LoginForm.dispose();
//                Dashboard DashboardMenu = new Dashboard(User.get(index).getidUser(), User.get(index).getusername(), User.get(index).getnama(), User.get(index).getpassword(), User.get(index).getno_telp(), User.get(index).getjenis_kelamin());
//                DashboardMenu.show();
//            }else {
//                JOptionPane.showMessageDialog(null, "Data tidak ditemukan",
//                "Warning",JOptionPane.WARNING_MESSAGE);
//                /*for(int i=0; i<user.size(); i++) {
//                    System.out.println(user.get(i).getEmail());
//                }*/
//            }
//        }
//    }
}
