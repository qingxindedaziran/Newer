import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Live on 2019-05-08 22:39
 *
 * @author chentao
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
       PrintWriter out= resp.getWriter();
        ServletContext servletContext = this.getServletContext();
        int count=0;
        servletContext.setAttribute("count",count);
        count++;
        Enumeration<String> attributeNames = servletContext.getInitParameterNames();
        while (attributeNames.hasMoreElements()){
            String s = attributeNames.nextElement();
            String initParameter = getInitParameter(s);
            System.out.println(initParameter);
        }
        out.println(count);



    }

    public TestServlet() {
        super();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service ");
        super.service(req, res);
    }

    @Override
    public void destroy() {

        super.destroy();

    }

    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);
        System.out.println("init sucess.");
    }
}
