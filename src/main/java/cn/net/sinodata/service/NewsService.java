package cn.net.sinodata.service;

import cn.net.sinodata.mapper.NewsMapper;
import cn.net.sinodata.model.News;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * 新闻资讯Service
 */
public interface NewsService extends NewsMapper {
    PageInfo<?> getNewsPage(int page, int rows, News news);
}
