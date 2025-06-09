package com.entity.vo;

import com.entity.GerenrijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 个人日记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public class GerenrijiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日记标题
	 */
	
	private String rijibiaoti;
		
	/**
	 * 日记内容
	 */
	
	private String rijineirong;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
				
	
	/**
	 * 设置：日记标题
	 */
	 
	public void setRijibiaoti(String rijibiaoti) {
		this.rijibiaoti = rijibiaoti;
	}
	
	/**
	 * 获取：日记标题
	 */
	public String getRijibiaoti() {
		return rijibiaoti;
	}
				
	
	/**
	 * 设置：日记内容
	 */
	 
	public void setRijineirong(String rijineirong) {
		this.rijineirong = rijineirong;
	}
	
	/**
	 * 获取：日记内容
	 */
	public String getRijineirong() {
		return rijineirong;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
			
}
