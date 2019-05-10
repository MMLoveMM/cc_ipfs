package cn.net.sinodata.util;

public class PageUtil {
    public static int getPage(int page, int rows) {
        page = page - 1;
        if (page == 0) {
            return page;
        }else {
            return page * rows;
        }
    }
}
