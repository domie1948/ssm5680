package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinpianyugaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinpianyugaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinpianyugaoView;


/**
 * 新片预告
 *
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface XinpianyugaoService extends IService<XinpianyugaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinpianyugaoVO> selectListVO(Wrapper<XinpianyugaoEntity> wrapper);
   	
   	XinpianyugaoVO selectVO(@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);
   	
   	List<XinpianyugaoView> selectListView(Wrapper<XinpianyugaoEntity> wrapper);
   	
   	XinpianyugaoView selectView(@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinpianyugaoEntity> wrapper);
   	
}

