package com.dao;

import com.entity.NongyezixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyezixunVO;
import com.entity.view.NongyezixunView;


/**
 * 农业资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface NongyezixunDao extends BaseMapper<NongyezixunEntity> {
	
	List<NongyezixunVO> selectListVO(@Param("ew") Wrapper<NongyezixunEntity> wrapper);
	
	NongyezixunVO selectVO(@Param("ew") Wrapper<NongyezixunEntity> wrapper);
	
	List<NongyezixunView> selectListView(@Param("ew") Wrapper<NongyezixunEntity> wrapper);

	List<NongyezixunView> selectListView(Pagination page,@Param("ew") Wrapper<NongyezixunEntity> wrapper);
	
	NongyezixunView selectView(@Param("ew") Wrapper<NongyezixunEntity> wrapper);
	
}
