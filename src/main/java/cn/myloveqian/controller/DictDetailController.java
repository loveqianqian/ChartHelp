package cn.myloveqian.controller;

import cn.myloveqian.service.IDictDetailService;
import cn.myloveqian.utils.XmlUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/dictDetail")
public class DictDetailController {

    @Autowired
    private IDictDetailService dictDetailService;

    @RequestMapping("/getDictDetail")
    public
    @ResponseBody
    List<Map<String, String>> getDictDetail(HttpServletRequest request, HttpServletResponse response,
                                            ModelMap model) {
        String masterId = request.getParameter("id");
        Map<String, Object> params = new HashMap<>();
        params.put("masterId", masterId);
        List<Map<String, String>> result = dictDetailService.getDictDetail(params);
        return result;
    }


    @RequestMapping("/getExam")
    public
    @ResponseBody
    String getExam(HttpServletRequest request, HttpServletResponse response) {
        String msg = request.getParameter("xml");
        String result = null;
        try {
            Document document = XmlUtils.getDocument(msg);
            Element root = document.getRootElement();
            Element commitData = root.element("CommitData");
            Element dataNode1 = commitData.element("DataNode1");
            Element dataRow = dataNode1.element("DataRow");
            String idNo = dataRow.attribute("ID_NO").getText();
            String patientId = dataRow.attribute("PATIENT_ID").getText();
            if (idNo != null || patientId != null) {
                Element operateInfo = root.element("OperateInfo");
                Element info = operateInfo.element("Info");
                String optId = info.attribute("OPT_ID").getText();
                String method = info.attribute("METHOD").getText();
                if (optId != null && optId.equals("10000000")) {
                    if (method.equals("getExam")) {
                        result = out;
                    } else {
                        throw new RuntimeException("method name is wrong");
                    }
                } else {
                    throw new RuntimeException("optId is mistake");
                }
            } else {
                throw new RuntimeException("lack of some elements");
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String out = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<BITCRoot>" +
            "    <CommitData>" +
            "    </CommitData>" +
            "    <ReturnData>" +
            "        <DataNode1>" +
            "            <DataRow REPORT_NO=\"04592\" EXAM_CLASS=\"肺部CT\" REQ_DATE_TIME=\"2016-08-04 23:23:23\"" +
            "                     EXAM_DATE_TIME=\"2016-08-04 23:23:23\" REPORT_DATE_TIME=\"2016-08-04 23:23:23\" REQ_DEPT=\"014992\"" +
            "                     REQ_PHYSICIAN=\"docTest\" DESCRIPTION=\"just for test\" CLIN_DIAG=\"just for test\"" +
            "                     IMPRESSION=\"just for test\" EXAM_ITEM=\"肺部\" TOTAL_COUNT=\"1\" PAGE_COUNT=\"1\"/>" +
            "            <DataRow REPORT_NO=\"04593\" EXAM_CLASS=\"肺部CT\" REQ_DATE_TIME=\"2016-08-04 09:23:23\"" +
            "                     EXAM_DATE_TIME=\"2016-08-04 09:23:23\" REPORT_DATE_TIME=\"2016-08-04 09:23:23\" REQ_DEPT=\"014992\"" +
            "                     REQ_PHYSICIAN=\"docTest\" DESCRIPTION=\"just for test\" CLIN_DIAG=\"just for test\"" +
            "                     IMPRESSION=\"just for test\" EXAM_ITEM=\"肺部\" TOTAL_COUNT=\"2\" PAGE_COUNT=\"2\"/>" +
            "            <DataRow REPORT_NO=\"04594\" EXAM_CLASS=\"肺部CT\" REQ_DATE_TIME=\"2016-08-04 18:23:23\"" +
            "                     EXAM_DATE_TIME=\"2016-08-04 18:23:23\" REPORT_DATE_TIME=\"2016-08-04 18:23:23\" REQ_DEPT=\"014992\"" +
            "                     REQ_PHYSICIAN=\"docTest\" DESCRIPTION=\"just for test\" CLIN_DIAG=\"just for test\"" +
            "                     IMPRESSION=\"just for test\" EXAM_ITEM=\"肺部\" TOTAL_COUNT=\"3\" PAGE_COUNT=\"3\"/>" +
            "        </DataNode1>" +
            "    </ReturnData>" +
            "    <OperateInfo>" +
            "        <Info METHOD=\"getExam\" OPT_ID=\"10000000\" OPT_NAME=\"test\" OPT_IP=\"localhost\" OPT_DATE=\"2016-08-04\"" +
            "              GUID=\"01220123\" TOKEN=\"a5jfid-123fdf-123fdf-231df\"/>" +
            "    </OperateInfo>" +
            "    <Result>" +
            "        <Info EXECUTE_FLAG=\"0\" EXECUTE_MESSAGE=\"\" ACCOUNT=\"2016-08-04\"/>" +
            "    </Result>" +
            "</BITCRoot>";
}
