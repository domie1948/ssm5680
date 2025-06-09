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


import com.dao.DiscusspiaowuxinxiDao;
import com.entity.DiscusspiaowuxinxiEntity;
import com.service.DiscusspiaowuxinxiService;
import com.entity.vo.DiscusspiaowuxinxiVO;
import com.entity.view.DiscusspiaowuxinxiView;

@Service("discusspiaowuxinxiService")
public class DiscusspiaowuxinxiServiceImpl extends ServiceImpl<DiscusspiaowuxinxiDao, DiscusspiaowuxinxiEntity> implements DiscusspiaowuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusspiaowuxinxiEntity> page = this.selectPage(
                new Query<DiscusspiaowuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusspiaowuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusspiaowuxinxiEntity> wrapper) {
		  Page<DiscusspiaowuxinxiView> page =new Query<DiscusspiaowuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusspiaowuxinxiVO> selectListVO(Wrapper<DiscusspiaowuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusspiaowuxinxiVO selectVO(Wrapper<DiscusspiaowuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusspiaowuxinxiView> selectListView(Wrapper<DiscusspiaowuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusspiaowuxinxiView selectView(Wrapper<DiscusspiaowuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
