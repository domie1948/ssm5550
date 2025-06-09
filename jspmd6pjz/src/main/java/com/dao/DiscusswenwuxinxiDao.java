package com.dao;

import com.entity.DiscusswenwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenwuxinxiVO;
import com.entity.view.DiscusswenwuxinxiView;


/**
 * 文物信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface DiscusswenwuxinxiDao extends BaseMapper<DiscusswenwuxinxiEntity> {
	
	List<DiscusswenwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);
	
	DiscusswenwuxinxiVO selectVO(@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);
	
	List<DiscusswenwuxinxiView> selectListView(@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);

	List<DiscusswenwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);
	
	DiscusswenwuxinxiView selectView(@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);
	
}
