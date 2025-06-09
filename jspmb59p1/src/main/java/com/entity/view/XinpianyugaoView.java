package com.entity.view;

import com.entity.XinpianyugaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新片预告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@TableName("xinpianyugao")
public class XinpianyugaoView  extends XinpianyugaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinpianyugaoView(){
	}
 
 	public XinpianyugaoView(XinpianyugaoEntity xinpianyugaoEntity){
 	try {
			BeanUtils.copyProperties(this, xinpianyugaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
