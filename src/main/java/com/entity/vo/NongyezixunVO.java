package com.entity.vo;

import com.entity.NongyezixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 农业资讯
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public class NongyezixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 资讯类型
	 */
	
	private String zixunleixing;
		
	/**
	 * 资料来源
	 */
	
	private String ziliaolaiyuan;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：资讯类型
	 */
	 
	public void setZixunleixing(String zixunleixing) {
		this.zixunleixing = zixunleixing;
	}
	
	/**
	 * 获取：资讯类型
	 */
	public String getZixunleixing() {
		return zixunleixing;
	}
				
	
	/**
	 * 设置：资料来源
	 */
	 
	public void setZiliaolaiyuan(String ziliaolaiyuan) {
		this.ziliaolaiyuan = ziliaolaiyuan;
	}
	
	/**
	 * 获取：资料来源
	 */
	public String getZiliaolaiyuan() {
		return ziliaolaiyuan;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
