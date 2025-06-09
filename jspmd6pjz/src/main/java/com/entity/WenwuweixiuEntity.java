package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 文物维修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
@TableName("wenwuweixiu")
public class WenwuweixiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenwuweixiuEntity() {
		
	}
	
	public WenwuweixiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 文物编号
	 */
					
	private String wenwubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weixiushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：文物编号
	 */
	public void setWenwubianhao(String wenwubianhao) {
		this.wenwubianhao = wenwubianhao;
	}
	/**
	 * 获取：文物编号
	 */
	public String getWenwubianhao() {
		return wenwubianhao;
	}
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
