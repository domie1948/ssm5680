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
 * 新片预告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@TableName("xinpianyugao")
public class XinpianyugaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinpianyugaoEntity() {
		
	}
	
	public XinpianyugaoEntity(T t) {
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
	 * 上映日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangyingriqi;
	
	/**
	 * 电影预告
	 */
					
	private String dianyingyugao;
	
	/**
	 * 电影介绍
	 */
					
	private String dianyingjieshao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：上映日期
	 */
	public void setShangyingriqi(Date shangyingriqi) {
		this.shangyingriqi = shangyingriqi;
	}
	/**
	 * 获取：上映日期
	 */
	public Date getShangyingriqi() {
		return shangyingriqi;
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
	 * 设置：电影介绍
	 */
	public void setDianyingjieshao(String dianyingjieshao) {
		this.dianyingjieshao = dianyingjieshao;
	}
	/**
	 * 获取：电影介绍
	 */
	public String getDianyingjieshao() {
		return dianyingjieshao;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
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

}
