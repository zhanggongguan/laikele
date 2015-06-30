<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="common/common.jsp" %>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/tab.js"></script>
</head>
<body>


	<!-- 头部开始-->
	<div align="center">
	<%@include file="common/header.jsp" %>
	<!-- 
		<iframe name="I1" src="head.html" border="0" frameborder="0"
			width="1200" height="158" marginwidth="0" marginheight="0">
		</iframe> -->
	</div>
	<div style="clear: both;"></div>
	<!-- 头部结束-->
	<!-- 主题内容开始-->
	<div id="main">
		<div class="menu_left">
			<div
				style="position: relative; left: 0px; top: -30px; z-index: 100px; font-size: 20px; font-family: '微软雅黑'; color: #FFF; font-weight: bold; text-align: center;">全部商铺分类</div>
			<ul>
				<li><img src="images/nvzhuang_icon.jpg" width="20" height="20" />
					女装品牌店</li>
				<li
					style="padding-left: 24px; font-size: 12px; font-weight: normal;">
					茵曼、韩都衣舍、ONLY、初语...</li>
			</ul>
			<ul>
				<li><img src="images/nanzhuang_icon.jpg" width="20" height="20" />
					男装品牌店</li>
				<li
					style="padding-left: 24px; font-size: 12px; font-weight: normal;">
					巴宝莉、劲霸、恒源祥、七匹狼...</li>
			</ul>
			<ul>
				<li><img src="images/xiemao_icon.jpg" width="20" height="20" />
					鞋帽箱包品牌店</li>
				<li
					style="padding-left: 24px; font-size: 12px; font-weight: normal;">
					柯玛妮克、骆驼、木林森、老人头...</li>
			</ul>
			<ul>
				<li><img src="images/yundong_icon.jpg" width="20" height="20" />
					运动户外品牌店</li>
				<li
					style="padding-left: 24px; font-size: 12px; font-weight: normal;">
					阿迪达斯、Nike/耐克、亚瑟士...</li>
			</ul>
			<ul>
				<li><img src="images/huazhuangpin_icon.jpg" width="20"
					height="20" /> 化妆品专卖店</li>
				<li
					style="padding-left: 24px; font-size: 12px; font-weight: normal;">
					兰蔻、自然堂、百雀羚、韩束...</li>
			</ul>
			<ul>
				<li><img src="images/chaoshi_icon.jpg" width="20" height="20" />
					生活超市</li>
				<li
					style="padding-left: 24px; font-size: 12px; font-weight: normal;">
					华润万家、家乐福、沃尔玛、永旺...</li>
			</ul>
		</div>

		<div class="menu">
			<ul>
				<li><a href="#" target="_parent">首页</a></li>
				<li>王府井</li>
				<li>中关村</li>
				<li>大望路</li>
				<li>西单</li>
				<li style="border-right: none;">亚运村</li>
				<li
					style="font-family: 'Arial'; font-size: 12px; padding-left: 325px; border-right: none;">>>More</li>
			</ul>
		</div>
		<div class="banner">
			<img src="images/index_10.jpg" width="706" height="257" />
		</div>
		<div class="notice">
			<div class="tab1">
				<ul id="test1_li_now_">
					<li class="now">公告</li>
					<li>活动</li>
				</ul>
			</div>
			<div>
				<div id="test1_1" class="tablist block">
					<span>来客了与某某某达成合作...</span><br /> <span>入住商铺高达五万家... </span>
				</div>
				<div id="test1_2" class="tablist">
					<span>入住商铺高达五万家... </span><br /> <span>来客了与某某某达成合作...</span>
				</div>

			</div>
			<div style="padding-top: 25px; padding-left: 180px;">>>更多</div>
		</div>
		<div class="login">
			<p style="padding-left: 90px; padding-top: 30px;">Hi 您好，欢迎光临！</p>
			<p style="padding-left: 80px; padding-top: 20px;">
				<img src="images/login.gif" width="58" height="31" /><img
					style="padding-left: 10px;" src="images/regist.gif" width="58"
					height="31" />
			</p>
		</div>

		<div class="banner_bom_contentleft">
			<font
				style="font-family: '微软雅黑'; font-size: 16px; color: #333333; font-weight: bold;">6IXTY8IGHT大悦城店低至3折</font><br />
			第一韩式炸鸡门店开业酬宾<br /> [聚丰快捷宾馆] 聚丰快捷宾馆会员卡9.0折优惠<br /> [五台山二日游]
			五台山汽车二日游每人398元起<br /> [大地影院] 大地影院天津马可波罗10元观影<br />
		</div>
		<div class="banner_bom_contentright">
			<font
				style="font-family: '微软雅黑'; font-size: 16px; color: #333333; font-weight: bold;">伊势丹玖熙女鞋年度回馈</font><br />
			港丽餐厅满100享每日半价优惠<br /> [老北京四日游] 老北京四日品质游每人800起<br /> [河北古城两日游]
			河北九朝古城两日游每人337元<br /> [土大力] 土大力新品泡菜包套餐78元特惠<br />
		</div>

		<div class="contact">
			<p
				style="font-family: '微软雅黑'; font-size: 18px; font-weight: bold; padding-left: 80px; padding-top: 20px; color: #c23131;">在线客服</p>
			<p style="padding-left: 55px; padding-top: 5px;">
				<img src="images/ewm.jpg" width="123" height="122" />
			</p>
		</div>

		<div class="sjtj">
			<p
				style="font-family: '宋体'; font-size: 14px; font-weight: bold; color: #414040; padding-top: 8px; padding-left: 8px;">商家统计</p>
			<p
				style="font-family: '宋体'; font-size: 12px; font-weight: bold; color: #333333; padding-top: 10px; padding-left: 20px;">
				<font color="#c23131" face="Berlin Sans FB Demi"
					style="font-weight: bold; font-size: 24px;">60000</font> 家商户入住
			</p>
			<p class="sjtj_content">
				<font class="sjtj_content_dot">.</font>味多美[国贸]<font
					class="sjtj_content_discount">8.0折</font>
			</p>
			<p class="sjtj_content">
				<font class="sjtj_content_dot">.</font>七匹狼[西单]<font
					class="sjtj_content_discount">8.0折</font>
			</p>
			<p class="sjtj_content">
				<font class="sjtj_content_dot">.</font>味多美[国贸]<font
					class="sjtj_content_discount">28.0折</font>
			</p>
		</div>

		<div class="fuzhuang">
			<ul style="border-top: none;">
				<li><img src="fuzhuangpinpai/nv1.gif" width="90" height="37" /></li>
				<li><img src="fuzhuangpinpai/nv2.gif" width="96" height="37" /></li>
				<li><img src="fuzhuangpinpai/nv3.gif" width="99" height="37" /></li>
				<li><img src="fuzhuangpinpai/nv4.gif" width="85" height="37" /></li>
				<li><img src="fuzhuangpinpai/nv5.gif" width="93" height="37" /></li>
				<li style="border-right: none;"><img
					src="fuzhuangpinpai/nv6.gif" width="86" height="37" /></li>
			</ul>
			<ul>
				<li><img src="fuzhuangpinpai/nan1.gif" width="90" height="32" /></li>
				<li><img src="fuzhuangpinpai/nan2.gif" width="96" height="32" /></li>
				<li><img src="fuzhuangpinpai/nan3.gif" width="99" height="32" /></li>
				<li><img src="fuzhuangpinpai/nan4.gif" width="85" height="32" /></li>
				<li><img src="fuzhuangpinpai/nan5.gif" width="93" height="32" /></li>
				<li style="border-right: none;"><img
					src="fuzhuangpinpai/nan6.gif" width="86" height="32" /></li>
			</ul>
			<ul style="height: 92px;">
				<li style="border: none; width: 220px;"><img
					src="fuzhuangpinpai/chao1.gif" width="155" height="57" /></li>
				<li style="border: none; width: 220px; padding-top: 3px;"><img
					src="fuzhuangpinpai/chao2.gif" width="164" height="90" /></li>
				<li style="border: none; width: 220px; padding-top: 16px;"><img
					src="fuzhuangpinpai/chao3.gif" width="186" height="56" /></li>
				<li style="border: none; width: 220px; padding-top: 13px;"><img
					src="fuzhuangpinpai/chao4.gif" width="273" height="80" /></li>
			</ul>
		</div>

		<div class="guanggao">
			<img src="images/index_22.jpg" width="1200" height="150" />
		</div>
		<div class="discount">
			<div class="discount_menu">最新优惠</div>
		</div>
		<div class="discount1">
			<p class="discount1_menu">
				<font class="discount1_nv">女装店</font><font class="discount1_con1">时尚青春，折翻天！</font>
				<font class="discount1_more">>> 更多</font>
			</p>
			<div class="discount1_ima">
				<img src="images/nvzhuang_ima.jpg" width="266" height="395" />
			</div>
			<div class="discount1_con1_right">
				商家折扣 --------------------------<br /> <font
					class="discount1_pinpai1">艾格女装专卖店</font> <font
					class="discount1_zhekou1">5.0折</font><br /> <font
					class="discount1_list1">十周年店庆感恩回馈活动，全场5.0折优惠，</font><br /> <font
					class="discount1_list1">到店即可获得精美礼品一份，先到先得....</font><br /> <font
					class="discount1_pinpai1">Teenie Weenie专卖店</font> <font
					class="discount1_zhekou11">5.0折</font><br /> <font
					class="discount1_list1">冬装来袭，现在购买即可享受8.0折新品优</font><br /> <font
					class="discount1_list1">惠价....</font><br /> 位置推荐
				--------------------------<br /> <font class="discount1_list1">[王府井
					茵&nbsp;&nbsp;曼]</font> <font class="discount1_list11">全场5.0折优惠</font><br />
				<font class="discount1_list1">[大望路 阿依莲]</font> <font
					class="discount1_list11">全场8.0折优惠</font><br /> <font
					class="discount1_list1">[望&nbsp;&nbsp;京 初&nbsp;&nbsp;语]</font> <font
					class="discount1_list11">全场7.0折优惠</font><br /> <font
					class="discount1_list1">[五棵松&nbsp;&nbsp; ONLY]</font> <font
					class="discount1_list11">全场8.0折优惠</font>
			</div>
		</div>

		<div class="discount2">
			<p class="discount1_menu">
				<font class="discount1_nv">男装店</font><font class="discount1_con1">潮牌盛典，优惠中！</font>
				<font class="discount1_more">>> 更多</font>
			</p>
			<div class="discount1_ima">
				<img src="images/nanzhuang_ima.jpg" width="266" height="395" />
			</div>
			<div class="discount1_con1_right">
				商家折扣 --------------------------<br /> <font
					class="discount1_pinpai1">boss男装国贸专卖店</font> <font
					class="discount1_zhekou21">8.0折</font><br /> <font
					class="discount1_list1">最后四天大甩卖，国际大品牌，全场8.0折</font><br /> <font
					class="discount1_list1">优惠....</font><br /> <font
					class="discount1_pinpai1">范思哲专卖店</font> <font
					class="discount1_zhekou2">3.0折</font><br /> <font
					class="discount1_list1">店铺租期到期，清仓大甩卖，到店即可享受</font><br /> <font
					class="discount1_list1">最低优惠，最低3折起....</font><br /> 位置推荐
				--------------------------<br /> <font class="discount1_list1">[王府井
					七匹狼]</font> <font class="discount1_list11">全场8.0折优惠</font><br /> <font
					class="discount1_list1">[西单 海澜之家]</font> <font
					class="discount1_list11">全场7.0折优惠</font>
			</div>
		</div>

		<div class="discount3">
			<p class="discount1_menu">
				<font class="discount1_nv">运动户外</font><font class="discount1_con1">质优价廉，折翻天！</font>
				<font class="discount1_more2">>> 更多</font>
			</p>
			<div class="discount1_ima">
				<img src="images/yd_ima.jpg" width="266" height="395" />
			</div>
			<div class="discount1_con1_right">
				商家折扣 --------------------------<br /> <font
					class="discount1_pinpai1">骆驼户外运动国贸店</font> <font
					class="discount1_zhekou3">2.8折</font><br /> <font
					class="discount1_list1">冲锋衣在2.8折的基础上叠加优惠后价格比</font><br /> <font
					class="discount1_list1">较实惠....</font><br /> <font
					class="discount1_pinpai1">通州苏宁店户外运动专区</font> <font
					class="discount1_zhekou31">3.0折</font><br /> <font
					class="discount1_list1">苏宁年终店庆运动品牌优惠活动-苏宁运动</font><br /> <font
					class="discount1_list1">户外全场3.0折起....</font><br /> 位置推荐
				--------------------------<br /> <font class="discount1_list1">[国贸
					哥伦比亚]</font> <font class="discount1_list31">户外运动鞋5.0折</font><br /> <font
					class="discount1_list1">[西&nbsp;&nbsp;单 土拨鼠]</font> <font
					class="discount1_list31">户外冲锋衣5.0折</font><br /> <font
					class="discount1_list1">[中关村 探路者]</font> <font
					class="discount1_list32">户外运动器材6.0折</font>
			</div>
		</div>

		<div class="discount4">
			<p class="discount1_menu">
				<font class="discount1_nv">鞋帽箱包</font><font class="discount1_con1">无法停止，奔跑吧！</font>
				<font class="discount1_more2">>> 更多</font>
			</p>
			<div class="discount1_ima">
				<img src="images/nanzhuang_ima.jpg" width="266" height="395" />
			</div>
			<div class="discount1_con1_right">
				商家折扣 --------------------------<br /> <font
					class="discount1_pinpai1">茜茜公主箱包直营店</font> <font
					class="discount1_zhekou4">5.0折</font><br /> <font
					class="discount1_list1">红谷旗下原创品牌真皮打折促销活动，茜茜</font><br /> <font
					class="discount1_list1">公主3013年9月优惠，秋促狂减....</font><br /> <font
					class="discount1_pinpai1">ELLE女包品牌旗舰店</font> <font
					class="discount1_zhekou41">7.0折</font><br /> <font
					class="discount1_list1">箱包加盟，ELLE品牌女包特价优惠7.0折....</font><br />
				位置推荐 --------------------------<br /> <font class="discount1_list1">[天通苑&nbsp;&nbsp;
					金利来] </font> <font class="discount1_list41">龙德广场金利来专卖</font><br />
				<font class="discount1_list411">店全场5.0折优惠</font><br /> <font
					class="discount1_list1">[通州万达 登喜路]</font> <font
					class="discount1_list41">万达广场买包满100送</font><br />
				<font class="discount1_list411">电影票</font>
			</div>
		</div>

		<div class="chaoshi">
			<div class="chaoshi_menu">超市信息/化妆品</div>
		</div>
		<div class="chaoshi1">
			<p class="chaoshi1_menu">
				<font class="chaoshi1_nv">超市信息</font><font class="chaoshi1_con1">物美价廉，折翻天！</font>
				<font class="chaoshi1_more">>> 更多</font>
			</p>
			<div class="chaoshi1_ima">
				<p>
					<img src="images/c1.jpg" width="206" height="95" />
				</p>
				<p style="padding-top: 40px;">
					<img src="images/c2.jpg" width="206" height="95" />
				</p>
				<p style="padding-top: 40px;">
					<img src="images/c3.jpg" width="206" height="95" />
				</p>
			</div>
			<div class="chaoshi1_con1_right">
				<font class="chaoshi1_pinpai1">[西单店]16年店庆，全场商品<font
					class="chaoshi1_zhekou1">5.0折</font>起
				</font><br /> <font class="chaoshi1_pinpai1">[通州店]店内波士登品牌换季清仓，低至<font
					class="chaoshi1_zhekou1">2.0折</font></font><br /> <font
					class="chaoshi1_pinpai1">[天通苑店]会员活动促销中，所有商品累计满100返40</font><br />
				<font class="chaoshi1_line1">---------------------------------------------------</font>
				<p style="padding-top: 15px;">
					<font class="chaoshi1_pinpai1">[西单店]16年店庆，全场商品<font
						class="chaoshi1_zhekou1">5.0折</font>起
					</font><br /> <font class="chaoshi1_pinpai1">[通州店]店内波士登品牌换季清仓，低至<font
						class="chaoshi1_zhekou1">2.0折</font></font><br /> <font
						class="chaoshi1_pinpai1">[天通苑店]会员活动促销中，所有商品累计满100返40</font><br />
					<font class="chaoshi1_line1">---------------------------------------------------</font>
				</p>
				<p style="padding-top: 15px;">
					<font class="chaoshi1_pinpai1">[西单店]16年店庆，全场商品<font
						class="chaoshi1_zhekou1">5.0折</font>起
					</font><br /> <font class="chaoshi1_pinpai1">[通州店]店内波士登品牌换季清仓，低至<font
						class="chaoshi1_zhekou1">2.0折</font></font><br /> <font
						class="chaoshi1_pinpai1">[天通苑店]会员活动促销中，所有商品累计满100返40</font>
				</p>
			</div>
		</div>

		<div class="chaoshi2">
			<p class="chaoshi1_menu">
				<font class="chaoshi1_nv">化妆品</font><font class="chaoshi1_con1">美妆护肤，看这里！</font>
				<font class="chaoshi2_more">>> 更多</font>
			</p>
			<div class="chaoshi1_ima">
				<p>
					<img src="images/h1.jpg" width="206" height="95" />
				</p>
				<p style="padding-top: 40px;">
					<img src="images/h2.jpg" width="206" height="95" />
				</p>
				<p style="padding-top: 40px;">
					<img src="images/h3.jpg" width="206" height="95" />
				</p>
			</div>
			<div class="chaoshi1_con1_right">
				<font class="chaoshi1_pinpai1">[西单店]新到法国香水试用促销<font
					class="chaoshi1_zhekou1">5.0折</font>起
				</font><br /> <font class="chaoshi1_pinpai1">[九棵树店]新店开业，全场化妆品<font
					class="chaoshi1_zhekou1">6.0折</font>起
				</font><br /> <font class="chaoshi1_pinpai1">[国贸店]十周年店庆，部分高档化妆品享受<font
					class="chaoshi1_zhekou1">3.0折</font>折扣
				</font><br /> <font class="chaoshi1_line1">---------------------------------------------------</font>
				<p style="padding-top: 15px;">
					<font class="chaoshi1_pinpai1">[西单店]16年店庆，全场商品<font
						class="chaoshi1_zhekou1">5.0折</font>起
					</font><br /> <font class="chaoshi1_pinpai1">[通州店]店内所有护肤产品低至<font
						class="chaoshi1_zhekou1">2.0折</font></font><br /> <font
						class="chaoshi1_pinpai1">[天通苑店]会员活动促销中，所有商品累计满100返40</font><br />
					<font class="chaoshi1_line1">---------------------------------------------------</font>
				</p>
				<p style="padding-top: 15px;">
					<font class="chaoshi1_pinpai1">[西单店]新到法国香水试用促销<font
						class="chaoshi1_zhekou1">5.0折</font>起
					</font><br /> <font class="chaoshi1_pinpai1">[通州店]店内部分洗护用品低至<font
						class="chaoshi1_zhekou1">2.0折</font></font><br /> <font
						class="chaoshi1_pinpai1">[天通苑店]会员活动促销中，所有商品累计满100返40</font>
				</p>
			</div>
		</div>

		<div class="tuangou">
			<div class="tuangou_menu">品牌团购</div>
		</div>
		<div class="tuangou1">
			<p class="tuangou1_menu">
				<font class="tuangou1_nv">服饰团购</font><font class="tuangou1_more">>>
					更多</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 七匹狼男装团购<font
					class="tuangou1_jiage">699元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 海澜之家男装团购 <font
					class="tuangou1_jiage11">499元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 海澜之家男装团购 <font
					class="tuangou1_jiage11">499元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 海澜之家男装团购 <font
					class="tuangou1_jiage11">499元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 海澜之家男装团购 <font
					class="tuangou1_jiage11">499元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 海澜之家男装团购 <font
					class="tuangou1_jiage11">499元</font>
			</p>
		</div>
		<div class="tuangou2">
			<p class="tuangou1_menu">
				<font class="tuangou1_nv">化妆品</font><font class="tuangou2_more">>>
					更多</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 相宜本草9.0折团购优惠<font
					class="tuangou2_jiage">199元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 丹姿水密码5.0折团购优惠<font
					class="tuangou2_jiage11">299元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 相宜本草9.0折团购优惠<font
					class="tuangou2_jiage">199元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 丹姿水密码5.0折团购优惠<font
					class="tuangou2_jiage11">299元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 相宜本草9.0折团购优惠<font
					class="tuangou2_jiage">199元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 丹姿水密码5.0折团购优惠<font
					class="tuangou2_jiage11">299元</font>
			</p>
		</div>
		<div class="tuangou3">
			<p class="tuangou1_menu">
				<font class="tuangou1_nv">鞋帽箱包</font><font class="tuangou1_more">>>
					更多</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 达芙妮9.0折团购优惠<font
					class="tuangou3_jiage">199元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 莱尔斯丹5.0折团购优惠<font
					class="tuangou3_jiage11">299元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 达芙妮9.0折团购优惠<font
					class="tuangou3_jiage">199元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 莱尔斯丹5.0折团购优惠<font
					class="tuangou3_jiage11">299元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[糯米网] 达芙妮9.0折团购优惠<font
					class="tuangou3_jiage">199元</font>
			</p>
			<p class="tuangou1_list">
				<font class="tuangou1_dot">.</font>[美团网] 莱尔斯丹5.0折团购优惠<font
					class="tuangou3_jiage11">299元</font>
			</p>
		</div>


		<div style="clear: both;"></div>
		<div style="width: 100%; height: 30px;"></div>
		<!-- 主题内容结束-->
		<!-- 底部开始-->
		<div align="center"><%@include file="common/footer.jsp" %></div>
		<!--  <iframe name="I1" style="margin: -3px;" src="foot.html" border="0"
			frameborder="0" width="1220" height="300" marginwidth="0"
			marginheight="0" scrolling="auto"> </iframe>-->
		<!-- 底部结束-->
	</div>

</body>

</html>
