package com.entity.vo;

import com.entity.WenwuwaijieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 文物外借
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
public class WenwuwaijieVO  implements Serializable {
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
