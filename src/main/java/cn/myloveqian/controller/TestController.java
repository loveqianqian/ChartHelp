package cn.myloveqian.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/master")
    public
    @ResponseBody
    String getDictMaster(HttpServletRequest request, HttpServletResponse response) {
//    Map<String, Object> getDictMaster(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("hisContractId"));
//        Map<String,Object> result=new HashMap<>();
//        result.put("code","SUCCESS");
//        result.put("msgInfo","?????");
//        result.put("subCode","");
//        result.put("subMsg","");
//        result.put("appId","1");
//        result.put("appTradeNo","1466219783590");
//        result.put("appRefundNo","1470211236040");
//        result.put("tradeNo","20160618111643593");
//        result.put("channel","ALI_OFFLINE_BAR_CODE");
//        result.put("refundFee","7.45");
//        result.put("refundCompleteTime","1470211243977");
//        result.put("tradeStatus","TRADE_CLOSED");
        return "{" +
                "\"code\": \"SUCCESS\"," +
                "\"msgInfo\": \"退款成功\"," +
                "\"subCode\": null," +
                "\"subMsg\": null," +
                "\"appId\": \"1\"," +
                "\"appTradeNo\": \"1466219783590\"," +
                "\"appRefundNo\": \"1470211236040\"," +
                "\"channel\": \"ALI_OFFLINE_BAR_CODE\"," +
                "\"refundFee\": 0.01," +
                "\"tradeNo\": \"20160618111643593\"," +
                "\"tradeStatus\": \"TRADE_CLOSED\"," +
                "\"refundCompleteTime\": 1470211243977" +
                "}";
    }

    @RequestMapping(value = "/wsTest",method = RequestMethod.GET)
    public
    @ResponseBody
    String getTest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("hisContractId"));
        Map<String,Object> params=new HashMap<>();
        params.put("code","1");
        params.put("msgInfo",request.getParameter("hisContractId"));
        params.put("subCode","");
        params.put("subMsg","");
        params.put("appId",request.getParameter("returnType"));
        params.put("appTradeNo",request.getParameter("operateType"));
        params.put("appRefundNo","appRefundNo");
        params.put("tradeNo","tradeNo");
        params.put("channel","channel");
        params.put("refundFee","refundFee");
        params.put("refundCompleteTime","refundCompleteTime");
        params.put("tradeStatus","tradeStatus");
        return JSON.toJSONString(params);
    }

    @RequestMapping("/SaveCharge")
    public
    @ResponseBody
    String SaveCharge(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData />" +
                "  <ReturnData>" +
                "<Bill>" +
                "<DataRow RCPT_NO=\"内部票据号\" DEPT_LOCATION=”科室位置”/>" +
                "</Bill>" +
                "<Insurance>" +
                "<DataRow INSUR_PAY=\"统筹支付\" ACCOUNT_PAY =\"个人账户支付\" OWN_PAY=\"个人自费\" />" +
                "</Insurance>" +
                "<Payment>" +
                "<DataRow TRAN_NO=\"合同号\" />" +
                "</Payment>" +
                "</ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"SaveCharge\" TOKEN=\"交易密钥\" OPT_ID=\"操作者ID\" OPT_NAME=\"操作者姓名\" " +
                "OPT_IP=\"操作者IP\" OPT_DATE=\"操作时间\" OPT_GUID=\"客户端操作的唯一ID\" OPT_ACCT=\"客户端账期\"/>" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"设备ID\" DEV_IP=\"设备IP\" DEV_DATE=\"设备时间\" DEV_GUID=\"服务端操作的唯一ID\" " +
                "DEV_ACCT=\"服务端账期\"/>" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"执行结果\" EXECUTE_MESSAGE=\"执行信息\"/>" +
                "  </Result>" +
                "</BITCRoot>";
    }

    @RequestMapping("/GetCharge")
    public
    @ResponseBody
    String GetCharge(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "<CommitData />" +
                "<ReturnData>" +
                "<Count>" +
                "<DataRow ROW=\"6\" />" +
                "</Count>" +
                "<Data>" +
                "<DataRow CLINIC_COST_ITEM_NO=\"M609099670-00001-001\" PATIENT_ID=\"M609099670\" " +
                "ITEM_CODE=\"0205020020\" ITEM_NAME=\"酒石酸美托洛尔片*\" ITEM_SPEC=\"25mg*20阿斯利康\" AMOUNT=\"1\" " +
                "UNITS=\"盒\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"何立军\" COSTS=\"7.84\" CHARGES=\"7.84\" " +
                "INPUT_DATE_TIME=\"2016/9/9 10:39:57\" REQ_CLASS=\"处方\" REQ_ID=\"16090910779-1\" " +
                "ADMIN=\"口服,2/日,每次1片,用时10日 \" APP_NO=\"16090910779\" CLINIC_ID=\"16090910749\" " +
                "PERFORMED_BY=\"240201\" DEPT_NAME=\"门诊西药房\" />" +
                "<DataRow CLINIC_COST_ITEM_NO=\"M609099670-00001-002\" PATIENT_ID=\"M609099670\" " +
                "ITEM_CODE=\"JC207\" ITEM_NAME=\"多导心电图检查自动分析\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" " +
                "ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"何立军\" COSTS=\"30\" CHARGES=\"30\" " +
                "INPUT_DATE_TIME=\"2016/9/9 10:40:33\" REQ_CLASS=\"检查\" REQ_ID=\"2431768-1\" ADMIN=\"\" " +
                "APP_NO=\"2431768\" CLINIC_ID=\"16090910749\" PERFORMED_BY=\"08\" DEPT_NAME=\"心功能科\" />" +
                "<DataRow CLINIC_COST_ITEM_NO=\"M609099670-00001-005\" PATIENT_ID=\"M609099670\" " +
                "ITEM_CODE=\"JY475\" ITEM_NAME=\"血常规\" ITEM_SPEC=\"仪器法\" AMOUNT=\"1\" UNITS=\"份\" " +
                "ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"何立军\" COSTS=\"25\" CHARGES=\"25\" " +
                "INPUT_DATE_TIME=\"2016/9/9 10:40:42\" REQ_CLASS=\"检验\" REQ_ID=\"1609095722-1\" ADMIN=\"\" " +
                "APP_NO=\"1609095722\" CLINIC_ID=\"16090910749\" PERFORMED_BY=\"0402\" DEPT_NAME=\"血液体液室\" " +
                "/>" +
                "<DataRow CLINIC_COST_ITEM_NO=\"M609099670-00001-006\" PATIENT_ID=\"M609099670\" " +
                "ITEM_CODE=\"CL010060\" ITEM_NAME=\"真空采血管\" ITEM_SPEC=\"BD\" AMOUNT=\"1\" UNITS=\"支\" " +
                "ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"何立军\" COSTS=\"1.7\" CHARGES=\"1.7\" " +
                "INPUT_DATE_TIME=\"2016/9/9 10:40:42\" REQ_CLASS=\"检验\" REQ_ID=\"1609095722-1\" ADMIN=\"\" " +
                "APP_NO=\"1609095722\" CLINIC_ID=\"16090910749\" PERFORMED_BY=\"0402\" DEPT_NAME=\"血液体液室\" " +
                "/>" +
                "<DataRow CLINIC_COST_ITEM_NO=\"M609099670-00001-003\" PATIENT_ID=\"M609099670\" " +
                "ITEM_CODE=\"HL005001\" ITEM_NAME=\"静脉采血\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" " +
                "ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"何立军\" COSTS=\"4\" CHARGES=\"4\" " +
                "INPUT_DATE_TIME=\"2016/9/9 10:40:42\" REQ_CLASS=\"检验\" REQ_ID=\"1609095723-1\" ADMIN=\"\" " +
                "APP_NO=\"1609095723\" CLINIC_ID=\"16090910749\" PERFORMED_BY=\"0401\" DEPT_NAME=\"临床化学室\" " +
                "/>" +
                "<DataRow CLINIC_COST_ITEM_NO=\"M609099670-00001-004\" PATIENT_ID=\"M609099670\" " +
                "ITEM_CODE=\"CL010040\" ITEM_NAME=\"采血针\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"支\" " +
                "ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"何立军\" COSTS=\"1.1\" CHARGES=\"1.1\" " +
                "INPUT_DATE_TIME=\"2016/9/9 10:40:42\" REQ_CLASS=\"检验\" REQ_ID=\"1609095723-1\" ADMIN=\"\" " +
                "APP_NO=\"1609095723\" CLINIC_ID=\"16090910749\" PERFORMED_BY=\"0401\" DEPT_NAME=\"临床化学室\" " +
                "/>" +
                "</Data>" +
                "</ReturnData>" +
                "<ClientInfo>" +
                "<Info METHOD=\"GetCharge\" TOKEN=\"本次交易的密钥\" OPT_ID=\"10000000\" OPT_NAME=\"手机APP\" " +
                "OPT_IP=\"202.113.132.136\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"本次操作的唯一ID\" " +
                "OPT_ACCT=\"\" />" +
                "</ClientInfo>" +
                "<ServerInfo>" +
                "<Info DEV_ID=\"DevId\" DEV_IP=\"fe80::51b:e454:646d:1a2d%11\" DEV_DATE=\"2016-09-09 " +
                "15:03:08\" DEV_GUID=\"9fac318c-137a-49a1-b01b-6709cda6be0e\" DEV_ACCT=\"2016-09-09\" />" +
                "</ServerInfo>" +
                "<Result>" +
                "<Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "</Result>" +
                "</BITCRoot>";
    }

    @RequestMapping("/GetRegist")
    public
    @ResponseBody
    String GetRegist(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData />" +
                "  <ReturnData>" +
                "    <Count>" +
                "      <DataRow ROW=\"1\" />" +
                "    </Count>" +
                "    <Data>" +
                "      <DataRow CLINIC_LABEL=\"心内义诊号\" VISIT_TIME_DESC=\"上午\" PATIENT_ID=\"M609099670\" ID_NO=\"\" NAME=\"邓勇\" SEX=\"男\" AGE=\"25\" IDENTITY=\"本地病人\" CHARGE_TYPE=\"医疗保险\" CLINIC_TYPE=\"义诊\" VISIT_DEPT=\"010140\" DOCTOR=\"何立军\" REGIST_FEE=\"0\" CLINIC_FEE=\"0\" OTHER_FEE=\"0\" CLINIC_CHARGE=\"0\" PERSON_NO=\"120101199012213012\" VISIT_NO=\"10749\" VISIT_DATE=\"2016-09-09\" RCPT_NO=\"YR068720\" INSUR_NO=\"6214670060004978015\" INSUR_VISIT_ID=\"MZ0184160909149325\" INSURANCE_TYPE=\"\" PAY_TYPE=\"1\" MT_TYPE=\"0\" INSUR_PAY=\"0\" ACCOUNT_PAY=\"0\" OWN_PAY=\"0\" TRAN_NO=\"1001247525\" REGISTRATION_STATUS=\"1\" DEPT_LOCATION=\"一楼心内科门诊\" IDENTITY_NAME=\"本地病人\" CHARGE_TYPE_NAME=\"医疗保险\" VISIT_DEPT_NAME=\"心内科门诊\" CLINIC_APPOINTS_ID=\"\" PT_PRINT_TIMES=\"0\" STATUS=\"2\" CARD_ID=\"\" SERIAL_NO=\"247\" MONEY_TYPE=\"\" />" +
                "    </Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetRegist\" TOKEN=\"本次交易的密钥\" OPT_ID=\"10000000\" OPT_NAME=\"手机APP\" OPT_IP=\"202.113.132.136\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"本次操作的唯一ID\" OPT_ACCT=\"\" />" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"fe80::51b:e454:646d:1a2d%11\" DEV_DATE=\"2016-09-09 13:14:57\" DEV_GUID=\"b377da09-a295-4bf4-9075-17a0740eda48\" DEV_ACCT=\"2016-09-09\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "  </Result>" +
                "</BITCRoot>";
    }

    @RequestMapping("/GetInsuranceInfo")
    public
    @ResponseBody
    String GetInsuranceInfo(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData />" +
                "  <ReturnData>" +
                "<Data>" +
                "<DataRow ID_NO=\"1201041992016165513\" NAME=\"刁志伟\" SEX=\"男\" BIRTHDAY=\"1992-6-16\" AGE=\"24\" " +
                "PERSONAL_TYPE=\"1\"/>" +
                "</Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetInsuranceInfo\" TOKEN=\"本次交易的密钥\" OPT_ID=\"10000000\" OPT_NAME=\"shoujiApp\" " +
                "OPT_IP=\"202.113.132.136\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"本次操作的唯一ID\" OPT_ACCT=\"kehuduanzhangqi\"/>" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"fe80::51b:e454:646d:1a2d%11\" DEV_DATE=\"2016-09-09 " +
                "13:14:57\" DEV_GUID=\"b377da09-a295-4bf4-9075-17a0740eda48\" DEV_ACCT=\"2016-09-09\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\"/>" +
                "  </Result></BITCRoot>";
    }

    @RequestMapping("/TranConfirm")
    public
    @ResponseBody
    String TranConfirm(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "";
    }

    @Deprecated
    @RequestMapping("/GetDoctorXmlForTest")
    public
    @ResponseBody
    String GetDoctorXmlForTest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        System.out.println("start");
        try {
            Thread.sleep(999999L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData/>" +
                "  <ReturnData>" +
                "<Data>" +
                "<DataRow DOCTOR_CODE=\"000001\" DOCTOR_NAME=\"何立军\" DEPT_CODE=\"010140\" " +
                "DEPT_NAME=\"心内一科\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\"/>" +
                "</Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetDoctorXml\" TOKEN=\"交易密钥\" OPT_ID=\"10000000\" OPT_NAME=\"手机APP\" " +
                "OPT_IP=\"操作者IP\" OPT_DATE=\"操作时间\" OPT_GUID=\"客户端操作的唯一ID\" OPT_ACCT=\"客户端账期\"/>" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"fe80::51b:e454:646d:1a2d%11\" DEV_DATE=\"2016-09-09 " +
                "13:14:57\" DEV_GUID=\"b377da09-a295-4bf4-9075-17a0740eda48\" DEV_ACCT=\"2016-09-09\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\"/>" +
                "  </Result>";
    }

    @RequestMapping("/GetDoctorXml")
    public
    @ResponseBody
    String GetDoctorXml(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        System.out.println("start");
        try {
            Thread.sleep(999999L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData/>" +
                "  <ReturnData>" +
                "<Data>" +
                "<DataRow DOCTOR_CODE=\"000001\" DOCTOR_NAME=\"何立军\" DEPT_CODE=\"010140\" " +
                "DEPT_NAME=\"心内一科\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\"/>" +
                "</Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetDoctorXml\" TOKEN=\"交易密钥\" OPT_ID=\"10000000\" OPT_NAME=\"手机APP\" " +
                "OPT_IP=\"操作者IP\" OPT_DATE=\"操作时间\" OPT_GUID=\"客户端操作的唯一ID\" OPT_ACCT=\"客户端账期\"/>" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"fe80::51b:e454:646d:1a2d%11\" DEV_DATE=\"2016-09-09 " +
                "13:14:57\" DEV_GUID=\"b377da09-a295-4bf4-9075-17a0740eda48\" DEV_ACCT=\"2016-09-09\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\"/>" +
                "  </Result>";
    }

    @RequestMapping("/TranCancel")
    public
    @ResponseBody
    String TranCancel(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData>" +
                "<Regist>" +
                "<DataRow PERSON_NO=\"个人编码\" PATIENT_ID=\"患者ID\" VISIT_NO=\"就诊号\" VISIT_DATE=\"挂号日期\" " +
                "APPOINT_ID=\"预约ID\" TRAN_NO=\"合同号\"/>" +
                "</Regist>" +
                "<Bill>" +
                "<DataRow RCPT_NO=\"内部票据号\" TYPE=\"撤销类别\" INSUR_LIMITS=”医保撤销校验” />" +
                "</Bill>" +
                "<Insurance>" +
                "<DataRow INSUR_NO=\"医保卡号\" INSUR_PWD=\"医保卡密码\" INSUR_VISIT_ID=\"医保就诊顺序号\" " +
                "INSURANCE_TYPE=\"医保类型\" PAY_TYPE=\"支付类别\" MT_TYPE=\"门特类别\" INSUR_PAY=\"统筹支付\" ACCOUNT_PAY " +
                "=\"个人账户支付\" OWN_PAY=\"个人自费\" />" +
                "</Insurance>" +
                "</CommitData>" +
                "  <ReturnData />" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"TranCancel\" TOKEN=\"交易密钥\" OPT_ID=\"操作者ID\" OPT_NAME=\"操作者姓名\" " +
                "OPT_IP=\"操作者IP\" OPT_DATE=\"操作时间\" OPT_GUID=\"客户端操作的唯一ID\" OPT_ACCT=\"客户端账期\"/>" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"\" DEV_IP=\"\" DEV_DATE=\"\" DEV_GUID=\"\" DEV_ACCT=\"\"/>" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "  </Result>" +
                "</BITCRoot>";
    }

}
