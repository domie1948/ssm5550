package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenwuweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenwuweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenwuweixiuView;


/**
 * 文物维修
 *
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwuweixiuService extends IService<WenwuweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenwuweixiuVO> selectListVO(Wrapper<WenwuweixiuEntity> wrapper);
   	
   	WenwuweixiuVO selectVO(@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);
   	
   	List<WenwuweixiuView> selectListView(Wrapper<WenwuweixiuEntity> wrapper);
   	
   	WenwuweixiuView selectView(@Param("ew") Wrapper<WenwuweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenwuweixiuEntity> wrapper);
   	
}

