package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		String snum = req.getParameter("num");
		int num = 2;
		if (snum != null) {
			num = Integer.parseInt(snum);
		}
		out.println("<h2>" + num + "단입니다.</h2>");
		for (int i = 1; i < 10; i++) {
			out.println("<ul>" + num + "*" + i + "=" + i * num + "</ul>");
			System.out.println("<ul>" + num + "*" + i + "=" + i * num + "</ul>");
		}
		out.close();
	}
}
