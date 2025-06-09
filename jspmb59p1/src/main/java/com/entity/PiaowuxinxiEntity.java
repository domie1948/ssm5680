package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 票务信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@TableName("piaowuxinxi")
public class PiaowuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PiaowuxinxiEntity() {
		
	}
	
	public PiaowuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 电影名称
	 */
					
	private String dianyingmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
