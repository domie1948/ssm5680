package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinpianyugaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinpianyugaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinpianyugaoView;


/**
 * 新片预告评论表
 *
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface DiscussxinpianyugaoService extends IService<DiscussxinpianyugaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinpianyugaoVO> selectListVO(Wrapper<DiscussxinpianyugaoEntity> wrapper);
   	
   	DiscussxinpianyugaoVO selectVO(@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);
   	
   	List<DiscussxinpianyugaoView> selectListView(Wrapper<DiscussxinpianyugaoEntity> wrapper);
   	
   	DiscussxinpianyugaoView selectView(@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinpianyugaoEntity> wrapper);
   	
}

