package com.lby.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lby.common.utils.PageUtils;
import com.lby.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 22:17:29
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

