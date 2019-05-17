import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Live on 2019-05-12 15:38
 *
 * @author chentao
 */
public class LoginServlet  extends HttpServlet {
    public LoginServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        ServletContext servletContext = this.getServletContext();
        Integer userNumber =(Integer) servletContext.getAttribute("UserNumber");
        int tmp=0;
        synchronized (this){
            if(userNumber==null){
                userNumber=Integer.valueOf(1);
            }else {
                userNumber=userNumber.intValue()+tmp;
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
