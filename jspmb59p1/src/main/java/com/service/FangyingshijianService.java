package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyingshijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyingshijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyingshijianView;


/**
 * 放映时间
 *
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface FangyingshijianService extends IService<FangyingshijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyingshijianVO> selectListVO(Wrapper<FangyingshijianEntity> wrapper);
   	
   	FangyingshijianVO selectVO(@Param("ew") Wrapper<FangyingshijianEntity> wrapper);
   	
   	List<FangyingshijianView> selectListView(Wrapper<FangyingshijianEntity> wrapper);
   	
   	FangyingshijianView selectView(@Param("ew") Wrapper<FangyingshijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyingshijianEntity> wrapper);
   	
}

