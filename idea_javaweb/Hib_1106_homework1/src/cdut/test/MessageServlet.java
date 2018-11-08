package cdut.test;


import cdut.test.hibernateUitl;
import cdut.ym.Login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MessageServlet extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException{
         response.setCharacterEncoding("GBK");
         request.setCharacterEncoding("GBK");
         String name =request.getParameter("name");
         String psd=request.getParameter("password");

       hibernateUitl hibernateUtil = new hibernateUitl();
       Login login = new Login();
       //实例化对象
      login.setName(name);
      login.setPassword(psd);
      String returnStr =hibernateUtil.saveMessage(login);
      //保存留言信息
      PrintWriter out =response.getWriter();
      out.print("<script>alert('"+returnStr+"');window.location.href='forward.jsp';</script>");
      out.flush();
      out.close();
  }
}
