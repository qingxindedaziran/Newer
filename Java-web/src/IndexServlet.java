import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Live on 2019-05-10 11:06
 *
 * @author chentao
 */
public class IndexServlet extends HttpServlet {
    public IndexServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        Cookie[] cookies = req.getCookies();
        Cookie cookie = new Cookie("username","chentao");
        cookie.setMaxAge(60*1);
        resp.addCookie(cookie);
        HttpSession session = req.getSession();
        session.setAttribute("username","chentao");


        ServletContext ctx = this.getServletContext();
        synchronized (this){
           Integer  userNumber =(Integer) ctx.getAttribute("UserNumber");
           int tmp=0;
           if(userNumber==null){
               tmp=new Integer(1);

           }else {
               tmp=userNumber.intValue()+1;


           }
            ctx.setAttribute("UserNumber",(Integer)tmp);


        }
        resp.setContentType("text/html;charset=GBK");
        PrintWriter out= resp.getWriter();
        out.println("<html>");
        out.println("<head> <title>首页</title></head>");
        out.println("<body>");
        out.println("这是第一页<br>");
        out.println("<a href='/usernumber'>人数统计</a>");
        out.println("</body></html>");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
