package com.gaospot.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2018/12/23 6:29 PM
 * @description: //TODO
 */

public class HelloServlet extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello, World!";
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy() {
    }
}
