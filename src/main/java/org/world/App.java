package org.world;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class App {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("Hello World!");
        Tomcat tomcat = new Tomcat();

        // Set the port
        tomcat.setPort(8080);

        // Set the context
        String docBase = new File(".").getAbsolutePath(); // Current directory
        Context context = tomcat.addContext("", docBase);

        // Add the servlet
        Tomcat.addServlet(context, "h1", new Servlet1());
        context.addServletMappingDecoded("/hello", "h1");

        // Start Tomcat
        tomcat.start();
        tomcat.getServer().await();
    }
}
