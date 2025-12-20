package com.example.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleStatusServlet extends HttpServlet {
    
    @Override
    // protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    //     throws ServletException, IOException {
    //     resp.setContentType("text/plain");
    //     PrintWriter writer = resp.getWriter();
    //     writer.write("Digital Credential Verification Engine is running");
    //     writer.flush();
    // }
    class TestServlet extends SimpleStatusServlet {
        public void callDoGet(HttpServletRequest req, HttpServletResponse res)
            throws Exception {
            super.doGet(req, res);
        }
    }
    TestServlet servlet = new TestServlet();
    servlet.callDoGet(request, response);   // ✅ allowed



}
