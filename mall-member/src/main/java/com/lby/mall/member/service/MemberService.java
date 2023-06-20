package com.lby.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lby.common.utils.PageUtils;
import com.lby.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 22:07:01
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

