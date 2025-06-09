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


import com.dao.WenwuweixiuDao;
import com.entity.WenwuweixiuEntity;
import com.service.WenwuweixiuService;
import com.entity.vo.WenwuweixiuVO;
import com.entity.view.WenwuweixiuView;

@Service("wenwuweixiuService")
public class WenwuweixiuServiceImpl extends ServiceImpl<WenwuweixiuDao, WenwuweixiuEntity> implements WenwuweixiuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenwuweixiuEntity> page = this.selectPage(
                new Query<WenwuweixiuEntity>(params).getPage(),
                new EntityWrapper<WenwuweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenwuweixiuEntity> wrapper) {
		  Page<WenwuweixiuView> page =new Query<WenwuweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenwuweixiuVO> selectListVO(Wrapper<WenwuweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenwuweixiuVO selectVO(Wrapper<WenwuweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenwuweixiuView> selectListView(Wrapper<WenwuweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenwuweixiuView selectView(Wrapper<WenwuweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
