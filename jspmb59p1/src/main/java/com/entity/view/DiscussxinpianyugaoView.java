package com.entity.view;

import com.entity.DiscussxinpianyugaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新片预告评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@TableName("discussxinpianyugao")
public class DiscussxinpianyugaoView  extends DiscussxinpianyugaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxinpianyugaoView(){
	}
 
 	public DiscussxinpianyugaoView(DiscussxinpianyugaoEntity discussxinpianyugaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussxinpianyugaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
