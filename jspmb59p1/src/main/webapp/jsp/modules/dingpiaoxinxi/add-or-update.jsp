<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑订票信息</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>订票信息管理</span></li>
								<li class="breadcrumb-item active"><span>编辑订票信息</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">订票信息信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>订票订单</label>
										<input id="dingpiaodingdan" name="dingpiaodingdan" class="form-control" value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>电影名称</label>
										<input id="dianyingmingcheng" name="dianyingmingcheng" class="form-control" placeholder="电影名称">
									</div>
									<div class="form-group col-md-6">
										<label>放映时间</label>
										<input id="fangyingshijian" name="fangyingshijian" class="form-control" placeholder="放映时间">
									</div>
									<div class="form-group col-md-6">
										<label>放映厅</label>
										<input id="fangyingting" name="fangyingting" class="form-control" placeholder="放映厅">
									</div>
									<div class="form-group col-md-6">
										<label>票数</label>
										<input id="piaoshu" name="piaoshu" class="form-control" onchange="calculation()">
									</div>
									<div class="form-group col-md-6">
										<label>票价</label>
										<input id="piaojia" name="piaojia" class="form-control" onchange="calculation()">
									</div>
									<div class="form-group col-md-6">
										<label>支付价格</label>
										<input id="zhifujiage" name="zhifujiage" class="form-control" placeholder="支付价格">
									</div>
									<div class="form-group col-md-6">
										<label>用户账号</label>
										<input id="yonghuzhanghao" name="yonghuzhanghao" class="form-control" placeholder="用户账号">
									</div>
									<div class="form-group col-md-6">
										<label>用户姓名</label>
										<input id="yonghuxingming" name="yonghuxingming" class="form-control" placeholder="用户姓名">
									</div>
									<div class="form-group col-md-6">
										<label>用户手机</label>
										<input id="yonghushouji" name="yonghushouji" class="form-control" placeholder="用户手机">
									</div>
									<div class="form-group col-md-6">
										<label>购票须知</label>
										<input id="goupiaoxuzhi" name="goupiaoxuzhi" class="form-control" placeholder="购票须知">
									</div>
									<div class="form-group col-md-6">
										<label>价格</label>
										<input id="price" type="number" name="price" class="form-control" placeholder="价格">
									</div>	
									<div class="form-group col-md-6">
										<label>座位总数</label>
										<input id="number" name="number" class="form-control" placeholder="座位总数">
									</div>
									<div class="form-group col-md-6">
										<label>已选座位[用,号隔开]</label>
										<textarea name="selected" class="form-control" id="selected" rows="3"></textarea>
									</div>
										
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">取消</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "dingpiaoxinxi";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};
				var piaoshuKucun = 0;


			function dingpiaodingdanUuid(){
				if($("#dingpiaodingdan").val() == null || $("#dingpiaodingdan").val() == "null" || $("#dingpiaodingdan").val() == ""){
					$("#dingpiaodingdan").attr("value",Math.round(new Date().getTime()/1000));
				}
			}				

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "dingpiaoxinxi/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
		}  
		//取消 
		function cancel() {
			window.location.href="list.jsp";
		}

		// 表单提交
		function submit() {
			if(validform() ==true && compare() == true){
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				httpJson("dingpiaoxinxi/"+urlParam,"POST",data,(res)=>{
					if(res.code == 0){
						window.sessionStorage.removeItem('id');
						let flag = true;
						//如果跨表更新失败，不显示成功提示
						flag = crossTableUpdate();
												if(flag){
							alert(successMes);
						}
						if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
							window.sessionStorage.removeItem('onlyme');
							window.location.href="${pageContext.request.contextPath}/index.jsp";
						}else{
							window.location.href="list.jsp";
						}
						
					}
				});
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
		}  

		// 获取富文本框内容
		function getContent(){
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    dianyingmingcheng: {
					},
				    fangyingshijian: {
					},
				    fangyingting: {
					},
				    piaoshu: {
					required: true,
					},
				    piaojia: {
					},
				    zhifujiage: {
					},
				    yonghuzhanghao: {
					},
				    yonghuxingming: {
					},
				    yonghushouji: {
					},
				    goupiaoxuzhi: {
					},
				    ispay: {
					},
				    price: {
					required: true,
					},
				    number: {
					required: true,
					},
				    selected: {
					},
				},
				messages: {
					dianyingmingcheng: {
					},
					fangyingshijian: {
					},
					fangyingting: {
					},
					piaoshu: {
						required: "票数不能为空",
					},
					piaojia: {
					},
					zhifujiage: {
					},
					yonghuzhanghao: {
					},
					yonghuxingming: {
					},
					yonghushouji: {
					},
					goupiaoxuzhi: {
					},
					ispay: {
					},
					price: {
						required: "价格不能为空",
					},
					number: {
						required: "座位总数不能为空",
					},
					selected: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("dingpiaoxinxi/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												//注册表单验证
						$(validform());	
					}
				});
			}else{
				dingpiaodingdanUuid();

		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
			if($("#piaoshu").val() != null && $("#piaoshu").val() != ""){
				if(x == 0 && flag < 2){
					x = (x+1) * parseFloat($("#piaoshu").val());
					flag++;
				}else{
					x = x * parseFloat($("#piaoshu").val());
					flag++;
				}
			}
			if($("#piaojia").val() != null && $("#piaojia").val() != ""){
				if(x == 0 && flag < 2){
					x = (x+1) * parseFloat($("#piaojia").val());
					flag++;
				}else{
					x = x * parseFloat($("#piaojia").val());
					flag++;
				}
			}
			if(flag < 2){
				$("#zhifujiage").val(0);
			}else{
				$("#zhifujiage").val(x);
			}
					
				
		}		
		function calculationSE(colName){
			//单列求和接口
			http("dingpiaoxinxi"+colName,"GET",{
				tableName: "dingpiaoxinxi",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){

				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						if(res.data !=null && res.data.yonghuzhanghao != null && res.data.yonghuzhanghao != ''){
							$('#yonghuzhanghao').val(res.data.yonghuzhanghao)
						}
						if(res.data !=null && res.data.yonghuxingming != null && res.data.yonghuxingming != ''){
							$('#yonghuxingming').val(res.data.yonghuxingming)
						}
						if(res.data !=null && res.data.yonghushouji != null && res.data.yonghushouji != ''){
							$('#yonghushouji').val(res.data.yonghushouji)
						}
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#dingpiaodingdan").val(ruleForm.dingpiaodingdan);	
			$("#dianyingmingcheng").val(ruleForm.dianyingmingcheng);	
			$("#fangyingshijian").val(ruleForm.fangyingshijian);	
			$("#fangyingting").val(ruleForm.fangyingting);	
			$("#piaoshu").val(ruleForm.piaoshu);	
			$("#piaojia").val(ruleForm.piaojia);	
			$("#zhifujiage").val(ruleForm.zhifujiage);	
			$("#yonghuzhanghao").val(ruleForm.yonghuzhanghao);	
			$("#yonghuxingming").val(ruleForm.yonghuxingming);	
			$("#yonghushouji").val(ruleForm.yonghushouji);	
			$("#goupiaoxuzhi").val(ruleForm.goupiaoxuzhi);	
			$("#ispay").val(ruleForm.ispay);	
			$("#price").val(ruleForm.price);	
			$("#number").val(ruleForm.number);	
			$("#selected").val(ruleForm.selected);
		}		
		//图片显示
		function showImg(){
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.dingpiaodingdan != null && res.data.dingpiaodingdan != ''){

					$("#dingpiaodingdan").val(res.data.dingpiaodingdan);
					}
					if(res.data != null && res.data != '' && res.data.dianyingmingcheng != null && res.data.dianyingmingcheng != ''){

					$("#dianyingmingcheng").val(res.data.dianyingmingcheng);
					}
					if(res.data != null && res.data != '' && res.data.fangyingshijian != null && res.data.fangyingshijian != ''){

					$("#fangyingshijian").val(res.data.fangyingshijian);
					}
					if(res.data != null && res.data != '' && res.data.fangyingting != null && res.data.fangyingting != ''){

					$("#fangyingting").val(res.data.fangyingting);
					}
					if(res.data != null && res.data != '' && res.data.piaoshu != null && res.data.piaoshu != ''){

					piaoshuKucun = res.data.piaoshu;
					$("#piaoshu").val(res.data.piaoshu);

					}
					if(res.data != null && res.data != '' && res.data.piaojia != null && res.data.piaojia != ''){

					$("#piaojia").val(res.data.piaojia);
					}
					if(res.data != null && res.data != '' && res.data.zhifujiage != null && res.data.zhifujiage != ''){

					$("#zhifujiage").val(res.data.zhifujiage);
					}
					if(res.data != null && res.data != '' && res.data.yonghuzhanghao != null && res.data.yonghuzhanghao != ''){

					$("#yonghuzhanghao").val(res.data.yonghuzhanghao);
					}
					if(res.data != null && res.data != '' && res.data.yonghuxingming != null && res.data.yonghuxingming != ''){

					$("#yonghuxingming").val(res.data.yonghuxingming);
					}
					if(res.data != null && res.data != '' && res.data.yonghushouji != null && res.data.yonghushouji != ''){

					$("#yonghushouji").val(res.data.yonghushouji);
					}
					if(res.data != null && res.data != '' && res.data.goupiaoxuzhi != null && res.data.goupiaoxuzhi != ''){

					$("#goupiaoxuzhi").val(res.data.goupiaoxuzhi);
					}
					if(res.data != null && res.data != '' && res.data.ispay != null && res.data.ispay != ''){

					$("#ispay").val(res.data.ispay);
					}
					if(res.data != null && res.data != '' && res.data.price != null && res.data.price != ''){

					$("#price").val(res.data.price);
					}
					if(res.data != null && res.data != '' && res.data.number != null && res.data.number != ''){

					$("#number").val(res.data.number);
					}
					if(res.data != null && res.data != '' && res.data.selected != null && res.data.selected != ''){

					$("#selected").val(res.data.selected);
					}
				}
			});  
            }
            window.sessionStorage.removeItem('crossTableName');
			window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
					piaoshu: Number(crossRuleForm.piaoshu) - Number($('#piaoshu').val()),	
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			if(Number(piaoshuKucun) < Number($('#piaoshu').val())){
				alert('票数不能大于'+piaoshuKucun+'！请重新输入');
				return false;
			}
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			$('#exitBtn').on('click', function(e) {
			    cancel();
			});
			readonly();
		});		

		function readonly(){
			if(window.sessionStorage.getItem('role') != '管理员'){
				$('#money').attr('readonly','readonly');
			}
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(largerVal<=smallerVal){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
