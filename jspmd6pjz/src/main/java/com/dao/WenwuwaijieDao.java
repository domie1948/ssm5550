package com.dao;

import com.entity.WenwuwaijieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenwuwaijieVO;
import com.entity.view.WenwuwaijieView;


/**
 * 文物外借
 * 
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwuwaijieDao extends BaseMapper<WenwuwaijieEntity> {
	
	List<WenwuwaijieVO> selectListVO(@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);
	
	WenwuwaijieVO selectVO(@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);
	
	List<WenwuwaijieView> selectListView(@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);

	List<WenwuwaijieView> selectListView(Pagination page,@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);
	
	WenwuwaijieView selectView(@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);
	
}
