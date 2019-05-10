package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.NewsMapper;
import cn.net.sinodata.model.News;
import cn.net.sinodata.service.NewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 新闻资讯service impl
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper mapper;

    /**
     * 获取所有资讯数据
     *
     * @return 所有资讯数据
     */
    public List<News> selectAll() {

        return mapper.selectAll();
    }

    /**
     * 根据ID获取资讯数据
     * @param id    资讯id
     * @return  资讯数据
     */
    public News selectById(String id) {
        return mapper.selectById(id);
    }

    /**
     * 根据参数获取资讯数据
     * @param news  参数
     * @return  资讯数据
     */
    public List<News> findNews(News news) {
        return mapper.findNews(news);
    }

    public int addNews(News news) {

        return mapper.addNews(news);
    }

    public int modNews(News news) {

        return mapper.modNews(news);
    }

    public int delNews(String id) {
        return mapper.delNews(id);
    }

    /**
     * 获取资讯分页数据
     * @return  资讯分页数据
     */
    public PageInfo<?> getNewsPage(int page, int rows, News news) {
        PageHelper.offsetPage(page, rows);

        return new PageInfo<>(mapper.findNews(news));
    }
}
