package com.dao;

import com.entity.PiaowuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PiaowuxinxiVO;
import com.entity.view.PiaowuxinxiView;


/**
 * 票务信息
 * 
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface PiaowuxinxiDao extends BaseMapper<PiaowuxinxiEntity> {
	
	List<PiaowuxinxiVO> selectListVO(@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);
	
	PiaowuxinxiVO selectVO(@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);
	
	List<PiaowuxinxiView> selectListView(@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);

	List<PiaowuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);
	
	PiaowuxinxiView selectView(@Param("ew") Wrapper<PiaowuxinxiEntity> wrapper);
	
}
