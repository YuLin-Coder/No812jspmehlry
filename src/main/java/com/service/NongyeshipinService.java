package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongyeshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongyeshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyeshipinView;


/**
 * 农业视频
 *
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface NongyeshipinService extends IService<NongyeshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongyeshipinVO> selectListVO(Wrapper<NongyeshipinEntity> wrapper);
   	
   	NongyeshipinVO selectVO(@Param("ew") Wrapper<NongyeshipinEntity> wrapper);
   	
   	List<NongyeshipinView> selectListView(Wrapper<NongyeshipinEntity> wrapper);
   	
   	NongyeshipinView selectView(@Param("ew") Wrapper<NongyeshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongyeshipinEntity> wrapper);
   	
}

