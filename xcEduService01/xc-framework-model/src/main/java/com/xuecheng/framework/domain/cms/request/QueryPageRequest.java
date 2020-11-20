package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;

/**
 * @author caoliang
 * @date 2020/11/16 - 18:51
 */
public class QueryPageRequest extends RequestData {
    //站点ID
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //页面别称
    private String pageAliase;
    //模板ID
    private String templateId;
}
