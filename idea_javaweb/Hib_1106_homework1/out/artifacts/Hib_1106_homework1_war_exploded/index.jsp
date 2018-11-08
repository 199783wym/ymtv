<%--
  Created by IntelliJ IDEA.
  User: ym
  Date: 2018/11/6
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <form name="form1" action="MessageServlet" method="post" onSubmit="return check();">
      user<input type="text" name="name" id="name"><br>
      password<input type="password" name="password" id="password"><br>
      <input type="submit">
    </form>
  </body>
</html>
