package com.yedam;

import java.io.IOException;
import java.util.List;

import com.yedam.jdbc.BoardDAO;
import com.yedam.vo.BoardVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/boardList.action")
public class BoardListServ extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)//
			throws ServletException, IOException {
		BoardDAO bdao = new BoardDAO();
		List<BoardVO> boardList = bdao.boardList();
		// 요청객체에 boardList정보를 담아서 jsp 전달.
		req.setAttribute("list", boardList);
		// 요청재지정.
		req.getRequestDispatcher("html/boardList.jsp").forward(req, resp);
	}
}
