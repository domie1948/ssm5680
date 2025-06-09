package com.dao;

import com.entity.DiscussxinpianyugaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinpianyugaoVO;
import com.entity.view.DiscussxinpianyugaoView;


/**
 * 新片预告评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface DiscussxinpianyugaoDao extends BaseMapper<DiscussxinpianyugaoEntity> {
	
	List<DiscussxinpianyugaoVO> selectListVO(@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);
	
	DiscussxinpianyugaoVO selectVO(@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);
	
	List<DiscussxinpianyugaoView> selectListView(@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);

	List<DiscussxinpianyugaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);
	
	DiscussxinpianyugaoView selectView(@Param("ew") Wrapper<DiscussxinpianyugaoEntity> wrapper);
	
}
