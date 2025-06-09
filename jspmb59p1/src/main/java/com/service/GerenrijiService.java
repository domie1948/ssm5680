package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenrijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenrijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenrijiView;


/**
 * 个人日记
 *
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface GerenrijiService extends IService<GerenrijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenrijiVO> selectListVO(Wrapper<GerenrijiEntity> wrapper);
   	
   	GerenrijiVO selectVO(@Param("ew") Wrapper<GerenrijiEntity> wrapper);
   	
   	List<GerenrijiView> selectListView(Wrapper<GerenrijiEntity> wrapper);
   	
   	GerenrijiView selectView(@Param("ew") Wrapper<GerenrijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenrijiEntity> wrapper);
   	
}

