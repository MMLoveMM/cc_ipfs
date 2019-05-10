package cn.net.sinodata.mapper;

import cn.net.sinodata.model.News;

import java.util.List;

public interface NewsMapper {
    List<News> selectAll();

    News selectById(String id);

    List<News> findNews(News news);

    int addNews(News news);

    int modNews(News news);

    int delNews(String id);
}
