<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<body style="background: #EEEEEE; ">


		<div id="app">

			<!-- 轮播图 -->
			<div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div>
			<!-- 轮播图 -->

			<div class="data-add-container">

				<form class="layui-form layui-form-pane" lay-filter="myForm">
					
                                                            <div class="layui-form-item" pane>
						<label class="layui-form-label">电影名称：</label>
						<div class="layui-input-block">
							<input v-model="detail.dianyingmingcheng" type="text" name="dianyingmingcheng" id="dianyingmingcheng" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">海报：</label>
						<div v-if="detail.haibao" class="layui-input-block">
							<img id="haibaoImg" style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;" :src="detail.haibao">
							<input type="hidden" :value="detail.haibao" id="haibao" name="haibao" />
						</div>
						<div class="layui-input-block">
							<button type="button" class="layui-btn btn-theme" id="haibaoUpload">
								<i class="layui-icon">&#xe67c;</i>上传海报
							</button>
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">导演：</label>
						<div class="layui-input-block">
							<input v-model="detail.daoyan" type="text" name="daoyan" id="daoyan" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">演员：</label>
						<div class="layui-input-block">
							<input v-model="detail.yanyuan" type="text" name="yanyuan" id="yanyuan" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">上映时间：</label>
						<div class="layui-input-block">
							<input v-model="detail.shangyingshijian" type="text" name="shangyingshijian" id="shangyingshijian" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                                                                            <div class="layui-form-item" pane>
                        <label class="layui-form-label">电影类型</label>
                        <div class="layui-input-block">
                            <select name="dianyingleixing" id="dianyingleixing" lay-filter="dianyingleixing">
                                <option value="">请选择</option>
                                <option v-for="(item,index) in dianyingleixing" v-bind:key="index" :value="item">{{item}}</option>
                            </select>
                        </div>
                    </div>
                                                                                <div class="layui-form-item" pane>
                        <label class="layui-form-label">放映厅</label>
                        <div class="layui-input-block">
                            <select name="fangyingting" id="fangyingting" lay-filter="fangyingting">
                                <option value="">请选择</option>
                                <option v-for="(item,index) in fangyingting" v-bind:key="index" :value="item">{{item}}</option>
                            </select>
                        </div>
                    </div>
                                                                                <div class="layui-form-item" pane>
                        <label class="layui-form-label">放映时间</label>
                        <div class="layui-input-block">
                            <select name="fangyingshijian" id="fangyingshijian" lay-filter="fangyingshijian">
                                <option value="">请选择</option>
                                <option v-for="(item,index) in fangyingshijian" v-bind:key="index" :value="item">{{item}}</option>
                            </select>
                        </div>
                    </div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">电影预告：</label>
						<div v-if="detail.dianyingyugao" class="layui-input-block">
							<video style="width: 100%;" :src="detail.dianyingyugao" controls="controls">
								您的浏览器不支持视频播放
							</video>
                            <input type="hidden" :value="detail.dianyingyugao" id="dianyingyugao" name="dianyingyugao" />
						</div>
						<div class="layui-input-block">
							<button type="button" class="layui-btn btn-theme" id="dianyingyugaoUpload">
								<i class="layui-icon">&#xe67c;</i>上传电影预告
							</button>
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">影院地址：</label>
						<div class="layui-input-block">
							<input v-model="detail.yingyuandizhi" type="text" name="yingyuandizhi" id="yingyuandizhi" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">购票须知：</label>
						<div class="layui-input-block">
							<input v-model="detail.goupiaoxuzhi" type="text" name="goupiaoxuzhi" id="goupiaoxuzhi" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                                                                            <div class="layui-form-item" pane>
						<label class="layui-form-label">赞：</label>
						<div class="layui-input-block">
							<input v-model="detail.thumbsupnum" type="text" name="thumbsupnum" id="thumbsupnum" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">踩：</label>
						<div class="layui-input-block">
							<input v-model="detail.crazilynum" type="text" name="crazilynum" id="crazilynum" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">点击次数：</label>
						<div class="layui-input-block">
							<input v-model="detail.clicknum" type="text" name="clicknum" id="clicknum" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">价格：</label>
						<div class="layui-input-block">
							<input v-model="detail.price" type="text" name="price" id="price" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">座位总数：</label>
						<div class="layui-input-block">
							<input v-model="detail.number" type="text" name="number" id="number" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                                                        
                                                                                                                                                                                                                                                                    <div class="layui-form-item" pane>
						<label class="layui-form-label">简介：</label>
						<div class="layui-input-block">
							<textarea name="jianjie" id="jianjie">请输入简介</textarea>
						</div>
					</div>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
					<div class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					dataList: [],
                    detail: {
                                                                        dianyingmingcheng: '',
                                                                                                haibao: '',
                                                                                                daoyan: '',
                                                                                                yanyuan: '',
                                                                                                shangyingshijian: '',
                                                                                                jianjie: '',
                                                                                                dianyingleixing: '',
                                                                                                fangyingting: '',
                                                                                                fangyingshijian: '',
                                                                                                dianyingyugao: '',
                                                                                                yingyuandizhi: '',
                                                                                                goupiaoxuzhi: '',
                                                                                                ispay: '',
                                                                                                thumbsupnum: '',
                                                                                                crazilynum: '',
                                                                                                clicknum: '',
                                                                                                price: '',
                                                                                                number: '',
                                                                                                selected: '',
                                                                    },
                    																																																																						dianyingleixing: [],
																				fangyingting: [],
																				fangyingshijian: [],
																																																																																																																			centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})

			
			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
                var tinymce = layui.tinymce

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img class="swiper-item" src="' + item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						carousel.render({
							elem: '#swiper',
							width: swiper.width,height:swiper.height,
							arrow: swiper.arrow,
							anim: swiper.anim,
							interval: swiper.interval,
							indicator: "none"
						});
					}
				});

                																// 上传图片
				var haibaoUpload = upload.render({
					//绑定元素
					elem: '#haibaoUpload',
					//上传接口
					url: http.baseurl + 'file/upload',
					// 请求头
					headers: {
						Token: localStorage.getItem('Token')
					},
					// 允许上传时校验的文件类型
					accept: 'images',
					before: function() {
						//loading层
						var index = layer.load(1, {
							shade: [0.1, '#fff'] //0.1透明度的白色背景
						});
					},
					// 上传成功
					done: function(res) {
						console.log(res);
						layer.closeAll();
						if (res.code == 0) {
							layer.msg("上传成功", {
								time: 2000,
								icon: 6
							})
							var url = http.baseurl + 'upload/' + res.file;
							jquery('#haibao').val(url);
							jquery('#haibaoImg').attr('src', url)
                            vue.detail.haibao = url;
						} else {
							layer.msg(res.msg, {
								time: 2000,
								icon: 5
							})
						}
					},
					//请求异常回调
					error: function() {
						layer.closeAll();
						layer.msg("请求接口异常", {
							time: 2000,
							icon: 5
						})
					}
				});
																																				                var edit = tinymce.render({
                    elem: "#jianjie",
                    height: 600,
                    images_upload_handler: function(blobInfo, succFun, failFun) {
                        var xhr, formData;
                        var file = blobInfo.blob(); //转化为易于理解的file对象
                        xhr = new XMLHttpRequest();
                        xhr.withCredentials = false;
                        xhr.open('POST', http.baseurl + 'file/upload');
                        xhr.setRequestHeader("Token", localStorage.getItem('Token')); //设置请求头
                        xhr.onload = function() {
                            var json;
                            if (xhr.status != 200) {
                                failFun('HTTP Error: ' + xhr.status);
                                return;
                            }
                            json = JSON.parse(xhr.responseText);
                            if (!json || typeof json.file != 'string') {
                                failFun('Invalid JSON: ' + xhr.responseText);
                                return;
                            }
                            succFun(http.baseurl + '/upload/' + json.file);
                        };
                        formData = new FormData();
                        formData.append('file', file, file.name); //此处与源文档不一样
                        xhr.send(formData);
                    }
                }, (opt) => {

                });
																vue.dianyingleixing = '3D电影,2D电影'.split(',')
																http.request(`option/fangyingting/leixing`,'get',{},(res)=>{
					vue.fangyingting = res.data
				});
																http.request(`option/fangyingshijian/shijian`,'get',{},(res)=>{
					vue.fangyingshijian = res.data
				});
												                var dianyingyugaoUpload = upload.render({
					//绑定元素
					elem: '#dianyingyugaoUpload',
					//上传接口
					url: http.baseurl + 'file/upload',
					// 请求头
					headers: {
						Token: localStorage.getItem('Token')
					},
					// 允许上传时校验的文件类型
					accept: 'video',
					before: function() {
						//loading层
						var index = layer.load(1, {
							shade: [0.1, '#fff'] //0.1透明度的白色背景
						});
					},
					// 上传成功
					done: function(res) {
						console.log(res);
						layer.closeAll();
						if (res.code == 0) {
							layer.msg("上传成功", {
								time: 2000,
								icon: 6
							})
							var url = http.baseurl + 'upload/' + res.file;
							jquery('#dianyingyugao').val(url);
                            vue.detail.dianyingyugao = url;
						} else {
							layer.msg(res.msg, {
								time: 2000,
								icon: 5
							})
						}
					},
					//请求异常回调
					error: function() {
						layer.closeAll();
						layer.msg("请求接口异常", {
							time: 2000,
							icon: 5
						})
					}
				});
                																																																																																
                                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
						vue.detail[`${key}`] = data[`${key}`]
					}
				});
                
                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var key in obj){
						vue.detail[`${key}`] = obj[`${key}`]
					}
				}
				
                																																																																																																																																																								
				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
					                    					                    if(!data.dianyingmingcheng){
                        layer.msg('电影名称不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                                    					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					var jianjie = tinymce.get('#jianjie').getContent()
					data.jianjie = jianjie;
										                                                                                                                                                                					                    if(!data.dianyingleixing){
                        layer.msg('电影类型不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                                    					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                        if(!isIntNumer(data.thumbsupnum)){
                        layer.msg('赞应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                					                                        if(!isIntNumer(data.crazilynum)){
                        layer.msg('踩应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                					                                        if(!isIntNumer(data.clicknum)){
                        layer.msg('点击次数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                					                    if(!data.price){
                        layer.msg('价格不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                if(!isNumber(data.price)){
                        layer.msg('价格应输入数字', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                            					                    if(!data.number){
                        layer.msg('座位总数不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                            if(!isIntNumer(data.number)){
                        layer.msg('座位总数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                					                                                                                                                                            
					// 跨表计算
					                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        					
                    // 比较大小
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        					
					// 提交数据
					http.requestJson('piaowuxinxi' + '/add', 'post', data, function(res) {
					 	layer.msg('提交成功', {
					 		time: 2000,
					 		icon: 6
					 	}, function() {
					 		back();
						});
					 });

					return false
				});

			});
		</script>
	</body>
</html>
