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


import com.dao.ShicaigoumaiDao;
import com.entity.ShicaigoumaiEntity;
import com.service.ShicaigoumaiService;
import com.entity.vo.ShicaigoumaiVO;
import com.entity.view.ShicaigoumaiView;

@Service("shicaigoumaiService")
public class ShicaigoumaiServiceImpl extends ServiceImpl<ShicaigoumaiDao, ShicaigoumaiEntity> implements ShicaigoumaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShicaigoumaiEntity> page = this.selectPage(
                new Query<ShicaigoumaiEntity>(params).getPage(),
                new EntityWrapper<ShicaigoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShicaigoumaiEntity> wrapper) {
		  Page<ShicaigoumaiView> page =new Query<ShicaigoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShicaigoumaiVO> selectListVO(Wrapper<ShicaigoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShicaigoumaiVO selectVO(Wrapper<ShicaigoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShicaigoumaiView> selectListView(Wrapper<ShicaigoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShicaigoumaiView selectView(Wrapper<ShicaigoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
