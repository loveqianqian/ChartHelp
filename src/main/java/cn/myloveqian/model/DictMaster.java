package cn.myloveqian.model;

import java.io.Serializable;

/**
 * <p>ProjectName:ChartHelp</p>
 * <p>Description:</p>
 *
 * @author:diaozhiwei
 * @data:2016/8/7
 */
public class DictMaster implements Serializable {

    private String masterId;
    private String masterName;

    public DictMaster(String masterId, String masterName) {
        this.masterId = masterId;
        this.masterName = masterName;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }
}
