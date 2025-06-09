package com.entity.view;

import com.entity.WenwufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文物分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
@TableName("wenwufenlei")
public class WenwufenleiView  extends WenwufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenwufenleiView(){
	}
 
 	public WenwufenleiView(WenwufenleiEntity wenwufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, wenwufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
