package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongyeshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongyeshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongyeshipinView;


/**
 * 农业视频评论表
 *
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface DiscussnongyeshipinService extends IService<DiscussnongyeshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongyeshipinVO> selectListVO(Wrapper<DiscussnongyeshipinEntity> wrapper);
   	
   	DiscussnongyeshipinVO selectVO(@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);
   	
   	List<DiscussnongyeshipinView> selectListView(Wrapper<DiscussnongyeshipinEntity> wrapper);
   	
   	DiscussnongyeshipinView selectView(@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongyeshipinEntity> wrapper);
   	
}

