package com.yedam.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //page,sc,kw 모두 만들어주는 생성자 역할
public class SearchDTO {
	private int page;
	private String searchCondition;
	private String keyword;
}
