package bean;

import java.sql.*;

public class ChangePasswordBean {
    public static boolean changePassword(LoginBean bean) {
        int column = 0;
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE login_info SET password=? WHERE username=?");

            ps.setString(1, bean.getPassword());
            ps.setString(2, bean.getUsername());

            column = ps.executeUpdate();
            
        } catch (Exception e) {   }
        
        return (column != 0);
    }
}