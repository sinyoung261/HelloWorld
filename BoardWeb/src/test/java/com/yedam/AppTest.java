package com.yedam;

import java.util.List;

import com.yedam.vo.ReplyDAO;
import com.yedam.vo.ReplyVO;

public class AppTest {
	public static void main(String[] args) {
		ReplyVO rv = new ReplyVO();
		rv.setBoardNo(360);
		rv.setReply("댓글테스트1234");
		rv.setReplyer("user99");
		
		ReplyDAO rdao = new ReplyDAO();
		if(rdao.insertReply(rv)) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		List<ReplyVO> list = rdao.selectList(360, 55);
		for(ReplyVO rvo : list) {
			System.out.println(rvo.toString());
		}
	}
}
