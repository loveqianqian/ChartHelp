package cn.myloveqian.controller;

import cn.myloveqian.service.IDictDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/dictDetail")
public class DictDetailController {

    @Autowired
    private IDictDetailService dictDetailService;

    @RequestMapping("/getDictDetail")
    public
    @ResponseBody
    List<Map<String, String>> getDictDetail(HttpServletRequest request, HttpServletResponse response,
                                            ModelMap model) {
        String masterId = request.getParameter("id");
        Map<String, Object> params = new HashMap<>();
        params.put("masterId", masterId);
        List<Map<String, String>> result = dictDetailService.getDictDetail(params);
        return result;
    }


}
