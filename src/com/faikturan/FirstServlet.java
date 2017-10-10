package com.faikturan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("You are inside do get method of the FirstServlet class...");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h1>");
//		out.println("This is a response form the servlet");
//		out.println("</h1>");
//		out.println("<a href=\"index.html\">Index</a>");
//		out.println("</body>");
//		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("here in do post");
		response.setContentType("text/hmtl");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		
		if (name.equals("faik")) {
			out.println("Success");
		}else{
			out.println("Error");
		}
	}

}
