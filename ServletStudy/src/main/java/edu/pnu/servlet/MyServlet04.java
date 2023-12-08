package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


	@WebServlet("/myservlet04")
	public class MyServlet04 extends HttpServlet {
		private static final long serialVersionUID = 1L;

		@Override
		public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("MyServlet04");
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			
					out.println("<html>\r\n"
							+ "<head>\r\n"
							+ "<style>\r\n"
							+ "table, th, td {\r\n"
							+ "  border: 3px solid black;\r\n"
							+ "  border-collapse:collapse;\r\n"
							+ "}\r\n"
							+ "</style>\r\n"
							+ "</head>\r\n"
							
							+"<body>"
							+ "<table>"
								+ "<tr>"
									+ "<td>번호</td>" + "<td>나라</td>" + "<td>수도</td>" 
								+ "</tr>"
									
								+ "<tr>"
									+ "<td>1</td>" + "<td>대한민국</td>" + "<td>서울</td>"
								+ "</tr>"
									
								+ "<tr>"
									+ "<td>2</td>" + "<td>미국</td>" + "<td>워싱턴</td>"
								+ "</tr>"
									
								+ "<tr>"
									+ "<td>3</td>" + "<td>일본</td>" + "<td>도쿄</td>" 
								+ "</tr>"
									
								+ "<tr>"
									+ "<td>1</td>" + "<td>중국</td>" + "<td>북경</td>" 
								+ "</tr>"
							+ "</table>"
						+ "</body>");
							
					
			
			out.close();
		}
	}

