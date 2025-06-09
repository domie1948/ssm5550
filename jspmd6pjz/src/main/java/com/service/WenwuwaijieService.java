package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenwuwaijieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenwuwaijieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenwuwaijieView;


/**
 * 文物外借
 *
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface WenwuwaijieService extends IService<WenwuwaijieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenwuwaijieVO> selectListVO(Wrapper<WenwuwaijieEntity> wrapper);
   	
   	WenwuwaijieVO selectVO(@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);
   	
   	List<WenwuwaijieView> selectListView(Wrapper<WenwuwaijieEntity> wrapper);
   	
   	WenwuwaijieView selectView(@Param("ew") Wrapper<WenwuwaijieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenwuwaijieEntity> wrapper);
   	
}

