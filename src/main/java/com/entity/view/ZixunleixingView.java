package com.entity.view;

import com.entity.ZixunleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资讯类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
@TableName("zixunleixing")
public class ZixunleixingView  extends ZixunleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixunleixingView(){
	}
 
 	public ZixunleixingView(ZixunleixingEntity zixunleixingEntity){
 	try {
			BeanUtils.copyProperties(this, zixunleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
