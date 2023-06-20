package com.lby.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lby.mall.product.entity.BrandEntity;
import com.lby.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lby
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void test_service() {

         BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("test");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("测试");
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1L"));
        list.forEach((item) -> {
            System.out.println(item);
        });

    }

}
