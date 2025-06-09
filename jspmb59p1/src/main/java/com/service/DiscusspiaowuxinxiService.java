package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusspiaowuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusspiaowuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusspiaowuxinxiView;


/**
 * 票务信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface DiscusspiaowuxinxiService extends IService<DiscusspiaowuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusspiaowuxinxiVO> selectListVO(Wrapper<DiscusspiaowuxinxiEntity> wrapper);
   	
   	DiscusspiaowuxinxiVO selectVO(@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);
   	
   	List<DiscusspiaowuxinxiView> selectListView(Wrapper<DiscusspiaowuxinxiEntity> wrapper);
   	
   	DiscusspiaowuxinxiView selectView(@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusspiaowuxinxiEntity> wrapper);
   	
}

