package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author caoliang
 * @date 2020/11/18 - 0:01
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

    //自定义查询接口
    CmsPage findByPageName(String pageName);
}
