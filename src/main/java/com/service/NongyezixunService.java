package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyezixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyezixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyezixunView;


/**
 * 农业资讯
 *
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface NongyezixunService extends IService<NongyezixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyezixunVO> selectListVO(Wrapper<NongyezixunEntity> wrapper);
   	
   	NongyezixunVO selectVO(@Param("ew") Wrapper<NongyezixunEntity> wrapper);
   	
   	List<NongyezixunView> selectListView(Wrapper<NongyezixunEntity> wrapper);
   	
   	NongyezixunView selectView(@Param("ew") Wrapper<NongyezixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyezixunEntity> wrapper);
   	
}

