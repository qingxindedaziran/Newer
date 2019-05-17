import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Live on 2019-05-10 11:16
 *
 * @author chentao
 */
public class UserNumber extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        ServletContext ctx = this.getServletContext();
        Integer userNumber =(Integer) ctx.getAttribute("UserNumber");
        resp.setContentType("text/html;charset=GBK");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<head><title>访问人数统计</title></head>");
        out.println("<body>");
        if(userNumber!=null){
            out.println("已经有"+userNumber.intValue()+"人次访问本站");

        }else {
            out.println("你是第一个访问本站的！");
        }
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
