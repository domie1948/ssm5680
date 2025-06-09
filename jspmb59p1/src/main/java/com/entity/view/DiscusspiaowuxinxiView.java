package com.entity.view;

import com.entity.DiscusspiaowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 票务信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@TableName("discusspiaowuxinxi")
public class DiscusspiaowuxinxiView  extends DiscusspiaowuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusspiaowuxinxiView(){
	}
 
 	public DiscusspiaowuxinxiView(DiscusspiaowuxinxiEntity discusspiaowuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusspiaowuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
