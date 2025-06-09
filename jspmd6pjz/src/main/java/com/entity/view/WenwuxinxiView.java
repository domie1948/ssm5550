package com.entity.view;

import com.entity.WenwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文物信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
@TableName("wenwuxinxi")
public class WenwuxinxiView  extends WenwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenwuxinxiView(){
	}
 
 	public WenwuxinxiView(WenwuxinxiEntity wenwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wenwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
