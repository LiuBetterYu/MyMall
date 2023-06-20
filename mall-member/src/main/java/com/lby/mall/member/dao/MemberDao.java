package com.lby.mall.member.dao;

import com.lby.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lby
 * @email lby@gmail.com
 * @date 2023-06-20 22:07:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
