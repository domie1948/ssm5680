package com.dao;

import com.entity.GerenrijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenrijiVO;
import com.entity.view.GerenrijiView;


/**
 * 个人日记
 * 
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface GerenrijiDao extends BaseMapper<GerenrijiEntity> {
	
	List<GerenrijiVO> selectListVO(@Param("ew") Wrapper<GerenrijiEntity> wrapper);
	
	GerenrijiVO selectVO(@Param("ew") Wrapper<GerenrijiEntity> wrapper);
	
	List<GerenrijiView> selectListView(@Param("ew") Wrapper<GerenrijiEntity> wrapper);

	List<GerenrijiView> selectListView(Pagination page,@Param("ew") Wrapper<GerenrijiEntity> wrapper);
	
	GerenrijiView selectView(@Param("ew") Wrapper<GerenrijiEntity> wrapper);
	
}
