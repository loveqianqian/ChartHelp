package cn.myloveqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@Controller
@RequestMapping("/temp")
public class TempController {

    @RequestMapping("/GetInsuranceInfo")
    public
    @ResponseBody
    String GetInsuranceInfo(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData />" +
                "  <ReturnData>" +
                "    <Data>" +
                "      <DataRow ID_NO=\"510999197501010021\" NAME=\"职二一\" SEX=\"1\" BIRTHDAY=\"1975-01-01\" AGE=\"50\" PERSONAL_TYPE=\"1\" />" +
                "    </Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetInsuranceInfo\" TOKEN=\"\" OPT_ID=\"AB9999\" OPT_NAME=\"\" OPT_IP=\"\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"\" OPT_ACCT=\"\" />" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"192.168.200.197\" DEV_DATE=\"2016-09-26 18:16:28\" DEV_GUID=\"a3bb7791-77d3-4b09-b8a8-0c8fad268470\" DEV_ACCT=\"2016-09-26\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "  </Result>" +
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
                "      <DataRow CLINIC_LABEL=\"心内科普诊1\" VISIT_TIME_DESC=\"白天\" PATIENT_ID=\"M609190802\" ID_NO=\"\" NAME=\"职二一\" SEX=\"男\" AGE=\"41\" IDENTITY=\"本地病人\" CHARGE_TYPE=\"医疗保险\" CLINIC_TYPE=\"普通\" VISIT_DEPT=\"010140\" DOCTOR=\"赵炳让\" REGIST_FEE=\"0\" CLINIC_FEE=\"6\" OTHER_FEE=\"0\" CLINIC_CHARGE=\"6\" PERSON_NO=\"510999197501010021\" VISIT_NO=\"17263\" VISIT_DATE=\"2016-09-26\" RCPT_NO=\"t000051\" INSUR_NO=\"1000000000000000021\" INSUR_VISIT_ID=\"MZ0184160926123682\" INSURANCE_TYPE=\"1\" PAY_TYPE=\"1\" MT_TYPE=\"0\" INSUR_PAY=\"0\" ACCOUNT_PAY=\"0\" OWN_PAY=\"0\" TRAN_NO=\"1001225897\" REGISTRATION_STATUS=\"1\" DEPT_LOCATION=\"一楼心内科门诊\" IDENTITY_NAME=\"本地病人\" CHARGE_TYPE_NAME=\"医疗保险\" VISIT_DEPT_NAME=\"心内科门诊\" CLINIC_APPOINTS_ID=\"\" PT_PRINT_TIMES=\"0\" STATUS=\"2\" CARD_ID=\"\" SERIAL_NO=\"2\" MONEY_TYPE=\"\" />" +
                "    </Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetRegist\" TOKEN=\"本次交易的密钥\" OPT_ID=\"10000000\" OPT_NAME=\"手机APP\" OPT_IP=\"202.113.132.136\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"本次操作的唯一ID\" OPT_ACCT=\"\" />" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"192.168.200.197\" DEV_DATE=\"2016-09-26 18:16:29\" DEV_GUID=\"143785e9-f46c-46bc-8e8e-1c9cd0f1f373\" DEV_ACCT=\"2016-09-26\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "  </Result>" +
                "</BITCRoot>";
    }

    @RequestMapping("/SaveCharge")
    public
    @ResponseBody
    String SaveCharge(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "<CommitData />" +
                "<ReturnData>" +
                "<Bill>" +
                "<DataRow RCPT_NO=\"YY000111\" DEPT_LOCATION=\"临床化学室[一楼临床化学室];\" />" +
                "</Bill>" +
                "<Insurance>" +
                "<DataRow INSUR_PAY=\"0\" ACCOUNT_PAY=\"0\" OWN_PAY=\"0\" />" +
                "</Insurance>" +
                "<Payment>" +
                "<DataRow TRAN_NO=\"1001337194\" />" +
                "</Payment>" +
                "</ReturnData>" +
                "<ClientInfo>" +
                "<Info METHOD=\"SaveCharge\" TOKEN=\"\" OPT_ID=\"AB1482\" OPT_NAME=\"\" OPT_IP=\"\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"\" OPT_ACCT=\"\" />" +
                "</ClientInfo>" +
                "<ServerInfo>" +
                "<Info DEV_ID=\"DevId\" DEV_IP=\"fe80::1df7:298d:92bd:9a0a%15\" DEV_DATE=\"2016-10-26 15:46:56\" DEV_GUID=\"fa4a24c0-d101-4dd6-9cda-6cac42027f44\" DEV_ACCT=\"2016-10-26\" />" +
                "</ServerInfo>" +
                "<Result>" +
                "<Info EXECUTE_STATUS=\"1\" EXECUTE_MESSAGE=\"支付平台收费准备错误！&amp;#xA;调用医保接口DataDown_sp的L方法失败-----1|明细存在未完成的医院门诊交易!门诊就诊顺序号为MZ0184161026886928。错误:pkg_y_check.prm_fzszttzcheck_mz&amp;#x6;#\" />" +
                "</Result>" +
                "</BITCRoot>";
    }

    @RequestMapping("/GetCharge")
    public
    @ResponseBody
    String GetCharge(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData />" +
                "  <ReturnData>" +
                "    <Count>" +
                "      <DataRow ROW=\"19\" />" +
                "    </Count>" +
                "    <Data>" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-015\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"1503010010\" ITEM_NAME=\"盐酸美西律片*\" ITEM_SPEC=\"0.05g*100石药集团\" AMOUNT=\"1\" UNITS=\"瓶\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"11.82\" CHARGES=\"11.82\" INPUT_DATE_TIME=\"2016-9-26 17:06:18\" REQ_CLASS=\"处方\" REQ_ID=\"16092617291-1\" ADMIN=\"口服,3/日,每次0.15g,用时11日 \" APP_NO=\"16092617291\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"240201\" DEPT_NAME=\"门诊西药房\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-016\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"1503030010\" ITEM_NAME=\"盐酸维拉帕米缓释片*\" ITEM_SPEC=\"0.24g*10德国雅培\" AMOUNT=\"1\" UNITS=\"盒\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"27.52\" CHARGES=\"27.52\" INPUT_DATE_TIME=\"2016-9-26 17:06:18\" REQ_CLASS=\"处方\" REQ_ID=\"16092617291-2\" ADMIN=\"口服,1/日,每次0.12g,用时20日 \" APP_NO=\"16092617291\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"240201\" DEPT_NAME=\"门诊西药房\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-001\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL101376\" ITEM_NAME=\"密闭式留置针\" ITEM_SPEC=\"18、22、24\" AMOUNT=\"1\" UNITS=\"支\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"19.9\" CHARGES=\"19.9\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-002\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"HL003002\" ITEM_NAME=\"静脉注射\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"4\" CHARGES=\"4\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-003\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL101287\" ITEM_NAME=\"一次性高压注射针器造影剂针筒（安特）\" ITEM_SPEC=\"套装A筒\" AMOUNT=\"1\" UNITS=\"套\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"159.7\" CHARGES=\"159.7\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-004\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL101289\" ITEM_NAME=\"进口心电电极（蓝点）\" ITEM_SPEC=\"CMM-00-S\" AMOUNT=\"4\" UNITS=\"片\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"10\" CHARGES=\"10\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-005\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL010051\" ITEM_NAME=\"一次性注射器（BD）\" ITEM_SPEC=\"10ml\" AMOUNT=\"1\" UNITS=\"支\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"0.8\" CHARGES=\"0.8\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-006\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC870\" ITEM_NAME=\"#螺旋CT-体部平扫\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"324\" CHARGES=\"324\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-007\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL010097\" ITEM_NAME=\"#光盘复制\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"张\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"6.5\" CHARGES=\"6.5\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-008\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL101287\" ITEM_NAME=\"一次性高压注射针器造影剂针筒（安特）\" ITEM_SPEC=\"套装B筒\" AMOUNT=\"1\" UNITS=\"套\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"139.1\" CHARGES=\"139.1\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-009\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"ZL010045\" ITEM_NAME=\"置留针穿刺\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"10\" CHARGES=\"10\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-010\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC409\" ITEM_NAME=\"CT血管造影CEA\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"1200\" CHARGES=\"1200\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-011\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC413\" ITEM_NAME=\"螺旋CT-双螺旋连续扫描\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"135\" CHARGES=\"135\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-012\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC411\" ITEM_NAME=\"螺旋CT-激光照像\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"45\" CHARGES=\"45\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-013\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC412\" ITEM_NAME=\"螺旋CT-三维立体重建\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"135\" CHARGES=\"135\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-014\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC408\" ITEM_NAME=\"螺旋CT 十六层以上加层费\" ITEM_SPEC=\"/\" AMOUNT=\"7\" UNITS=\"层\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"56\" CHARGES=\"56\" INPUT_DATE_TIME=\"2016-9-26 10:51:25\" REQ_CLASS=\"检查\" REQ_ID=\"2418051-1\" ADMIN=\"\" APP_NO=\"2418051\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0602\" DEPT_NAME=\"CT室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-017\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"JC207\" ITEM_NAME=\"多导心电图检查自动分析\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"30\" CHARGES=\"30\" INPUT_DATE_TIME=\"2016-9-26 17:06:46\" REQ_CLASS=\"检查\" REQ_ID=\"2418052-1\" ADMIN=\"\" APP_NO=\"2418052\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"08\" DEPT_NAME=\"心功能科\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-018\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"HL005001\" ITEM_NAME=\"静脉采血\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"次\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"4\" CHARGES=\"4\" INPUT_DATE_TIME=\"2016-9-26 17:07:24\" REQ_CLASS=\"检验\" REQ_ID=\"1609267880-1\" ADMIN=\"\" APP_NO=\"1609267880\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0401\" DEPT_NAME=\"临床化学室\" />" +
                "      <DataRow CLINIC_COST_ITEM_NO=\"M609190802-00005-019\" PATIENT_ID=\"M609190802\" ITEM_CODE=\"CL010040\" ITEM_NAME=\"采血针\" ITEM_SPEC=\"/\" AMOUNT=\"1\" UNITS=\"支\" ORDERED_BY=\"010140\" ORDERED_DOCTOR=\"赵炳让\" COSTS=\"1.1\" CHARGES=\"1.1\" INPUT_DATE_TIME=\"2016-9-26 17:07:24\" REQ_CLASS=\"检验\" REQ_ID=\"1609267880-1\" ADMIN=\"\" APP_NO=\"1609267880\" CLINIC_ID=\"16092617263\" PERFORMED_BY=\"0401\" DEPT_NAME=\"临床化学室\" />" +
                "    </Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetCharge\" TOKEN=\"\" OPT_ID=\"AB9999\" OPT_NAME=\"\" OPT_IP=\"\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"\" OPT_ACCT=\"\" />" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"192.168.200.197\" DEV_DATE=\"2016-09-26 18:16:30\" DEV_GUID=\"ef38b1b9-5404-4feb-8e4b-f4f94ea10b9a\" DEV_ACCT=\"2016-09-26\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "  </Result>" +
                "</BITCRoot>";
    }

    @RequestMapping("/GetDoctorXml")
    public
    @ResponseBody
    String GetDoctorXml(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("xml"));
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<BITCRoot>" +
                "  <CommitData />" +
                "  <ReturnData>" +
                "    <Data>" +
                "      <DataRow DOCTOR_CODE=\"0770\" DOCTOR_NAME=\"王瑞莹\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0291\" DOCTOR_NAME=\"王伟1\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0310\" DOCTOR_NAME=\"吴尚勤\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0350\" DOCTOR_NAME=\"谢国璐\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0332\" DOCTOR_NAME=\"信庭文\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0782\" DOCTOR_NAME=\"徐乃勋\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0331\" DOCTOR_NAME=\"徐晓蕾\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0195\" DOCTOR_NAME=\"杨宁\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0884\" DOCTOR_NAME=\"姚青海\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1259\" DOCTOR_NAME=\"信庭文2\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1243\" DOCTOR_NAME=\"梁伯平\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1244\" DOCTOR_NAME=\"屈大展\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1245\" DOCTOR_NAME=\"赵炳让\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1246\" DOCTOR_NAME=\"裴诚民\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1248\" DOCTOR_NAME=\"孙根义\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1251\" DOCTOR_NAME=\"薛文会\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1252\" DOCTOR_NAME=\"殷雅琴\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1256\" DOCTOR_NAME=\"马凤英\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1257\" DOCTOR_NAME=\"何立军\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1260\" DOCTOR_NAME=\"赵萍\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任护师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0360\" DOCTOR_NAME=\"张赫男\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0290\" DOCTOR_NAME=\"张敬霞\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0355\" DOCTOR_NAME=\"张琦\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0224\" DOCTOR_NAME=\"张迎怡\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0128\" DOCTOR_NAME=\"张莹莹\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0876\" DOCTOR_NAME=\"张悦东\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0781\" DOCTOR_NAME=\"赵惠\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0221\" DOCTOR_NAME=\"赵茹\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0229\" DOCTOR_NAME=\"郑君毅\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0252\" DOCTOR_NAME=\"周秀军\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0345\" DOCTOR_NAME=\"白苗娜\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0190\" DOCTOR_NAME=\"陈刚\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0284\" DOCTOR_NAME=\"陈孟英\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0871\" DOCTOR_NAME=\"陈树涛\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0127\" DOCTOR_NAME=\"陈永利\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0227\" DOCTOR_NAME=\"丛洪良\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0316\" DOCTOR_NAME=\"丁军\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0165\" DOCTOR_NAME=\"董军\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0996\" DOCTOR_NAME=\"董其克\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0780\" DOCTOR_NAME=\"董双忠\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0356\" DOCTOR_NAME=\"堵芳\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0194\" DOCTOR_NAME=\"冯津萍\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0125\" DOCTOR_NAME=\"付乃宽\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0479\" DOCTOR_NAME=\"高静\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0878\" DOCTOR_NAME=\"顾隽珩\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0342\" DOCTOR_NAME=\"郭晓玲\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1145\" DOCTOR_NAME=\"郭绪昆\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0359\" DOCTOR_NAME=\"何文彬\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0357\" DOCTOR_NAME=\"金冬霞\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0193\" DOCTOR_NAME=\"寇璐\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0192\" DOCTOR_NAME=\"李春洁\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0097\" DOCTOR_NAME=\"李丽华\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0351\" DOCTOR_NAME=\"李璐珊\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0169\" DOCTOR_NAME=\"李晓卫\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0196\" DOCTOR_NAME=\"李杨\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0159\" DOCTOR_NAME=\"姜华\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0223\" DOCTOR_NAME=\"李作成\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0098\" DOCTOR_NAME=\"梁春卉\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0285\" DOCTOR_NAME=\"梁蓉\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0164\" DOCTOR_NAME=\"刘寅\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0251\" DOCTOR_NAME=\"刘玉洁\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0130\" DOCTOR_NAME=\"刘园园\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主治医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0352\" DOCTOR_NAME=\"刘远莹\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0741\" DOCTOR_NAME=\"刘志勇\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1238\" DOCTOR_NAME=\"魏春明\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0253\" DOCTOR_NAME=\"吕建国\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0783\" DOCTOR_NAME=\"马卫军\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1239\" DOCTOR_NAME=\"梁爽林\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0001\" DOCTOR_NAME=\"缪丽\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"1240\" DOCTOR_NAME=\"王惠中\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0191\" DOCTOR_NAME=\"秦勤\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0358\" DOCTOR_NAME=\"邵独婧\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0348\" DOCTOR_NAME=\"石雨田\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0462\" DOCTOR_NAME=\"宋静华\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0784\" DOCTOR_NAME=\"孙婕\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"副主任医师\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "      <DataRow DOCTOR_CODE=\"0133\" DOCTOR_NAME=\"董军1\" DEPT_CODE=\"010140\" DEPT_NAME=\"心内科门诊\" TITLE=\"\" EXPERTISE=\"\" INTRODUCTION=\"\" />" +
                "    </Data>" +
                "  </ReturnData>" +
                "  <ClientInfo>" +
                "    <Info METHOD=\"GetDoctorXml\" TOKEN=\"\" OPT_ID=\"AB9999\" OPT_NAME=\"\" OPT_IP=\"\" OPT_DATE=\"0001-01-01 00:00:00\" OPT_GUID=\"\" OPT_ACCT=\"\" />" +
                "  </ClientInfo>" +
                "  <ServerInfo>" +
                "    <Info DEV_ID=\"DevId\" DEV_IP=\"192.168.200.197\" DEV_DATE=\"2016-09-26 18:16:31\" DEV_GUID=\"1b1c866c-646e-4f93-94e2-6a129398e1ec\" DEV_ACCT=\"2016-09-26\" />" +
                "  </ServerInfo>" +
                "  <Result>" +
                "    <Info EXECUTE_STATUS=\"0\" EXECUTE_MESSAGE=\"\" />" +
                "  </Result>" +
                "</BITCRoot>";
    }

}
