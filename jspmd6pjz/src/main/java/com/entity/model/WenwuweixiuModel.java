package com.entity.model;

import com.entity.WenwuweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 文物维修
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public class WenwuweixiuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文物名称
	 */
	
	private String wenwumingcheng;
		
	/**
	 * 文物分类
	 */
	
	private String wenwufenlei;
		
	/**
	 * 维修说明
	 */
	
	private String weixiushuoming;
		
	/**
	 * 维修时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weixiushijian;
				
	
	/**
	 * 设置：文物名称
	 */
	 
	public void setWenwumingcheng(String wenwumingcheng) {
		this.wenwumingcheng = wenwumingcheng;
	}
	
	/**
	 * 获取：文物名称
	 */
	public String getWenwumingcheng() {
		return wenwumingcheng;
	}
				
	
	/**
	 * 设置：文物分类
	 */
	 
	public void setWenwufenlei(String wenwufenlei) {
		this.wenwufenlei = wenwufenlei;
	}
	
	/**
	 * 获取：文物分类
	 */
	public String getWenwufenlei() {
		return wenwufenlei;
	}
				
	
	/**
	 * 设置：维修说明
	 */
	 
	public void setWeixiushuoming(String weixiushuoming) {
		this.weixiushuoming = weixiushuoming;
	}
	
	/**
	 * 获取：维修说明
	 */
	public String getWeixiushuoming() {
		return weixiushuoming;
	}
				
	
	/**
	 * 设置：维修时间
	 */
	 
	public void setWeixiushijian(Date weixiushijian) {
		this.weixiushijian = weixiushijian;
	}
	
	/**
	 * 获取：维修时间
	 */
	public Date getWeixiushijian() {
		return weixiushijian;
	}
			
}
