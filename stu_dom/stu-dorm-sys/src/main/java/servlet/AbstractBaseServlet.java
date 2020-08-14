package servlet;

import model.Response;
import util.JSONUtil;
import util.ThreadLocalHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class AbstractBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        Response response = new Response();
        try {
            Object o = process(req,resp);
            response.setCode("200");
            response.setMassage("操作成功");
            response.setSuccess(true);
            response.setTotal(ThreadLocalHolder.get().get());
            response.setData(o);
        } catch (Exception e) {
            response.setCode("500");
            response.setMassage(e.getMessage());
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString();
            System.err.println(stackTrace);
            response.setStacktrace(stackTrace);
        }finally {
            //一定记住,在使用完ThreadLocalHolder在线程结束前remove这个歌变量,否则容易出现内存泄漏
            ThreadLocalHolder.get().remove();//
        }
        PrintWriter pw = resp.getWriter();
        pw.println(JSONUtil.write(response));
        pw.flush();
    }

    public abstract Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
