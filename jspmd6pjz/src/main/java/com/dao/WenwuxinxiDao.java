package com.dao;

import com.entity.WenwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenwuxinxiVO;
import com.entity.view.WenwuxinxiView;


/**
 * 文物信息
 * 
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwuxinxiDao extends BaseMapper<WenwuxinxiEntity> {
	
	List<WenwuxinxiVO> selectListVO(@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);
	
	WenwuxinxiVO selectVO(@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);
	
	List<WenwuxinxiView> selectListView(@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);

	List<WenwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);
	
	WenwuxinxiView selectView(@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);
	
}
