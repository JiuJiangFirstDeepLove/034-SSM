package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShicaigoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShicaigoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicaigoumaiView;


/**
 * 食材购买
 *
 * @author 
 * @email 
 *
 */
public interface ShicaigoumaiService extends IService<ShicaigoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShicaigoumaiVO> selectListVO(Wrapper<ShicaigoumaiEntity> wrapper);
   	
   	ShicaigoumaiVO selectVO(@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);
   	
   	List<ShicaigoumaiView> selectListView(Wrapper<ShicaigoumaiEntity> wrapper);
   	
   	ShicaigoumaiView selectView(@Param("ew") Wrapper<ShicaigoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShicaigoumaiEntity> wrapper);
   	

}

