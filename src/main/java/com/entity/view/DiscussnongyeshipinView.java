package com.entity.view;

import com.entity.DiscussnongyeshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农业视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
@TableName("discussnongyeshipin")
public class DiscussnongyeshipinView  extends DiscussnongyeshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussnongyeshipinView(){
	}
 
 	public DiscussnongyeshipinView(DiscussnongyeshipinEntity discussnongyeshipinEntity){
 	try {
			BeanUtils.copyProperties(this, discussnongyeshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
