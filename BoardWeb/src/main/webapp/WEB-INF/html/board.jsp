<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../includes/header.jsp"></jsp:include>
<!-- Page content-->
<h3>글상세화면(board.jsp)</h3>

<form action="modifyForm.do">
	<input type="hidden" name="board_no" value="${board.boardNo }">
	<input type="hidden" name="searchCondition"value="${searchCondition }">
	<input type="hidden" name="keyword" value="${keyword }">
	<input type="hidden" name="page" value="${page }">
	<table class="table">
		<tr>
			<th>글번호</th>
			<td>${board.boardNo }</td>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="1">${board.title }</td>
			<th>이미지</th>
			<td><img src="images/${board.img }" width="100px"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea rows="5" readonly class="form-control">${board.content }</textarea>
			</td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td>${board.creationDate }</td>
			<th>조회수</th>
			<td>${board.viewCnt }</td>
		</tr>
		<tr>
			<!--로그인상태 => 권한에 따라 활성화/비활성화.-->
			<!--//로그인상태 아니면 => 권한 없음-->
			<c:choose>
				<c:when test="${logId ne null and board.writer == logId}">
					<td colspan="4" align="center"><input type="submit"
						class="btn btn-warning" value="수정목록"></td>
				</c:when>
				<c:otherwise>
					<td colspan="4" align="center"><input type="submit"
						class="btn btn-warning" value="수정목록" disabled></td>
				</c:otherwise>
			</c:choose>
		</tr>
	</table>
</form>
<!-- board.jsp원래있던 부분. -->


<!-- 댓글시작 -->

<style>
div.reply .content ul{
list-style-type: none;
}
div.reply .content span{
display: inline-block;
}
</style>
<div class="reply">
<div class="header">
댓글내용: <input type="text" id="reply" class="col-sm-8">
<button  id="addBtn" class="col-sm-3 btn btn-primary">댓글등록</button>
</div><!-- 댓글등록 -->
<div class="content">
	<ul class="title">
		<li>
			<span class="col-sm-2">글번호</span>
			<span class="col-sm-5">내용</span>
			<span class="col-sm-2">작성자</span>
			<span class="col-sm-2">삭제</span>
		</li>
	</ul>
</div><!-- 댓글목록 -->
<div class="forword">
</div>

<div class="footer"></div>
</div>
<!-- 댓글끝. -->
<script>
let bno ="${board.boardNo}";//원본글번호.
let logId = "${logId }"; //작성자.
</script>
<script src="js/board.js"></script>

<jsp:include page="../includes/footer.jsp"></jsp:include>