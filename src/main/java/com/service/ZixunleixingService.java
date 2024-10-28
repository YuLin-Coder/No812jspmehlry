package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunleixingView;


/**
 * 资讯类型
 *
 * @author 
 * @email 
 * @date 2021-03-13 21:11:02
 */
public interface ZixunleixingService extends IService<ZixunleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunleixingVO> selectListVO(Wrapper<ZixunleixingEntity> wrapper);
   	
   	ZixunleixingVO selectVO(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
   	
   	List<ZixunleixingView> selectListView(Wrapper<ZixunleixingEntity> wrapper);
   	
   	ZixunleixingView selectView(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunleixingEntity> wrapper);
   	
}

