package com.dao;

import com.entity.NongyeshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyeshipinVO;
import com.entity.view.NongyeshipinView;


/**
 * 农业视频
 * 
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface NongyeshipinDao extends BaseMapper<NongyeshipinEntity> {
	
	List<NongyeshipinVO> selectListVO(@Param("ew") Wrapper<NongyeshipinEntity> wrapper);
	
	NongyeshipinVO selectVO(@Param("ew") Wrapper<NongyeshipinEntity> wrapper);
	
	List<NongyeshipinView> selectListView(@Param("ew") Wrapper<NongyeshipinEntity> wrapper);

	List<NongyeshipinView> selectListView(Pagination page,@Param("ew") Wrapper<NongyeshipinEntity> wrapper);
	
	NongyeshipinView selectView(@Param("ew") Wrapper<NongyeshipinEntity> wrapper);
	
}
