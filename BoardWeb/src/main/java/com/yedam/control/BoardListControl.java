package com.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.common.PageDTO;
import com.yedam.common.SearchDTO;
import com.yedam.jdbc.BoardDAO;
import com.yedam.vo.BoardVO;

public class BoardListControl implements Control{

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) //exec안에 데이터베이스를 넣어 기능을 만든다
	throws ServletException, IOException {
		
		String page = req.getParameter("page");// 페이지정보.
		page = page == null ? "1" : page;
		String sc =req.getParameter("searchCondition");
		String kw =req.getParameter("keyword");
		
		//@AllArgsConstructor
		//페이지, 검색조건, 키워드 => 게시글 목록
		SearchDTO search = new SearchDTO(Integer.parseInt(page), sc, kw);
		System.out.println(search);
		
		BoardDAO bdao = new BoardDAO();
		List<BoardVO> list = bdao.boardList(search);//실행영역에서는 실제값이 대입.2024.12.12
		//argument(매개 값)
		//search(실제 값) searchDTO(실행하는 메소드)
		
		int totalCont = bdao.selectCount(search);
		PageDTO pageDto = new PageDTO(Integer.parseInt(page), totalCont);
		
		
		req.setAttribute("list",list);
		req.setAttribute("paging", pageDto);
		req.setAttribute("searchCondition", sc);
		req.setAttribute("keyword", kw);
		//요청재지정
		req.getRequestDispatcher("WEB-INF/html/boardList.jsp").forward(req, resp);
	}

}
