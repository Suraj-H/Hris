package bean;

import java.sql.*;

public class LoginDao {
    public static boolean validate(LoginBean bean) {
        boolean status = false;
        
        try {
            Connection con = ConnectionProvider.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM login_info WHERE username=? AND password=?");

            ps.setString(1, bean.getUsername());
            ps.setString(2, bean.getPassword());

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) { }

        return status;
    }
}