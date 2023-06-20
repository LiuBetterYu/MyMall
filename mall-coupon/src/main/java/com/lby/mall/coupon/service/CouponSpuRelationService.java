package com.lby.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lby.common.utils.PageUtils;
import com.lby.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 21:55:14
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

