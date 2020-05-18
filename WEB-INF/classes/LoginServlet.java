package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import bean.LoginBean;
import bean.LoginDao;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        LoginBean loginBean = (LoginBean) session.getAttribute("loginBean");

        if (loginBean == null) {
            loginBean = new LoginBean(request.getParameter("username"), request.getParameter("password"));
            session.setAttribute("loginBean", loginBean);
        }

        if (LoginDao.validate(loginBean)) {
            response.sendRedirect("/Hris/user.jsp");
        } else {
            response.sendRedirect("/Hris/index.jsp");
        }
    }
}