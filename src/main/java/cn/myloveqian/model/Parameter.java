package cn.myloveqian.model;

import java.io.Serializable;

/**
 * cn.myloveqian.model
 *
 * @author zhiwei
 * @create 2016-09-24 11:28.
 */
public class Parameter implements Serializable {

    private String visitId;
    private String hisContractId;
    private String returnType;
    private String operateType;

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getHisContractId() {
        return hisContractId;
    }

    public void setHisContractId(String hisContractId) {
        this.hisContractId = hisContractId;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }
}
