package cn.myloveqian.dao;

import java.util.List;
import java.util.Map;

/**
 * <p>ProjectName:ChartHelp</p>
 * <p>Description:</p>
 *
 * @author:diaozhiwei
 * @data:2016/8/7
 */
public interface DataMapper {

    List<Map<String, String>> getData(Map<String, Object> params);

}
