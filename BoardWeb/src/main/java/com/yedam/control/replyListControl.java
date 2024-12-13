package com.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.vo.ReplyDAO;
import com.yedam.vo.ReplyVO;

public class replyListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/json;charset=utf-8");
		String rno = req.getParameter("bno");
		// 댓글 -> 자바스크립트 objdct -> 문자열 : json

//		let obj = {name:"홍길동", age: 20}
//		JSON.stringify()
//		{"name":"홍길동","age":20} =json문자열.
		ReplyDAO rdao = new ReplyDAO();
		List<ReplyVO> list = rdao.selectList(Integer.parseInt(rno));
		String json = "[";
		for (int i = 0; i < list.size(); i++) {
			json += "{\"replyNo\": " + list.get(i).getReplyNo()//
					+ ", \"reply\":\"" + list.get(i).getReply() + "\""//
					+ ", \"replyer\": \"" + list.get(i).getReplyer() + "\""//
					+ ", \"replyDate\": \"" + list.get(i).getReplyDate() + "\"}";
			if (i + 1 != list.size()) {
				json += ",";//[{},{},{}]
			}
		}
		json += "]";
		resp.getWriter().print(json);

	}

}
//{\"name\":\"홍길동\",\"age\":20}"
//+ ",{\"name\":\"홍길동\",\"age\":20}"
//+ ",{\"name\":\"홍길동\",\"age\":20}"
//+ 