package edu.anze.loginapp;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置Servlet编码
        request.setCharacterEncoding("UTF-8");
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        if (!"赵文旭".equals(uname) || !"2127406029".equals(upwd)) {
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
        else {
            response.sendRedirect("success.jsp");
        }

    }
}