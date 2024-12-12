package com.yedam;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.control.BoardControl;
import com.yedam.control.BoardFormControl;
import com.yedam.control.BoardListControl;
import com.yedam.control.LoginControl;
import com.yedam.control.LoginFormControl;
import com.yedam.control.LogoutControl;
import com.yedam.control.ModifyBoardControl;
import com.yedam.control.ModiryFormControl;

/*
 * url pattern에서 ??.do => FrontControl을 실행
 */

public class FrontControl extends HttpServlet {
	Map<String, Control> map;

	// 생성자 만들기
	public FrontControl() {
		map = new HashMap<>();// 필드의 값을 초기화.
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/boardList.do", new BoardListControl());//목록
		map.put("/board.do", new BoardControl());//상세
		//게시글 등록
		map.put("/boardForm.do", new BoardFormControl());//화면
		map.put("/board.do", new BoardControl());//실제 처리
		//게시글 수정화면
		map.put("/modifyForm.do", new ModiryFormControl());
		map.put("/modifyBoard.do", new ModifyBoardControl());
	//로그인 화면
		map.put("/loginForm.do", new LoginFormControl());
		map.put("/login.do", new LoginControl());
	//로그아웃.
		map.put("/logout.do", new LogoutControl());
	
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// http://localhost:80/BoardWeb/boardList.do
		String uri = req.getRequestURI();
		System.out.println(uri);
		String context = req.getContextPath();
		String path = uri.substring(context.length());
		System.out.println(path);// "/boardList.do"공통부분을 제외한 나머지 부분.

		// 요청url === 실행할 컨트롤
		Control control = map.get(path);
		control.exec(req, resp);
	}

}
