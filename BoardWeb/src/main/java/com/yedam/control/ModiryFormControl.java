package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.jdbc.BoardDAO;
import com.yedam.vo.BoardVO;

public class ModiryFormControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//게시글 번호 21번에 대한 조회결과 html/modifyForm.jsp출력.
		//수정항목은 제목, 내용으로 제한.input태그 사용
		String bno = req.getParameter("board_no");//21
		//파라미터 추가 작업2024.12.12
		String page = req.getParameter("page");
		String sc = req.getParameter("searchCondition");
		String kw =  req.getParameter("keyword");
		
		BoardDAO bdao = new BoardDAO();
		BoardVO bvo = bdao.selectBoard(Integer.parseInt(bno)); //글번호 상세정보 
		
		//조회한 board정보를 jsp페이지에 전달.
		req.setAttribute("board", bvo);
		//파라미터 추가 작업2024.12.12
		req.setAttribute("searchCondition", sc);
		req.setAttribute("keyword", kw);
		req.setAttribute("page", page);
		
		req.getRequestDispatcher("WEB-INF/html/modifyForm.jsp").forward(req, resp);
		
		
		
	}

}
