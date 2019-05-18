package cn.net.sinodata.controller;

import cn.net.sinodata.model.News;
import cn.net.sinodata.service.NewsService;
import cn.net.sinodata.util.*;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 新闻资讯Controller
 *
 * @author PangPj
 */
@Controller
@RequestMapping(value = "/public/news")
public class NewsController {
    private static final Logger logger = LoggerFactory.getLogger(NewsController.class);

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    /**
     * 进入新闻资讯首页
     *
     * @return 新闻资讯首页地址
     */
    @RequestMapping(value = "index")
    public String toIndex(Model model) {
        logger.info("开始进入新闻资讯首页");

        logger.info("进入新闻资讯首页成功");
        return "news/index";
    }

    /**
     * 获取资讯列表数据
     *
     * @return 获取资讯列表数据
     */
    @RequestMapping(value = "list")
    @ResponseBody
    public Result<Map<String, Object>> getList(int page, int pageSize) {
        logger.info("开始获取新闻资讯列表数据");
        Result<Map<String, Object>> result = new Result<>();

        PageInfo<?> newsPage = newsService.getNewsPage(page, pageSize, new News());

        if (newsPage == null || newsPage.getList() == null || newsPage.getList().isEmpty()) {
            logger.info("资讯数据为空");
            return result.error("资讯数据为空");
        }

        List<Map<String, Object>> rtnList = new ArrayList<>();
        List<News> newsList = (List<News>) newsPage.getList();
        for (News news : newsList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", news.getId());
            map.put("title", news.getTitle());
            map.put("updateDate", DateUtil.formatDate(news.getUpdateDate(), "yyyy-MM-dd"));
            rtnList.add(map);
        }

        Map<String, Object> rtnMap = new HashMap<>();
        rtnMap.put("total", newsPage.getTotal());
        rtnMap.put("rows", rtnList);

        logger.info("获取资讯列表数据成功");
        return result.success(rtnMap);
    }

    /**
     * 进入资讯详情页
     *
     * @param newsId 资讯id
     * @return  资讯详情页地址
     */
    @RequestMapping(value = "/detail")
    public String toDetail(String newsId, Model model) {
        logger.info("参数 [{}] - 开始进入资讯详情页", newsId);

        if (StringUtil.isEmpty(newsId)) {
            logger.info("参数不能为空");
            return "news/detail";
        }

        News news = newsService.selectById(newsId);

        model.addAttribute("news", news);

        logger.info("进入资讯详情页成功");
        return "news/detail";
    }

}
