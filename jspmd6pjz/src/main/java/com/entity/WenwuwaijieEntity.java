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
 * 文物外借
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
@TableName("wenwuwaijie")
public class WenwuwaijieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenwuwaijieEntity() {
		
	}
	
	public WenwuwaijieEntity(T t) {
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
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 外借事由
	 */
					
	private String waijieshiyou;
	
	/**
	 * 外借日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date waijieriqi;
	
	/**
	 * 借用单位
	 */
					
	private String jieyongdanwei;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：外借事由
	 */
	public void setWaijieshiyou(String waijieshiyou) {
		this.waijieshiyou = waijieshiyou;
	}
	/**
	 * 获取：外借事由
	 */
	public String getWaijieshiyou() {
		return waijieshiyou;
	}
	/**
	 * 设置：外借日期
	 */
	public void setWaijieriqi(Date waijieriqi) {
		this.waijieriqi = waijieriqi;
	}
	/**
	 * 获取：外借日期
	 */
	public Date getWaijieriqi() {
		return waijieriqi;
	}
	/**
	 * 设置：借用单位
	 */
	public void setJieyongdanwei(String jieyongdanwei) {
		this.jieyongdanwei = jieyongdanwei;
	}
	/**
	 * 获取：借用单位
	 */
	public String getJieyongdanwei() {
		return jieyongdanwei;
	}
	/**
	 * 设置：联系人
	 */
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
