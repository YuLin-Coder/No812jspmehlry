package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NongyeshipinDao;
import com.entity.NongyeshipinEntity;
import com.service.NongyeshipinService;
import com.entity.vo.NongyeshipinVO;
import com.entity.view.NongyeshipinView;

@Service("nongyeshipinService")
public class NongyeshipinServiceImpl extends ServiceImpl<NongyeshipinDao, NongyeshipinEntity> implements NongyeshipinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongyeshipinEntity> page = this.selectPage(
                new Query<NongyeshipinEntity>(params).getPage(),
                new EntityWrapper<NongyeshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongyeshipinEntity> wrapper) {
		  Page<NongyeshipinView> page =new Query<NongyeshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongyeshipinVO> selectListVO(Wrapper<NongyeshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongyeshipinVO selectVO(Wrapper<NongyeshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongyeshipinView> selectListView(Wrapper<NongyeshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongyeshipinView selectView(Wrapper<NongyeshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
