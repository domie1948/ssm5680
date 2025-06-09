package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GerenrijiDao;
import com.entity.GerenrijiEntity;
import com.service.GerenrijiService;
import com.entity.vo.GerenrijiVO;
import com.entity.view.GerenrijiView;

@Service("gerenrijiService")
public class GerenrijiServiceImpl extends ServiceImpl<GerenrijiDao, GerenrijiEntity> implements GerenrijiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenrijiEntity> page = this.selectPage(
                new Query<GerenrijiEntity>(params).getPage(),
                new EntityWrapper<GerenrijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenrijiEntity> wrapper) {
		  Page<GerenrijiView> page =new Query<GerenrijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenrijiVO> selectListVO(Wrapper<GerenrijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenrijiVO selectVO(Wrapper<GerenrijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenrijiView> selectListView(Wrapper<GerenrijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenrijiView selectView(Wrapper<GerenrijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
