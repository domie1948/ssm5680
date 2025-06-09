package com.entity.model;

import com.entity.DingpiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订票信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public class DingpiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影名称
	 */
	
	private String dianyingmingcheng;
		
	/**
	 * 放映时间
	 */
	
	private String fangyingshijian;
		
	/**
	 * 放映厅
	 */
	
	private String fangyingting;
		
	/**
	 * 票数
	 */
	
	private Integer piaoshu;
		
	/**
	 * 票价
	 */
	
	private String piaojia;
		
	/**
	 * 支付价格
	 */
	
	private String zhifujiage;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 购票须知
	 */
	
	private String goupiaoxuzhi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 座位总数
	 */
	
	private Integer number;
		
	/**
	 * 已选座位[用,号隔开]
	 */
	
	private String selected;
				
	
	/**
	 * 设置：电影名称
	 */
	 
	public void setDianyingmingcheng(String dianyingmingcheng) {
		this.dianyingmingcheng = dianyingmingcheng;
	}
	
	/**
	 * 获取：电影名称
	 */
	public String getDianyingmingcheng() {
		return dianyingmingcheng;
	}
				
	
	/**
	 * 设置：放映时间
	 */
	 
	public void setFangyingshijian(String fangyingshijian) {
		this.fangyingshijian = fangyingshijian;
	}
	
	/**
	 * 获取：放映时间
	 */
	public String getFangyingshijian() {
		return fangyingshijian;
	}
				
	
	/**
	 * 设置：放映厅
	 */
	 
	public void setFangyingting(String fangyingting) {
		this.fangyingting = fangyingting;
	}
	
	/**
	 * 获取：放映厅
	 */
	public String getFangyingting() {
		return fangyingting;
	}
				
	
	/**
	 * 设置：票数
	 */
	 
	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}
	
	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}
				
	
	/**
	 * 设置：票价
	 */
	 
	public void setPiaojia(String piaojia) {
		this.piaojia = piaojia;
	}
	
	/**
	 * 获取：票价
	 */
	public String getPiaojia() {
		return piaojia;
	}
				
	
	/**
	 * 设置：支付价格
	 */
	 
	public void setZhifujiage(String zhifujiage) {
		this.zhifujiage = zhifujiage;
	}
	
	/**
	 * 获取：支付价格
	 */
	public String getZhifujiage() {
		return zhifujiage;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：购票须知
	 */
	 
	public void setGoupiaoxuzhi(String goupiaoxuzhi) {
		this.goupiaoxuzhi = goupiaoxuzhi;
	}
	
	/**
	 * 获取：购票须知
	 */
	public String getGoupiaoxuzhi() {
		return goupiaoxuzhi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：座位总数
	 */
	 
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	/**
	 * 获取：座位总数
	 */
	public Integer getNumber() {
		return number;
	}
				
	
	/**
	 * 设置：已选座位[用,号隔开]
	 */
	 
	public void setSelected(String selected) {
		this.selected = selected;
	}
	
	/**
	 * 获取：已选座位[用,号隔开]
	 */
	public String getSelected() {
		return selected;
	}
			
}
