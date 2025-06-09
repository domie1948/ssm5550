package com.entity.view;

import com.entity.WenwuweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文物维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
@TableName("wenwuweixiu")
public class WenwuweixiuView  extends WenwuweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenwuweixiuView(){
	}
 
 	public WenwuweixiuView(WenwuweixiuEntity wenwuweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, wenwuweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
