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


import com.dao.DiscussnongyeshipinDao;
import com.entity.DiscussnongyeshipinEntity;
import com.service.DiscussnongyeshipinService;
import com.entity.vo.DiscussnongyeshipinVO;
import com.entity.view.DiscussnongyeshipinView;

@Service("discussnongyeshipinService")
public class DiscussnongyeshipinServiceImpl extends ServiceImpl<DiscussnongyeshipinDao, DiscussnongyeshipinEntity> implements DiscussnongyeshipinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongyeshipinEntity> page = this.selectPage(
                new Query<DiscussnongyeshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussnongyeshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongyeshipinEntity> wrapper) {
		  Page<DiscussnongyeshipinView> page =new Query<DiscussnongyeshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongyeshipinVO> selectListVO(Wrapper<DiscussnongyeshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongyeshipinVO selectVO(Wrapper<DiscussnongyeshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongyeshipinView> selectListView(Wrapper<DiscussnongyeshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongyeshipinView selectView(Wrapper<DiscussnongyeshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
