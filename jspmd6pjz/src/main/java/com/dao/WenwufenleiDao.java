package com.dao;

import com.entity.WenwufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenwufenleiVO;
import com.entity.view.WenwufenleiView;


/**
 * 文物分类
 * 
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwufenleiDao extends BaseMapper<WenwufenleiEntity> {
	
	List<WenwufenleiVO> selectListVO(@Param("ew") Wrapper<WenwufenleiEntity> wrapper);
	
	WenwufenleiVO selectVO(@Param("ew") Wrapper<WenwufenleiEntity> wrapper);
	
	List<WenwufenleiView> selectListView(@Param("ew") Wrapper<WenwufenleiEntity> wrapper);

	List<WenwufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WenwufenleiEntity> wrapper);
	
	WenwufenleiView selectView(@Param("ew") Wrapper<WenwufenleiEntity> wrapper);
	
}
