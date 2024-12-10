package com.yedam;

import java.io.IOException;

import com.yedam.common.Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModiryFormControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//게시글 번호 21번에 대한 조회결과 html/modifyForm.jsp출력.
		req.getRequestDispatcher("html/modifyForm.jsp").forward(req, resp);
		
		//수정항목은 제목, 내용으로 제한.input태그 사용
		
		
	}

}
