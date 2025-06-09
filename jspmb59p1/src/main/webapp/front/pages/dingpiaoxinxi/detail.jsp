<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 首页 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>首页</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<body>

		<div id="app">

			<div class="data-detail">
				<div class="data-detail-breadcrumb">
					<span class="layui-breadcrumb">
						<a href="../home/home.jsp">首页</a>
						<a><cite>{{title}}</cite></a>
					</span>
					
										
				</div>
				<div class="layui-row">
					<div class="layui-col-md5">
						<div class="layui-carousel" id="swiper">
							<div carousel-item id="swiper-item">
								<div v-for="(item,index) in swiperList" v-bind:key="index">
									<img class="swiper-item" :src="item.img">
								</div>
							</div>
						</div>
						
                                                
					</div>
					<div class="layui-col-md7" style="padding-left: 20px;">
						<h1 class="title">{{title}}</h1>
						
												
						<div v-if="detail.price" class="detail-item">
							<span>价格：</span>
							<span class="price">
								{{detail.price}}RMB
							</span>
						</div>
						<div v-if="detail.jifen" class="detail-item">
							<span>积分：</span>
							<span class="price">
								{{detail.jifen}}
							</span>
						</div>
						<div v-if="detail.onelimittimes" class="detail-item">
							<span>单次购买：</span>
							<span class="desc">
								{{detail.onelimittimes}}
							</span>
						</div>
						<div v-if="detail.alllimittimes" class="detail-item">
							<span>库存：</span>
							<span class="desc">
								{{detail.alllimittimes}}
							</span>
						</div>
						
						

						
																		<div class="detail-item">
							<span>订票订单：</span>
							<span class="desc">
								{{detail.dingpiaodingdan}}
							</span>
						</div>
																																										<div class="detail-item">
							<span>放映时间：</span>
							<span class="desc">
								{{detail.fangyingshijian}}
							</span>
						</div>
																								<div class="detail-item">
							<span>放映厅：</span>
							<span class="desc">
								{{detail.fangyingting}}
							</span>
						</div>
																								<div class="detail-item">
							<span>票数：</span>
							<span class="desc">
								{{detail.piaoshu}}
							</span>
						</div>
																								<div class="detail-item">
							<span>票价：</span>
							<span class="desc">
								{{detail.piaojia}}
							</span>
						</div>
																								<div class="detail-item">
							<span>支付价格：</span>
							<span class="desc">
								{{detail.zhifujiage}}
							</span>
						</div>
																								<div class="detail-item">
							<span>用户账号：</span>
							<span class="desc">
								{{detail.yonghuzhanghao}}
							</span>
						</div>
																								<div class="detail-item">
							<span>用户姓名：</span>
							<span class="desc">
								{{detail.yonghuxingming}}
							</span>
						</div>
																								<div class="detail-item">
							<span>用户手机：</span>
							<span class="desc">
								{{detail.yonghushouji}}
							</span>
						</div>
																								<div class="detail-item">
							<span>购票须知：</span>
							<span class="desc">
								{{detail.goupiaoxuzhi}}
							</span>
						</div>
																																																												<div class="detail-item">
							<span>座位总数：</span>
							<span class="desc">
								{{detail.number}}
							</span>
						</div>
																																				
						
						
																																																																																																																																																																																																

						<div class="detail-item">
							
							
							
							
						</div>
						
						<div class="detail-item" style="text-align: right;">
							
														<button @click="bookClick" type="button" class="layui-btn btn-submit">
								立即预定
							</button>
							
							
														

						</div>
					</div>
				</div>
				
				
																																																																																																																																
				
				<div class="layui-row">
					<div class="layui-tab layui-tab-card">
						
						<ul class="layui-tab-title">
							
																																																																																																																																																																																																																																							
							
							
														
							
							
														<li>选座</li>
														

						</ul>
						
						<div style="word-break:break-all" class="layui-tab-content">
							
																																																																																																																																																																																																																																							
							
							
														
							
							
														<div class="layui-tab-item">
								<div class="seat-list">
									<div v-for="(item,index) in numberList " v-bind:key="index" class="seat-item">
										<img @click="selectTip()" v-if="item.select" class="seat-icon" src="../../img/select.png" />
										<img @click="selectSeat(item)" v-else-if="!item.active" class="seat-icon" src="../../img/unselect.png" />
										<img @click="unselectSeat(item)" v-else class="seat-icon" src="../../img/select.png" />
										<span>{{item.name}}</span>
									</div>
								</div>
							</div>
														
							
						</div>
					</div>
				</div>
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

		<script>
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [],
					// 数据详情
					detail: {
						id: 0
					},
					// 商品标题
					title: '',
					// 倒计时
					count: 0,
					// 加入购物车数量
					buynumber: 1,
					// 当前详情页表
					detailTable: 'dingpiaoxinxi',
					// 评价列表
					dataList: [],
					// 选座座位列表
					numberList: []
				},
				// 倒计时效果
				computed: {
					SecondToDate: function() {
						var time = this.count;
						if (null != time && "" != time) {
							if (time > 60 && time < 60 * 60) {
								time =
									parseInt(time / 60.0) +
									"分钟" +
									parseInt((parseFloat(time / 60.0) - parseInt(time / 60.0)) * 60) +
									"秒";
							} else if (time >= 60 * 60 && time < 60 * 60 * 24) {
								time =
									parseInt(time / 3600.0) +
									"小时" +
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) +
									"分钟" +
									parseInt(
										(parseFloat(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											) -
											parseInt(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											)) *
										60
									) +
									"秒";
							} else if (time >= 60 * 60 * 24) {
								time =
									parseInt(time / 3600.0 / 24) +
									"天" +
									parseInt(
										(parseFloat(time / 3600.0 / 24) - parseInt(time / 3600.0 / 24)) *
										24
									) +
									"小时" +
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) +
									"分钟" +
									parseInt(
										(parseFloat(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											) -
											parseInt(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											)) *
										60
									) +
									"秒";
							} else {
								time = parseInt(time) + "秒";
							}
						}
						return time;
					}
				},
				//  清除定时器
				destroyed: function() {
					window.clearInterval(this.inter);
				},
				methods: {
					jump(url) {
						jump(url)
					},
					isAuth(tablename, button) {
						return isFrontAuth(tablename, button)
					},
					// 倒计时初始化
					countDown() {
						let reversetime = new Date(this.detail.reversetime).getTime()
						let now = new Date().getTime();
						let count = reversetime - now;
						if (count > 0) {
							this.count = count / 1000
							var _this = this;
							this.inter = window.setInterval(function() {
								_this.count = _this.count - 1;
								if (_this.count < 0) {
									window.clearInterval(_this.inter);
									layer.msg("活动已结束", {
										time: 2000,
										icon: 5
									})
								}
							}, 1000);
						}
					},
					
                    					// 下载文件
					downFile(url) {
						var download = $("#download");
						download.append(
							"<a id=\"down\" href=\"aaaa.txt\" target=\"_blank\" download=\"aaaa.txt\" style=\"display:none\">下载该文件</a>");
						console.log(download);
						$("#down")[0].click();
					},
					// 跨表
					onAcrossTap(acrossTable){
						localStorage.setItem('crossTable',`dingpiaoxinxi`);
						localStorage.setItem('crossObj', JSON.stringify(this.detail));
						jump(`../${acrossTable}/add.jsp?corss=true`);
					},
					
					
										// 立即购买
					buyTap() {
						// 活动倒计时限制
												// 单次购买限制
						if (this.detail.onelimittimes && this.detail.onelimittimes > 0 && this.detail.onelimittimes < this.buynumber) {
							layer.msg(`每人单次只能购买${this.detail.onelimittimes}次`, {
								time: 2000,
								icon: 5
							});
							return
						}
						// 库存限制
						if (this.detail.alllimittimes && this.detail.alllimittimes > 0 && this.detail.alllimittimes < this.buynumber) {
							layer.msg(`商品已售罄`, {
								time: 2000,
								icon: 5
							});
							return
						}
						// 保存到storage中，在确认下单页面中获取要购买的商品
						localStorage.setItem('orderGoods', JSON.stringify([{
							tablename: `${this.detailTable}`,
							goodid: this.detail.id,
							goodname: this.title,
							picture: this.swiperList[0],
							buynumber: this.buynumber,
							userid: localStorage.getItem('userid'),
							price: this.detail.price,
							discountprice: this.detail.vipprice ? this.detail.vipprice : 0
						}]));
						// 跳转到确认下单页面
						jump('../order/confirm.jsp');
					},
										
					
										
										// 选座座位
					selectSeat(item) {
						item.active = true;
					},
					// 取消选择座位
					unselectSeat(item) {
						item.active = false;
					},
					// 提示该座位已经被选择了
					selectTip() {
						layer.msg(`该座位已被预定`, {
							time: 2000,
							icon: 5
						});
					},
					// 请求预定接口
					bookClick() {
						let activeSeat = [];
						for(let i=0;i<this.numberList.length;i++){
							if(this.numberList[i].active){
								activeSeat.push(this.numberList[i].name.replace('号',''));
							}
						}
						layui.layer.confirm('是否确认预定？', {
							btn: ['预定', '取消'] //按钮
						}, () => {
							if (activeSeat.length==0) {
								layer.msg(`请选择要预定的位置`, {
									time: 2000,
									icon: 5
								});
								return
							}
							let data = {
								orderid: genTradeNo(),
								tablename: this.detailTable,
								userid: localStorage.getItem('userid'),
								goodid: this.detail.id,
								goodname: this.title,
								picture: this.swiperList ? this.swiperList[0] : "",
								buynumber: 1,
								discountprice: 0,
								total: 0,
								discounttotal: 0,
								type: 1,
								address: activeSeat.join(','),
								activeSeat: activeSeat.join(','),
								status: '已支付',
								tablename: this.detailTable,
								discountprice: this.detail.vipprice
							}
							if (this.detail.price) {
								data['status'] = '未支付'
								data['price'] = this.detail.price
								data['total'] = this.detail.price * activeSeat.length
								localStorage.setItem('orderGoods', JSON.stringify([data]));
								jump('../order/confirm.jsp?seat=1');
							} else {
								data['price'] = 0
								layui.http.requestJson(`orders/add`, 'post', data, (res) => {
									// 修改数据被选中座位信息
									layui.http.requestJson(`${this.detailTable}/update`, 'post', this.detail, (res) => {
										layer.msg(`预定成功`, {
											time: 2000,
											icon: 6
										});
									});
								})
							}
						});
					}
					
				}
			})

			layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery', 'laypage'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var form = layui.form;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var laypage = layui.laypage;

				var limit = 10;

				// 数据ID
				var id = http.getParam('id');
				vue.detail.id = id;

				// 商品信息
				http.request(`${vue.detailTable}/detail/` + id, 'get', {}, function(res) {
					// 详情信息
					vue.detail = res.data
																									vue.title = vue.detail.dianyingmingcheng;
																																																																																																																																																	var swiperItemHtml = '';
					for (let item of vue.swiperList) {
						swiperItemHtml +=
							'<div>' +
							'<img class="swiper-item" src="' + item + '">' +
							'</div>';
					}
					jquery('#swiper-item').html(swiperItemHtml);
					// 轮播图
					carousel.render({
						elem: '#swiper',
						width: swiper.width,height:swiper.height,
						arrow: swiper.arrow,
						anim: swiper.anim,
						interval: swiper.interval,
						indicator: swiper.indicator
					});

										
										// 选座效果初始化
					// 测试数据
					// vue.detail.number = 20;
					// vue.detail.selected = '1,2'
					let selectArray = vue.detail.selected.split(',');
					for (let i = 1; i <= vue.detail.number; i++) {
						vue.numberList.push({
							name: `${i}号`,
							select: false,
							active: false
						});
					}
					for (let i = 0; i < vue.detail.selected.split(',').length; i++) {
						vue.numberList[vue.detail.selected.split(',')[i]-1].select = true;
					}
					
				});

				
			});
		</script>
	</body>
</html>
