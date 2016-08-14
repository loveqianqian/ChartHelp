package cn.myloveqian.service.impl;

import cn.myloveqian.dao.DictMasterMapper;
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
@Service("dictMasterService")
public class DictMasterService implements IDictMasterService {

    @Autowired
    private DictMasterMapper dictMasterMapper;

    @Override
    public List<Map<String,String>> getDictMaster() {
        return dictMasterMapper.getDictMaster();
    }
}
