package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/bar.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Test Exam</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"resources/images/icon.jpg\" type=\"image/jpg\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"resources/css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"wrapper\">\r\n");
      out.write("    <center>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"bar\" id=\"bar\">\r\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("                <div style=\"float: left; width: 580px; margin: 8px 0px 5px 200px; font-size: 20px;\"><marquee behavior=\"alternate\"  direction=\"left\" style=\"text-align:center;\">ABV-IIITM Online Test Exam</marquee></div>\n");
      out.write("                ");

                    String admin=(String) session.getAttribute("admin");
                    String user=(String) session.getAttribute("user");
                    Connection con;
                    Statement st;
                    ResultSet rs;
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                        st=con.createStatement();
                        if(admin!=null)
                        {
                            String query="select * from admin where uname='"+admin+"'";
                            rs=st.executeQuery(query);
                            if(rs.next())
                            {
                                String name=rs.getString("name");
                                
      out.write("\n");
      out.write("                                <div  style=\" float: right; margin-right: 10px;  font-size: 20px; margin-top: 15px; width: auto;\"><p>Welcome Mr ");
      out.print(name );
      out.write("</p></div>\n");
      out.write("                                ");
    
                            }
                        }
                        if(user!=null)
                        {
                            String query="select * from user where rollno='"+user+"'";
                            rs=st.executeQuery(query);
                            if(rs.next())
                            {
                                String name=rs.getString("name");
                                
      out.write("\n");
      out.write("                                <div style=\" float: right; margin-right: 10px;  font-size: 20px; margin-top: 15px; width: auto;\"><p>Welcome Mr ");
      out.print(name );
      out.write("</p></div>\n");
      out.write("                                ");
    
                            }
                        }
                        
                    }
                    catch(Exception e)
                        {
                            out.println("Error="+e);
                        }
                     
      out.write("\n");
      out.write("                </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\" style=\"background-image: url(resources/images/header.jpg);\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"body\" style=\"background-image: url(resources/images/background.jpg);\">\r\n");
      out.write("                <div id=\"menu\">\r\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <div class=\"menubar\">\n");
      out.write("               <ul>\n");
      out.write("                  <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                  <li><a href=\"admin.jsp\">ADMIN</a></li>\n");
      out.write("                  <li><a href=\"user.jsp\">USER</a></li>\n");
      out.write("                  <li><a href=\"notice.jsp\">NOTICE</a></li>\n");
      out.write("                  <li><a href=\"exam.jsp\">EXAM</a></li>\n");
      out.write("                  <li><a href=\"showresult.jsp\">RESULT</a></li>\n");
      out.write("                  <li><a href=\"feedback.jsp\">FEEDBACK</a></li>\n");
      out.write("                  <li><a href=\"signout.jsp\">SIGN OUT</a></li>\n");
      out.write("                  <li><a href=\"contact.jsp\">CONTACT US</a></li>\n");
      out.write("                  <li><a href=\"report.jsp\">EXAM REPORT</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"text\">\r\n");
      out.write("                        <h1 style=\"color: #e12869; text-align: justify;\">Welcome to Online Test</h1>\r\n");
      out.write("                        <p style=\"text-align: justify;\">\r\n");
      out.write("                    Online Exam means the candidate sits in front of \r\n");
      out.write("                    a computer at the examination centre and the questions are presented on \r\n");
      out.write("                    the computer monitor and the candidate answers\r\n");
      out.write("                    the questions on the computer through the \r\n");
      out.write("                    use of mouse. Unlike the traditional \r\n");
      out.write("                    paper-pencil based test which is generally \r\n");
      out.write("                    offered on a single day to all candidates, \r\n");
      out.write("                    Online Exam will be offered over a period \r\n");
      out.write("                    of time and the candidate can choose the \r\n");
      out.write("                    Center, the Day and Time of his/her \r\n");
      out.write("                    convenience to take the test.</p><br/>\r\n");
      out.write("                        <h1 style=\"color: #e12869; text-align: justify;\">Purpose</h1>\r\n");
      out.write("                        <p style=\"text-align: justify;\">\r\n");
      out.write("                            Online Exams System fulfills the requirements of the\r\n");
      out.write("                            institutes to conduct the exams online.They do not \r\n");
      out.write("                            have to go to any software developer to make a separate\r\n");
      out.write("                            site for being able to conduct exams online.They just \r\n");
      out.write("                            have to register on the site and enter the exam details\r\n");
      out.write("                            and the lists of the students which can appear in the exam.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("             \r\n");
      out.write("                <div id=\"footer\">\r\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\" style=\"background-image: url(resources/images/footer.jpg);\">\n");
      out.write("                <div style=\"padding-top: 40px; width: 500px;\">\n");
      out.write("                    <a style=\"text-decoration: none; color: black; margin: 0px 0px 0px 90px; float: left; padding-left: 50px; padding-right: 10px;;\" href=\"home.jsp\"><b>HOME</b></a>\n");
      out.write("                    <p style=\"width: 5px; float: left;  margin-left: 0px; margin-right: 0px;\">|</p>\n");
      out.write("                    <a style=\"text-decoration: none; color: black; margin: 0px 0px 0px 10px; float: left; padding-right: 10px;\"  href=\"admin.jsp\"><b>ADMIN</b></a>\n");
      out.write("                    <p style=\"width: 5px; float: left; margin-left: 0px; margin-right: 0px;\">|</p>\n");
      out.write("                    <a style=\"text-decoration: none; color: black; margin: 0px 0px 0px 10px; float: left; padding-right: 10px;\" href=\"user.jsp\"><b>USER</b></a>\n");
      out.write("                    <p style=\"width: 5px; float: left; margin-left: 0px; margin-right: 0px;\">|</p>\n");
      out.write("                    <a style=\"text-decoration: none; color: black; margin: 0px 0px 0px 10px; float: left;\" href=\"signout.jsp\"><b>SIGN OUT</b></a>\n");
      out.write("                   \n");
      out.write("                 </div>  \n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
