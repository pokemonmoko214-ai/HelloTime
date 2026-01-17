package Servlet;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String action = request.getParameter("action");
		if ("time".equals(action)) {
			//今の時間を取得
			LocalDateTime now = LocalDateTime.now();
			String time = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
			//リクエストスコープにtimeを渡す
			request.setAttribute("time", time);
		}

		//Time.jspへフォワード
		request.getRequestDispatcher("Time.jsp").forward(request, response);
	}




}
