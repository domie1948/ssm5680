package com.dao;

import com.entity.FangyingshijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyingshijianVO;
import com.entity.view.FangyingshijianView;


/**
 * 放映时间
 * 
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
public interface FangyingshijianDao extends BaseMapper<FangyingshijianEntity> {
	
	List<FangyingshijianVO> selectListVO(@Param("ew") Wrapper<FangyingshijianEntity> wrapper);
	
	FangyingshijianVO selectVO(@Param("ew") Wrapper<FangyingshijianEntity> wrapper);
	
	List<FangyingshijianView> selectListView(@Param("ew") Wrapper<FangyingshijianEntity> wrapper);

	List<FangyingshijianView> selectListView(Pagination page,@Param("ew") Wrapper<FangyingshijianEntity> wrapper);
	
	FangyingshijianView selectView(@Param("ew") Wrapper<FangyingshijianEntity> wrapper);
	
}
