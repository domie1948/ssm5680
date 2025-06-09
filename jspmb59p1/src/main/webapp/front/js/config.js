
var projectName = '电影售票系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

{
	name: '我的订单',
	url: '../order/list.jsp'
},

{
	name: '我的地址',
	url: '../address/list.jsp'
},

{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '票务信息',
	url: './pages/piaowuxinxi/list.jsp'
}, 
{
	name: '新片预告',
	url: './pages/xinpianyugao/list.jsp'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.jsp'
}, 
{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspmb59p1/index.jsp";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"票务信息","menuJump":"列表","tableName":"piaowuxinxi"}],"menu":"票务信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"放映厅","menuJump":"列表","tableName":"fangyingting"}],"menu":"放映厅管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"新片预告","menuJump":"列表","tableName":"xinpianyugao"}],"menu":"新片预告管理"},{"child":[{"buttons":["查看"],"menu":"个人日记","menuJump":"列表","tableName":"gerenriji"}],"menu":"个人日记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"放映时间","menuJump":"列表","tableName":"fangyingshijian"}],"menu":"放映时间管理"},{"child":[{"buttons":["查看"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"官方公告","tableName":"forum"}],"menu":"官方公告"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"影视新闻","tableName":"news"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","支付"],"menu":"票务信息列表","menuJump":"列表","tableName":"piaowuxinxi"}],"menu":"票务信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"新片预告列表","menuJump":"列表","tableName":"xinpianyugao"}],"menu":"新片预告模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","查看评论","支付"],"menu":"票务信息","menuJump":"列表","tableName":"piaowuxinxi"}],"menu":"票务信息管理"},{"child":[{"buttons":["查看","查看评论"],"menu":"新片预告","menuJump":"列表","tableName":"xinpianyugao"}],"menu":"新片预告管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"个人日记","menuJump":"列表","tableName":"gerenriji"}],"menu":"个人日记管理"},{"child":[{"buttons":["查看"],"menu":"官方公告","tableName":"forum"}],"menu":"官方公告"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看"],"menu":"影视新闻","tableName":"news"},{"buttons":["新增","查看"],"menu":"在线留言","tableName":"chat"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","支付"],"menu":"票务信息列表","menuJump":"列表","tableName":"piaowuxinxi"}],"menu":"票务信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"新片预告列表","menuJump":"列表","tableName":"xinpianyugao"}],"menu":"新片预告模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
