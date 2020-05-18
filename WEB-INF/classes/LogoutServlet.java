package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginBean;

public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        LoginBean loginBean = (LoginBean) session.getAttribute("loginBean");
        if (loginBean != null) {
            loginBean = null;
            session.setAttribute("loginBean", loginBean);
            session = null;
            response.sendRedirect("/Hris/index.jsp");
        }
    }
}