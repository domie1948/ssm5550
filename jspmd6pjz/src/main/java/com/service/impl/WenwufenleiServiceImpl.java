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


import com.dao.WenwufenleiDao;
import com.entity.WenwufenleiEntity;
import com.service.WenwufenleiService;
import com.entity.vo.WenwufenleiVO;
import com.entity.view.WenwufenleiView;

@Service("wenwufenleiService")
public class WenwufenleiServiceImpl extends ServiceImpl<WenwufenleiDao, WenwufenleiEntity> implements WenwufenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenwufenleiEntity> page = this.selectPage(
                new Query<WenwufenleiEntity>(params).getPage(),
                new EntityWrapper<WenwufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenwufenleiEntity> wrapper) {
		  Page<WenwufenleiView> page =new Query<WenwufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenwufenleiVO> selectListVO(Wrapper<WenwufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenwufenleiVO selectVO(Wrapper<WenwufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenwufenleiView> selectListView(Wrapper<WenwufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenwufenleiView selectView(Wrapper<WenwufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
