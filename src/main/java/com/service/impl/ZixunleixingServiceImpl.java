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


import com.dao.ZixunleixingDao;
import com.entity.ZixunleixingEntity;
import com.service.ZixunleixingService;
import com.entity.vo.ZixunleixingVO;
import com.entity.view.ZixunleixingView;

@Service("zixunleixingService")
public class ZixunleixingServiceImpl extends ServiceImpl<ZixunleixingDao, ZixunleixingEntity> implements ZixunleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunleixingEntity> page = this.selectPage(
                new Query<ZixunleixingEntity>(params).getPage(),
                new EntityWrapper<ZixunleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunleixingEntity> wrapper) {
		  Page<ZixunleixingView> page =new Query<ZixunleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunleixingVO> selectListVO(Wrapper<ZixunleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunleixingVO selectVO(Wrapper<ZixunleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunleixingView> selectListView(Wrapper<ZixunleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunleixingView selectView(Wrapper<ZixunleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
