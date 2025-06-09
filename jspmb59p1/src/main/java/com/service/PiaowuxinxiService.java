package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PiaowuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PiaowuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PiaowuxinxiView;


/**
 * 票务信息
 *
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface PiaowuxinxiService extends IService<PiaowuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PiaowuxinxiVO> selectListVO(Wrapper<PiaowuxinxiEntity> wrapper);
   	
   	PiaowuxinxiVO selectVO(@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);
   	
   	List<PiaowuxinxiView> selectListView(Wrapper<PiaowuxinxiEntity> wrapper);
   	
   	PiaowuxinxiView selectView(@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PiaowuxinxiEntity> wrapper);
   	
}

