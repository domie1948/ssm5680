package com.entity.view;

import com.entity.FangyingshijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 放映时间
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@TableName("fangyingshijian")
public class FangyingshijianView  extends FangyingshijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangyingshijianView(){
	}
 
 	public FangyingshijianView(FangyingshijianEntity fangyingshijianEntity){
 	try {
			BeanUtils.copyProperties(this, fangyingshijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
