var msgXml2 = new XML(msg);
msgXml2 = new XML(msgXml2.toString());

var visitNoStr = $('VISIT_NO');
var insuranceVisitInfo = $('2_2_1').insuranceVisitInfo;
var PATIENT_ID = $('msgJson').args.patientId;

var status = Number(msgXml2['Result']['Info']['@EXECUTE_STATUS'].toString()) + 1;

var msgOutbyJson = {
    returnValue: status.toString(),
    memo: msgXml2['Result']['Info']['@EXECUTE_MESSAGE'].toString(),
    visitList: []
};

if (msgXml2['ReturnData']['Data']['DataRow'][0]) {

    var CLINIC_ID = msgXml2['ReturnData']['Data']['DataRow'][0]['@CLINIC_ID'].toString();

    var myDate0 = new Date();
    var myDate1 = myDate0.getFullYear() + '-' + (myDate0.getMonth() + 1) + '-' + myDate0.getDate();

    var visit = {
        "visitDateTime": myDate1,
        "visitType": "0",
        "hospitalCode": "121200004013544086",
        "hospitalName": "天津胸科医院",
        "deptCode": msgXml2['ReturnData']['Data']['DataRow'][0]['@ORDERED_BY'].toString(),
        "deptName": "",
        "doctorID": "",
        "doctorName": msgXml2['ReturnData']['Data']['DataRow'][0]['@ORDERED_DOCTOR'].toString(),
        "diagnosisCode": "",
        "diagnosisName": "",
        "diagnosisMemo": "",
        "visitId": visitNoStr + "",
        "insuranceVisitInfo": "",
        "billList": []
    }

    msgOutbyJson.visitList.push(visit);

    var itemNo = 0;
    var g = 0;
    var appNos = [];

    while (msgXml2['ReturnData']['Data']['DataRow'][g]) {
        var appNo = msgXml2['ReturnData']['Data']['DataRow'][g]['@APP_NO'].toString();
        var reqClassFirst = msgXml2['ReturnData']['Data']['DataRow'][g]['@REQ_CLASS'].toString();
        var reqCode = '';
        var isExist = false;
        if (appNos.length > 0) {
            for (var f = 0; f < appNos.length; f++) {
                if (appNos[f] == appNo) {
                    isExist = true;
                    break;
                }
            }
        }
        if (!isExist) {
            appNos.push(appNo);
            if (reqClassFirst == '处方') {
                reqCode = '1';
            } else if (reqClassFirst == '检验') {
                reqCode = '2';
            } else if (reqClassFirst == '检查') {
                reqCode = '3';
            }
            var itemBill = {
                hisBillID: appNo,
                billTypeCode: reqCode,
                billTypeName: reqClassFirst,
                billCost: '',
                billCharge: '',
                billItemList: []
            };
            msgOutbyJson.visitList[0].billList[itemNo].billItemList.push(itemBill);
            itemNo++;
        }
        g++;
    }

    var n = 0;
    var labDeptName = "";
    var examDeptName = "";

    while (msgXml2['ReturnData']['Data']['DataRow'][n]) {

        var tempCost = Number(msgXml2['ReturnData']['Data']['DataRow'][n]['@COSTS'].toString());
        var tempCharge = Number(msgXml2['ReturnData']['Data']['DataRow'][n]['@CHARGES'].toString());

        var billItem = {
            billItemNo: msgXml2['ReturnData']['Data']['DataRow'][n]['@CLINIC_COST_ITEM_NO'].toString(),
            billItemTypeCode: '',
            billItemTypeName: '',
            hisBillItemCode: msgXml2['ReturnData']['Data']['DataRow'][n]['@ITEM_CODE'].toString(),
            hisBillItemName: msgXml2['ReturnData']['Data']['DataRow'][n]['@ITEM_NAME'].toString(),
            insuranceBillItemCode: '',
            insuranceBillItemName: '',
            compoundFlag: '',
            spec: msgXml2['ReturnData']['Data']['DataRow'][n]['@ITEM_SPEC'].toString(),
            drugForm: '',
            amount: msgXml2['ReturnData']['Data']['DataRow'][n]['@AMOUNT'].toString(),
            units: msgXml2['ReturnData']['Data']['DataRow'][n]['@UNITS'].toString(),
            dose: '',
            unitPrice: '',
            cost: tempCost,
            charge: tempCharge,
            selfPayA: '',
            selfPayB: '',
            selfPayRate: '',
            administration: msgXml2['ReturnData']['Data']['DataRow'][n]['@ADMIN'].toString(),
            dosage: '',
            frequency: '',
            requestDeptCode: msgXml2['ReturnData']['Data']['DataRow'][n]['@ORDERED_BY'].toString(),
            requestDeptName: '',
            requestDoctorID: '',
            requestDoctorName: msgXml2['ReturnData']['Data']['DataRow'][n]['@ORDERED_DOCTOR'].toString(),
            performedDeptCode: msgXml2['ReturnData']['Data']['DataRow'][n]['@PERFORMED_BY'].toString(),
            performedDeptName: msgXml2['ReturnData']['Data']['DataRow'][n]['@DEPT_NAME'].toString()
        };

        for (var d = 0; d < appNos.length; d++) {
            var appNoSecond = msgXml2['ReturnData']['Data']['DataRow'][g]['@APP_NO'].toString();
            if (appNos[d] == appNoSecond) {
                msgOutbyJson.visitList[0].billList[d].billItemList.push(billItem);
                msgOutbyJson.visitList[0].billList[d].cost = Number(msgOutbyJson.visitList[0].billList[d].cost) + tempCost.toFixed(2) + '';
                msgOutbyJson.visitList[0].billList[d].charge = Number(msgOutbyJson.visitList[0].billList[d].charge) + tempCharge.toFixed(2) + '';
            }
        }

        var perDeptName = msgXml2['ReturnData']['Data']['DataRow'][n]['@DEPT_NAME'].toString();
        var reqClass = msgXml2['ReturnData']['Data']['DataRow'][n]['@REQ_CLASS'].toString();
        if (reqClass == '检验') {
            if (labDeptName != perDeptName && labDeptName == "") {
                labDeptName = perDeptName;
            } else if (labDeptName != perDeptName && labDeptName != "") {
                labDeptName = labDeptName + ";" + perDeptName;
            }
        } else if (reqClass == '检查') {
            if (examDeptName != perDeptName && examDeptName == "") {
                examDeptName = perDeptName;
            } else if (examDeptName != perDeptName && examDeptName != "") {
                examDeptName = examDeptName + ";" + perDeptName;
            }
        }
        n++;
    }

    msgOutbyJson.visitList[0].insuranceVisitInfo = insuranceVisitInfo + "|" + labDeptName + "|" + examDeptName + "|" + PATIENT_ID;

}

channelMap.put('2_2_2', msgOutbyJson);