package Serve;

import dao.Store.StoreMessage;
import dao.Store.StoreUserMessage;
import domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Filter extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        try {
            BeanUtils.populate(user, request.getParameterMap());
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        HttpSession hs = request.getSession ();
        if(hs.isNew ()){
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/views/index.jsp").forward(request, response);
        }

        User u = null;

        StoreUserMessage sum = new StoreMessage ();
        try {
            u = sum.StoreStatus (user);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        if(u.getmsg ()==true){
            try {
                u = sum.StoreData (user);
                logical log = new logical ();
                if(log.Logical (u)==null){
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                }

            } catch (Exception e) {
                e.printStackTrace ();
            }
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
