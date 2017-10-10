package com.faikturan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("here in do get....");
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			//ServletConfig config = getServletConfig();
			ServletContext context = getServletContext();
			context.setAttribute("name", "Faik");
			
			out.println("<a href=\"servlet2\">Servlet2</a>");
			
			out.close();
	}

	

}
