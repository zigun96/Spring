<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<table class="table table-striped table-bordered table-hover">
	<thread>
		<tr>
			<th>#번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>수정일</th>
		</tr>
	</thread>
	
	<c:forEach items="${list}" var="board">
		<tr>
			<td><c:out value="${board.bno}"/></td>
			<td><a class="move" href="<c:out value="${board.bno}"/>">
					<c:out value="${board.title}" />
				</a></td>
			<td><c:out value="${board.writer}" /></td>
			<td><fmt:formatDate pattern="yyyy-mm-dd" value="${board.regdate}" /></td>
			<td><fmt:formatDate pattern="yyyy-mm-dd" value="${board.updateDate}" /></td>
		</tr>
	</c:forEach>
</table>