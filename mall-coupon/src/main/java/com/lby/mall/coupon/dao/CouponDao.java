package com.lby.mall.coupon.dao;

import com.lby.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 21:55:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
