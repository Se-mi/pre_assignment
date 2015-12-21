<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<html>

<head>
	<title>Home</title>
</head>

<body>
<header>
	<h1>방명록 사이트</h1>
</header>
<section>
		<form id="writeform" method = "POST" action="write">
        <table class="board_view">
            <colgroup>
                <col width="15%">
                <col width="*"/>
            </colgroup>
            
            	<h1>방명록 작성</h1>
            <tbody>
                <tr>
                    <th scope="row">email</th>
                    <td><input type="text" id="email" name="email" class="wdp_90"></input></td>
                </tr>
                <tr>
                    <th scope="row">password</th>
                    <td><input type="text" id="password" name="password" class="wdp_90"></input></td>
                </tr>
                <tr>
                    <td colspan="2" class="view_text">
                        <textarea rows="20" cols="50" title="내용" id="CONTENTS" name="CONTENTS"></textarea>
                    </td>
                </tr>
            </tbody>
        </table>
        <button type="submit" id="write" name="writebtn">등록</button>
        
        </form>
	<article>
	<h3>게시물 목록</h3>

	</article>
</section>
<footer>
<P>  The time on the server is ${serverTime}. </P>

</footer>
<script src="jquery.min.js"></script>
<script src="application.js"></script>

<!-- 
$(document).ready(function(){
    $("#write").on("click", function(e){
        e.preventDefault();
        fn_insertBoard();
    });
});
  
function fn_insertBoard(){
    var comSubmit = new ComSubmit("writeform");
    comSubmit.setUrl("<c:url value='/web07/write' />");
    comSubmit.submit();
}
-->

</body>
</html>
