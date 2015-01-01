package sample.javaee.ejb.servlet;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.ejb.AsyncMethodBean;

@WebServlet("/async-method")
public class AsyncMethodServlet extends HttpServlet {
    
    @EJB
    private AsyncMethodBean ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("before thread=" + Thread.currentThread().getName());
        Future<String> result = this.ejb.asyncMethod();
        System.out.println("after thread=" + Thread.currentThread().getName());
        
        try {
            System.out.println("result=" + result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
