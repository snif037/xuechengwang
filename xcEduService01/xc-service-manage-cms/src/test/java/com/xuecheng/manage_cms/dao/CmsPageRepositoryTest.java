package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @author caoliang
 * @date 2020/11/18 - 0:18
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    /**
     * 查询所有信息
     */
    @Test
    public void testFindAll(){
        List<CmsPage> pages = cmsPageRepository.findAll();
        System.out.println(pages);
    }

    /**
     * 分页查询
     */
    @Test
    public void testFindPage(){
        //分页参数
        int page = 3;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);

        Page<CmsPage> pages = cmsPageRepository.findAll(pageable);
        System.out.println(pages);

    }

    /**
     * 修改参数
     */
    @Test
    public void testUpdate(){
       //先查询修改id
        Optional<CmsPage> optional = cmsPageRepository.findById("5a92141cb00ffc5a448ff1a0");

        if(optional.isPresent()){
            CmsPage cmsPage = optional.get();
            //设置修改的稚
            cmsPage.setPageAliase("课程详情更新页面");
            CmsPage save = cmsPageRepository.save(cmsPage);
            System.out.println(save);
        }
    }

    /**
     * 根据页面名称查询
     */
    @Test
    public void testFindByPageName(){
        CmsPage cmsPage = cmsPageRepository.findByPageName("测试页面");
        System.out.println(cmsPage);
    }
}
