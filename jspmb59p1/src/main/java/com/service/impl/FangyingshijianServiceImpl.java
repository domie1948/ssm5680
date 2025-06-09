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


import com.dao.FangyingshijianDao;
import com.entity.FangyingshijianEntity;
import com.service.FangyingshijianService;
import com.entity.vo.FangyingshijianVO;
import com.entity.view.FangyingshijianView;

@Service("fangyingshijianService")
public class FangyingshijianServiceImpl extends ServiceImpl<FangyingshijianDao, FangyingshijianEntity> implements FangyingshijianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyingshijianEntity> page = this.selectPage(
                new Query<FangyingshijianEntity>(params).getPage(),
                new EntityWrapper<FangyingshijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyingshijianEntity> wrapper) {
		  Page<FangyingshijianView> page =new Query<FangyingshijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyingshijianVO> selectListVO(Wrapper<FangyingshijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyingshijianVO selectVO(Wrapper<FangyingshijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyingshijianView> selectListView(Wrapper<FangyingshijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyingshijianView selectView(Wrapper<FangyingshijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
