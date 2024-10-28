package com.dao;

import com.entity.DiscussnongyeshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongyeshipinVO;
import com.entity.view.DiscussnongyeshipinView;


/**
 * 农业视频评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface DiscussnongyeshipinDao extends BaseMapper<DiscussnongyeshipinEntity> {
	
	List<DiscussnongyeshipinVO> selectListVO(@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);
	
	DiscussnongyeshipinVO selectVO(@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);
	
	List<DiscussnongyeshipinView> selectListView(@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);

	List<DiscussnongyeshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);
	
	DiscussnongyeshipinView selectView(@Param("ew") Wrapper<DiscussnongyeshipinEntity> wrapper);
	
}
