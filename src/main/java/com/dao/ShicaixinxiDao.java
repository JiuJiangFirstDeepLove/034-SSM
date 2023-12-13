package com.dao;

import com.entity.ShicaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShicaixinxiVO;
import com.entity.view.ShicaixinxiView;



public interface ShicaixinxiDao extends BaseMapper<ShicaixinxiEntity> {
	
	List<ShicaixinxiVO> selectListVO(@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);
	
	ShicaixinxiVO selectVO(@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);
	
	List<ShicaixinxiView> selectListView(@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);

	List<ShicaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);
	
	ShicaixinxiView selectView(@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);
	

}
