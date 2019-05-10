package cn.net.sinodata.controller;

import cn.net.sinodata.model.News;
import cn.net.sinodata.service.NewsService;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.JsonUtil;
import cn.net.sinodata.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        List<News> newsList = newsService.selectAll();

        if (newsList.isEmpty()) {
            logger.info("资讯数据为空");
            return "news/index";
        }

        List<Map<String, Object>> rtnMap = new ArrayList<>();
        for (News news : newsList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", news.getId());
            map.put("title", news.getTitle());
            map.put("updateDate", DateUtil.formatDate(news.getUpdateDate(), "yyyy-MM-dd"));
            rtnMap.add(map);
        }

        model.addAttribute("newsList", JsonUtil.toJson(rtnMap));

        logger.info("进入新闻资讯首页成功");
        return "news/index";
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
