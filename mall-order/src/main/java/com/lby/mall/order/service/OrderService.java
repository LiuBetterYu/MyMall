package com.lby.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lby.common.utils.PageUtils;
import com.lby.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 22:17:29
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

