package cn.myloveqian.controller;

import cn.myloveqian.service.IDictMasterService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/dictMaster")
public class DictMasterController {

    @Autowired
    private IDictMasterService dictMasterService;

    @RequestMapping("/getDictMaster")
    public
    @ResponseBody
    List<Map<String, String>> getDictMaster(HttpServletRequest request, HttpServletResponse response,
                                            ModelMap model) {
        List<Map<String, String>> result = dictMasterService.getDictMaster();
//        String resultJson = JSON.toJSONString(result);
//        return resultJson;
        return result;
    }




}
