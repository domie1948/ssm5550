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


import com.dao.DiscusswenwuxinxiDao;
import com.entity.DiscusswenwuxinxiEntity;
import com.service.DiscusswenwuxinxiService;
import com.entity.vo.DiscusswenwuxinxiVO;
import com.entity.view.DiscusswenwuxinxiView;

@Service("discusswenwuxinxiService")
public class DiscusswenwuxinxiServiceImpl extends ServiceImpl<DiscusswenwuxinxiDao, DiscusswenwuxinxiEntity> implements DiscusswenwuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenwuxinxiEntity> page = this.selectPage(
                new Query<DiscusswenwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusswenwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenwuxinxiEntity> wrapper) {
		  Page<DiscusswenwuxinxiView> page =new Query<DiscusswenwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenwuxinxiVO> selectListVO(Wrapper<DiscusswenwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenwuxinxiVO selectVO(Wrapper<DiscusswenwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenwuxinxiView> selectListView(Wrapper<DiscusswenwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenwuxinxiView selectView(Wrapper<DiscusswenwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
