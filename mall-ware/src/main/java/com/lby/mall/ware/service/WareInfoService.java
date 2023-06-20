package com.lby.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lby.common.utils.PageUtils;
import com.lby.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 22:25:06
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

