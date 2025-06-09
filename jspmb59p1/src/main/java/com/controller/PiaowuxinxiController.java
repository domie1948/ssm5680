package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PiaowuxinxiEntity;
import com.entity.view.PiaowuxinxiView;

import com.service.PiaowuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 票务信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-07 00:44:39
 */
@RestController
@RequestMapping("/piaowuxinxi")
public class PiaowuxinxiController {
    @Autowired
    private PiaowuxinxiService piaowuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PiaowuxinxiEntity piaowuxinxi, 
		HttpServletRequest request){

        EntityWrapper<PiaowuxinxiEntity> ew = new EntityWrapper<PiaowuxinxiEntity>();
    	PageUtils page = piaowuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, piaowuxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PiaowuxinxiEntity piaowuxinxi, HttpServletRequest request){
        EntityWrapper<PiaowuxinxiEntity> ew = new EntityWrapper<PiaowuxinxiEntity>();
    	PageUtils page = piaowuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, piaowuxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PiaowuxinxiEntity piaowuxinxi){
       	EntityWrapper<PiaowuxinxiEntity> ew = new EntityWrapper<PiaowuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( piaowuxinxi, "piaowuxinxi")); 
        return R.ok().put("data", piaowuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PiaowuxinxiEntity piaowuxinxi){
        EntityWrapper< PiaowuxinxiEntity> ew = new EntityWrapper< PiaowuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( piaowuxinxi, "piaowuxinxi")); 
		PiaowuxinxiView piaowuxinxiView =  piaowuxinxiService.selectView(ew);
		return R.ok("查询票务信息成功").put("data", piaowuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PiaowuxinxiEntity piaowuxinxi = piaowuxinxiService.selectById(id);
		piaowuxinxi.setClicknum(piaowuxinxi.getClicknum()+1);
		piaowuxinxiService.updateById(piaowuxinxi);
        return R.ok().put("data", piaowuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PiaowuxinxiEntity piaowuxinxi = piaowuxinxiService.selectById(id);
		piaowuxinxi.setClicknum(piaowuxinxi.getClicknum()+1);
		piaowuxinxiService.updateById(piaowuxinxi);
        return R.ok().put("data", piaowuxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        PiaowuxinxiEntity piaowuxinxi = piaowuxinxiService.selectById(id);
        if(type.equals("1")) {
        	piaowuxinxi.setThumbsupnum(piaowuxinxi.getThumbsupnum()+1);
        } else {
        	piaowuxinxi.setCrazilynum(piaowuxinxi.getCrazilynum()+1);
        }
        piaowuxinxiService.updateById(piaowuxinxi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PiaowuxinxiEntity piaowuxinxi, HttpServletRequest request){
    	piaowuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(piaowuxinxi);

        piaowuxinxiService.insert(piaowuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PiaowuxinxiEntity piaowuxinxi, HttpServletRequest request){
    	piaowuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(piaowuxinxi);

        piaowuxinxiService.insert(piaowuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PiaowuxinxiEntity piaowuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(piaowuxinxi);
        piaowuxinxiService.updateById(piaowuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        piaowuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PiaowuxinxiEntity> wrapper = new EntityWrapper<PiaowuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = piaowuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
