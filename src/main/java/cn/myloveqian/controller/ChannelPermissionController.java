package cn.myloveqian.controller;

import cn.myloveqian.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/data")
public class ChannelPermissionController {

    @Autowired
    private IDataService dataService;

    @RequestMapping("/getData")
    public
    @ResponseBody
    Object getData(HttpServletRequest request, HttpServletResponse response, ModelMap
            model) {
        String hospital = request.getParameter("hospital");
        String type = request.getParameter("type");
        String status = request.getParameter("status");
        String profession = request.getParameter("profession");
        Map<String, Object> params = new HashMap<>();
        params.put("dataHospital", hospital);
        params.put("dataType", type);
        params.put("dataStatus", status);
        params.put("dataProfession", profession);
        List<Map<String, String>> results = dataService.getData(params);
//        String resultJson = JSON.toJSONString(result);
//        return resultJson;
        String str = null;
        for (Map<String, String> result : results) {
            String dataName = result.get("dataName");
            str += dataName + "\n";
        }
        model.put("result", str);
        return new ModelAndView("redirect:/r.html?result=" + str);
    }

    @RequestMapping("/getNewData")
    public
    @ResponseBody
    List<Map<String, String>> getNewData(HttpServletRequest request) {
        String hospital = request.getParameter("hospital");
        String type = request.getParameter("type");
        String status = request.getParameter("status");
        String profession = request.getParameter("profession");
        Map<String, Object> params = new HashMap<>();
        params.put("dataHospital", hospital);
        params.put("dataType", type);
        params.put("dataStatus", status);
        params.put("dataProfession", profession);
        List<Map<String, String>> results = dataService.getData(params);
        return results;
    }


}
