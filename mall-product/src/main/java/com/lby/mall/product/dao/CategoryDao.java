package com.lby.mall.product.dao;

import com.lby.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 19:02:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
