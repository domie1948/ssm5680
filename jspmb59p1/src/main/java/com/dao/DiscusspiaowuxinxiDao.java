package com.dao;

import com.entity.DiscusspiaowuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusspiaowuxinxiVO;
import com.entity.view.DiscusspiaowuxinxiView;


/**
 * 票务信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface DiscusspiaowuxinxiDao extends BaseMapper<DiscusspiaowuxinxiEntity> {
	
	List<DiscusspiaowuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);
	
	DiscusspiaowuxinxiVO selectVO(@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);
	
	List<DiscusspiaowuxinxiView> selectListView(@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);

	List<DiscusspiaowuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);
	
	DiscusspiaowuxinxiView selectView(@Param("ew") Wrapper<DiscusspiaowuxinxiEntity> wrapper);
	
}
