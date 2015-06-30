<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="common.jsp"%>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/tab.js"></script>
</head>

<body>
	<div id="head">
		<div class="head_top">
			<ul>
				<li style="width: 200px; border-right-style: none;">嗨，欢迎来做客！&nbsp;&nbsp;</li>
				<li><a href="login.html">请登录</a></li>
				<li style="border-right-style: none;">&nbsp;免费注册</li>
				<li style="padding-left: 530px;">我的来客</li>
				<li>&nbsp;我要吐槽</li>
				<li>&nbsp;会员服务</li>
				<li>&nbsp;招商加盟</li>
				<li>&nbsp;帮助中心</li>
				<li>&nbsp;联系客服</li>
				<li style="border-right-style: none;">&nbsp;网站导航</li>
			</ul>
		</div>
		<div class="head_logo">
			<img src="images/logo.jpg" width="621" height="80" />
		</div>
		<div class="head_address">
			<select class="myinput"
				style="FONT-FAMILY: Tahoma; height: 30px; border: solid #c23031 1px;"
				onchange="SelectLang(this.form)" size="1" name="城市">
				<option value="gb">北京</option>
				<option value="big5">天津</option>
				<option value="en">乌鲁木齐</option>
			</select> <input type="hidden" name="Lang" />
		</div>
		<div class="head_search">
			<input name="搜 索" type="text"
				style="border: none; height: 28px; width: 325px; margin-left: -9px; margin-right: -9px;"
				size="30" maxlength="100" />
			<div class="head_search_button">搜 索</div>
		</div>
	</div>
</body>
</html>
