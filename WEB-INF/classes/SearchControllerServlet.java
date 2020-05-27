package hris.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hris.bean.EmployeeDbUtil;
import hris.bean.Employee;

public class SearchControllerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String command = request.getParameter("command");

            switch (command) {
                case "A":
                    listSalary(request, response);
                    break;

                case "Q":
                    listQPL(request, response);
                    break;

            }

        } catch (Exception e) {
        }

    }

    private void listSalary(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String lessThan = request.getParameter("lessThan");
        String greaterThan = request.getParameter("greaterThan");
        String value = request.getParameter("command");
        List<Employee> es = new EmployeeDbUtil().getSalary(lessThan, greaterThan, value);
        request.setAttribute("salaryList", es);
        request.getRequestDispatcher("/searchResult.jsp").forward(request, response);
    }

    private void listQPL(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String qualification = request.getParameter("qualification");
        String postLevel = request.getParameter("postLevel");
               
        List<Employee> es = new EmployeeDbUtil().getQPL(qualification, postLevel);
        request.setAttribute("qualificationList", es);
        request.getRequestDispatcher("/searchResult.jsp").forward(request, response);
    }

}