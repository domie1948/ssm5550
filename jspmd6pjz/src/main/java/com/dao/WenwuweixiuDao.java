package com.dao;

import com.entity.WenwuweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenwuweixiuVO;
import com.entity.view.WenwuweixiuView;


/**
 * 文物维修
 * 
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwuweixiuDao extends BaseMapper<WenwuweixiuEntity> {
	
	List<WenwuweixiuVO> selectListVO(@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);
	
	WenwuweixiuVO selectVO(@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);
	
	List<WenwuweixiuView> selectListView(@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);

	List<WenwuweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);
	
	WenwuweixiuView selectView(@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);
	
}
