package com.dao;

import com.entity.ShicaigoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShicaigoumaiVO;
import com.entity.view.ShicaigoumaiView;


/**
 * 食材购买
 * 
 * @author 
 * @email 
 *
 */
public interface ShicaigoumaiDao extends BaseMapper<ShicaigoumaiEntity> {
	
	List<ShicaigoumaiVO> selectListVO(@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);
	
	ShicaigoumaiVO selectVO(@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);
	
	List<ShicaigoumaiView> selectListView(@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);

	List<ShicaigoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);
	
	ShicaigoumaiView selectView(@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);
	

}
