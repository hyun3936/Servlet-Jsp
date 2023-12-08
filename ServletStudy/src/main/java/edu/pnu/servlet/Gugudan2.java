package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan2")
public class Gugudan2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");

		
		PrintWriter out = res.getWriter();
		
		
//		if (d == null) {
//			for (int i = 2; i < 10; i++) {
//				out.println("<h2>" + i + "단입니다.</h2>");	
//				for (int j = 1; j < 10; j++) {
//					out.println("<ul>" + i + "*" + j + "=" + i * j + "</ul>");			
//				}
//			}
//		}
		
		// 옵션(dir)을 가론지 세론지 받아들여서 변수 d에 저장.
		String d = req.getParameter("dir");
		

		// 옵션 (dir)이 없으면 기본으로 d에다가 ver로 설정;
		// 입력안해줬을때 기본값으로 ver 설정.
		if (d == null)
			d = "ver";
		
		// d가 ver이면 수직으로 출력
		if (d.equals("ver")) {
			for (int i = 2; i < 10; i++) {
				out.println("<h2>" + i + "단입니다.</h2>");	
				for (int j = 1; j < 10; j++) {
					out.println("<ul>" + i + "*" + j + "=" + i * j + "</ul>");
				}
			}
		}
		
		// d가 ver가 아니면 수평으로 출력
		// 한줄만 출력해보기 2*1, 3*1 ....
		else {
			for (int i = 2; i < 10; i++) {	
				out.print("<h2>" + i + "단입니다.</h2>");
					out.print("<ul>" + i + "*" + 1 + "=" + i * 1 + "</ul>");
				}
			}		
		out.close();
	}
}
