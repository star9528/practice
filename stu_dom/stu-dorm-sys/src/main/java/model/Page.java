package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.servlet.http.HttpServletRequest;

@Getter
@Setter
@ToString
public class Page {
    private String searchText;//搜索的内容
    private String sortOrder;//排序的方式:升序,降序
    private Integer pageSize;//每项的数据
    private Integer pageNumber;//当前的页码


    /**
     * request输入流只能获取请求体的数据
     * request.getParameter可以获取url和请求体中的数据:K1=v1&k2=v2...
     * @param req
     * @return
     */

    public static Page parse(HttpServletRequest req) {//
        Page p = new Page();
        p.searchText = req.getParameter("searchText");
        p.sortOrder = req.getParameter("sortOrder");
        p.pageSize = Integer.parseInt(req.getParameter("pageSize"));
        p.pageNumber = Integer.parseInt(req.getParameter("pageNumber"));
        return p;
    }
}
