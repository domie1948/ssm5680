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


import com.dao.XinpianyugaoDao;
import com.entity.XinpianyugaoEntity;
import com.service.XinpianyugaoService;
import com.entity.vo.XinpianyugaoVO;
import com.entity.view.XinpianyugaoView;

@Service("xinpianyugaoService")
public class XinpianyugaoServiceImpl extends ServiceImpl<XinpianyugaoDao, XinpianyugaoEntity> implements XinpianyugaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinpianyugaoEntity> page = this.selectPage(
                new Query<XinpianyugaoEntity>(params).getPage(),
                new EntityWrapper<XinpianyugaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinpianyugaoEntity> wrapper) {
		  Page<XinpianyugaoView> page =new Query<XinpianyugaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinpianyugaoVO> selectListVO(Wrapper<XinpianyugaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinpianyugaoVO selectVO(Wrapper<XinpianyugaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinpianyugaoView> selectListView(Wrapper<XinpianyugaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinpianyugaoView selectView(Wrapper<XinpianyugaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
