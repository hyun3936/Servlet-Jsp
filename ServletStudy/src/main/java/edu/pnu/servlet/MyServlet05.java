package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet05")
	public class MyServlet05 extends HttpServlet {
		private static final long serialVersionUID = 1L;

		@Override
		public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("MyServlet05");
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			
			out.println("<html>"
					+ "<head>"
					+ "<style>"
					+ "table, th, td {"
					+ "  border: 3px solid black;"
					+ "  border-collapse:collapse;"
					+ "  text-align:center;"
					+ "  background-color:orange;"
					+ "}"
					+ "</style>"
					+ "</head>"
					
					+"<body>"
					+ "<table>"
						+ "<tr>"
							+ "<td>번호</td>" + "<td>나라</td>" + "<td>수도</td>" + "<td>인구</td>"  
						+ "</tr>"
							
						+ "<tr>"
							+ "<td>1</td>" + "<td>대한민국</td>" + "<td>서울</td>" + "<td>1000만</td>" 
						+ "</tr>"
							
						+ "<tr>"
							+ "<td>2</td>" + "<td>미국</td>" + "<td>워싱턴</td>" + "<td>70만</td>" 
						+ "</tr>"
							
						+ "<tr>"
							+ "<td>3</td>" + "<td>일본</td>" + "<td>도쿄</td>" + "<td>1400만</td>"
						+ "</tr>"
							
						+ "<tr>"
							+ "<td>1</td>" + "<td>중국</td>" + "<td>북경</td>" + "<td>2100만</td>"
						+ "</tr>"
					+ "</table>"
				+ "</body>"
			+ "</html>");
					
					
			
			out.close();
		}
	}

