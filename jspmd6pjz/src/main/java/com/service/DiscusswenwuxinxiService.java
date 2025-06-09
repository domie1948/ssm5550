package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenwuxinxiView;


/**
 * 文物信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public interface DiscusswenwuxinxiService extends IService<DiscusswenwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenwuxinxiVO> selectListVO(Wrapper<DiscusswenwuxinxiEntity> wrapper);
   	
   	DiscusswenwuxinxiVO selectVO(@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);
   	
   	List<DiscusswenwuxinxiView> selectListView(Wrapper<DiscusswenwuxinxiEntity> wrapper);
   	
   	DiscusswenwuxinxiView selectView(@Param("ew") Wrapper<DiscusswenwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenwuxinxiEntity> wrapper);
   	
}

