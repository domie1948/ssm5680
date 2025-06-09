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


import com.dao.DiscussxinpianyugaoDao;
import com.entity.DiscussxinpianyugaoEntity;
import com.service.DiscussxinpianyugaoService;
import com.entity.vo.DiscussxinpianyugaoVO;
import com.entity.view.DiscussxinpianyugaoView;

@Service("discussxinpianyugaoService")
public class DiscussxinpianyugaoServiceImpl extends ServiceImpl<DiscussxinpianyugaoDao, DiscussxinpianyugaoEntity> implements DiscussxinpianyugaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinpianyugaoEntity> page = this.selectPage(
                new Query<DiscussxinpianyugaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxinpianyugaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinpianyugaoEntity> wrapper) {
		  Page<DiscussxinpianyugaoView> page =new Query<DiscussxinpianyugaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinpianyugaoVO> selectListVO(Wrapper<DiscussxinpianyugaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinpianyugaoVO selectVO(Wrapper<DiscussxinpianyugaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinpianyugaoView> selectListView(Wrapper<DiscussxinpianyugaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinpianyugaoView selectView(Wrapper<DiscussxinpianyugaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
