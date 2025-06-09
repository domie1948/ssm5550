package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenwufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenwufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenwufenleiView;


/**
 * 文物分类
 *
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwufenleiService extends IService<WenwufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenwufenleiVO> selectListVO(Wrapper<WenwufenleiEntity> wrapper);
   	
   	WenwufenleiVO selectVO(@Param("ew") Wrapper<WenwufenleiEntity> wrapper);
   	
   	List<WenwufenleiView> selectListView(Wrapper<WenwufenleiEntity> wrapper);
   	
   	WenwufenleiView selectView(@Param("ew") Wrapper<WenwufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenwufenleiEntity> wrapper);
   	
}

