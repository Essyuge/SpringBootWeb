package org.world;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service method");
        res.setContentType("text/html"); // Set content type
        res.getWriter().write("<h1>Hello from Servlet1</h1>"); // Send response to the browser
    }
}
