package cn.myloveqian.service;

import java.util.List;
import java.util.Map;

/**
 * <p>ProjectName:ChartHelp</p>
 * <p>Description:</p>
 *
 * @author:diaozhiwei
 * @data:2016/8/7
 */
public interface IDictDetailService {

    List<Map<String, String>> getDictDetail(Map<String,Object> params);

}
