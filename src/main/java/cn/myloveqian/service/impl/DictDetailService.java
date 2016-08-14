package cn.myloveqian.service.impl;

import cn.myloveqian.dao.DictDetailMapper;
import cn.myloveqian.dao.DictMasterMapper;
import cn.myloveqian.service.IDictDetailService;
import cn.myloveqian.service.IDictMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>ProjectName:ChartHelp</p>
 * <p>Description:</p>
 *
 * @author:diaozhiwei
 * @data:2016/8/7
 */
@Service("dictDetailService")
public class DictDetailService implements IDictDetailService {

    @Autowired
    private DictDetailMapper dictDetailMapper;

    @Override
    public List<Map<String, String>> getDictDetail(Map<String,Object> params) {
        return dictDetailMapper.getDictDetail(params);
    }
}
