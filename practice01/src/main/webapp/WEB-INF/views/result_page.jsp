<%@page import="edu.hi.ex.vo.Rsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page errorPage="erroPage.jsp"  %>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>RockscissorPaper Project</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="wrapper">
        <div class="wrapper_inner">
            <div class="show_result">
                <div class="left">
                    <div class="tit">You</div>
                    <img src="img/${rsp.toString(rsp.rsp)}_icon.png" alt="${rsp.toString(rsp.rsp)}_img">
                    <p>${rsp.toString(rsp.rsp)}</p>
                </div>
                <div class="vs result_page">vs</div>
                <div class="right">
                    <div class="tit">Computer</div>
                    <img src="img/${rsp.toString(rsp.com)}_icon.png" alt="${rsp.toString(rsp.com)}_img">
                    <p>${rsp.toString(rsp.com)}</p>
                </div>
                <div class="result">${rsp.run()}</div>
            </div>
            
            <a href="main" class="back"><img src="img/reset_icon.png">다시하기</a>
            
        </div>
    </div>
</body>
</html>