package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenwuxinxiView;


/**
 * 文物信息
 *
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwuxinxiService extends IService<WenwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenwuxinxiVO> selectListVO(Wrapper<WenwuxinxiEntity> wrapper);
   	
   	WenwuxinxiVO selectVO(@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);
   	
   	List<WenwuxinxiView> selectListView(Wrapper<WenwuxinxiEntity> wrapper);
   	
   	WenwuxinxiView selectView(@Param("ew") Wrapper<WenwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenwuxinxiEntity> wrapper);
   	
}

