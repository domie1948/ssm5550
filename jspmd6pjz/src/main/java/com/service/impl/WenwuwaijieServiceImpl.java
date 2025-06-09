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


import com.dao.WenwuwaijieDao;
import com.entity.WenwuwaijieEntity;
import com.service.WenwuwaijieService;
import com.entity.vo.WenwuwaijieVO;
import com.entity.view.WenwuwaijieView;

@Service("wenwuwaijieService")
public class WenwuwaijieServiceImpl extends ServiceImpl<WenwuwaijieDao, WenwuwaijieEntity> implements WenwuwaijieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenwuwaijieEntity> page = this.selectPage(
                new Query<WenwuwaijieEntity>(params).getPage(),
                new EntityWrapper<WenwuwaijieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenwuwaijieEntity> wrapper) {
		  Page<WenwuwaijieView> page =new Query<WenwuwaijieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenwuwaijieVO> selectListVO(Wrapper<WenwuwaijieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenwuwaijieVO selectVO(Wrapper<WenwuwaijieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenwuwaijieView> selectListView(Wrapper<WenwuwaijieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenwuwaijieView selectView(Wrapper<WenwuwaijieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
