package com.entity.model;

import com.entity.PiaowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 票务信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public class PiaowuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 海报
	 */
	
	private String haibao;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 演员
	 */
	
	private String yanyuan;
		
	/**
	 * 上映时间
	 */
	
	private String shangyingshijian;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 电影类型
	 */
	
	private String dianyingleixing;
		
	/**
	 * 放映厅
	 */
	
	private String fangyingting;
		
	/**
	 * 放映时间
	 */
	
	private String fangyingshijian;
		
	/**
	 * 电影预告
	 */
	
	private String dianyingyugao;
		
	/**
	 * 影院地址
	 */
	
	private String yingyuandizhi;
		
	/**
	 * 购票须知
	 */
	
	private String goupiaoxuzhi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
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
	 * 设置：海报
	 */
	 
	public void setHaibao(String haibao) {
		this.haibao = haibao;
	}
	
	/**
	 * 获取：海报
	 */
	public String getHaibao() {
		return haibao;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：演员
	 */
	 
	public void setYanyuan(String yanyuan) {
		this.yanyuan = yanyuan;
	}
	
	/**
	 * 获取：演员
	 */
	public String getYanyuan() {
		return yanyuan;
	}
				
	
	/**
	 * 设置：上映时间
	 */
	 
	public void setShangyingshijian(String shangyingshijian) {
		this.shangyingshijian = shangyingshijian;
	}
	
	/**
	 * 获取：上映时间
	 */
	public String getShangyingshijian() {
		return shangyingshijian;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：电影类型
	 */
	 
	public void setDianyingleixing(String dianyingleixing) {
		this.dianyingleixing = dianyingleixing;
	}
	
	/**
	 * 获取：电影类型
	 */
	public String getDianyingleixing() {
		return dianyingleixing;
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
	 * 设置：电影预告
	 */
	 
	public void setDianyingyugao(String dianyingyugao) {
		this.dianyingyugao = dianyingyugao;
	}
	
	/**
	 * 获取：电影预告
	 */
	public String getDianyingyugao() {
		return dianyingyugao;
	}
				
	
	/**
	 * 设置：影院地址
	 */
	 
	public void setYingyuandizhi(String yingyuandizhi) {
		this.yingyuandizhi = yingyuandizhi;
	}
	
	/**
	 * 获取：影院地址
	 */
	public String getYingyuandizhi() {
		return yingyuandizhi;
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
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
