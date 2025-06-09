package com.dao;

import com.entity.XinpianyugaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinpianyugaoVO;
import com.entity.view.XinpianyugaoView;


/**
 * 新片预告
 * 
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface XinpianyugaoDao extends BaseMapper<XinpianyugaoEntity> {
	
	List<XinpianyugaoVO> selectListVO(@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);
	
	XinpianyugaoVO selectVO(@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);
	
	List<XinpianyugaoView> selectListView(@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);

	List<XinpianyugaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);
	
	XinpianyugaoView selectView(@Param("ew") Wrapper<XinpianyugaoEntity> wrapper);
	
}
