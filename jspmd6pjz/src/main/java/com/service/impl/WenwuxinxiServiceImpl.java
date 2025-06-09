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


import com.dao.WenwuxinxiDao;
import com.entity.WenwuxinxiEntity;
import com.service.WenwuxinxiService;
import com.entity.vo.WenwuxinxiVO;
import com.entity.view.WenwuxinxiView;

@Service("wenwuxinxiService")
public class WenwuxinxiServiceImpl extends ServiceImpl<WenwuxinxiDao, WenwuxinxiEntity> implements WenwuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenwuxinxiEntity> page = this.selectPage(
                new Query<WenwuxinxiEntity>(params).getPage(),
                new EntityWrapper<WenwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenwuxinxiEntity> wrapper) {
		  Page<WenwuxinxiView> page =new Query<WenwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenwuxinxiVO> selectListVO(Wrapper<WenwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenwuxinxiVO selectVO(Wrapper<WenwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenwuxinxiView> selectListView(Wrapper<WenwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenwuxinxiView selectView(Wrapper<WenwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
