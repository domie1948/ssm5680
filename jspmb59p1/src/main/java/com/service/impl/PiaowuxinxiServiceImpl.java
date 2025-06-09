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


import com.dao.PiaowuxinxiDao;
import com.entity.PiaowuxinxiEntity;
import com.service.PiaowuxinxiService;
import com.entity.vo.PiaowuxinxiVO;
import com.entity.view.PiaowuxinxiView;

@Service("piaowuxinxiService")
public class PiaowuxinxiServiceImpl extends ServiceImpl<PiaowuxinxiDao, PiaowuxinxiEntity> implements PiaowuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PiaowuxinxiEntity> page = this.selectPage(
                new Query<PiaowuxinxiEntity>(params).getPage(),
                new EntityWrapper<PiaowuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PiaowuxinxiEntity> wrapper) {
		  Page<PiaowuxinxiView> page =new Query<PiaowuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PiaowuxinxiVO> selectListVO(Wrapper<PiaowuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PiaowuxinxiVO selectVO(Wrapper<PiaowuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PiaowuxinxiView> selectListView(Wrapper<PiaowuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PiaowuxinxiView selectView(Wrapper<PiaowuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
