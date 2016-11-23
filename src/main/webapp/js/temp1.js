//挂号收费交易撤销
var nvl = globalChannelMap.get('nvl');
var convert2HisDate = globalChannelMap.get('convert2HisDate');//yyyyMMdd-->yyyy-MM-dd

var cardId = $('msgJson').args.ssCardNo;
var visitDateTime = $('msgJson').args.visitDateTime;

var tranNo = $('msgJson').args.visitId;//合同号

//var payType = $('msgJson').args.payType;//暂时先固定为1-- MONEY_TYPE

//医保就诊信息
var insuranceVisitInfo01 = $('msgJson').args.insuranceVisitInfo;

var insuranceVisitInfo = insuranceVisitInfo01.toString().split('|');  

var insuranceType=insuranceVisitInfo[0];
var payType=insuranceVisitInfo[1];
var mtType=insuranceVisitInfo[2];
var visitNo= insuranceVisitInfo[3];
var idNo=$('2_4_0').idNo;
var msg2xml = '<?xml version="1.0" encoding="UTF-8"?><BITCRoot>'
+ '<CommitData>'
+ '<Regist>'
+ '<DataRow PERSON_NO='+nvl(idNo)+' PATIENT_ID='+nvl($('msgJson').args.patientId)
+ ' VISIT_NO='+nvl(tranNo)+'  VISIT_DATE='+nvl(visitDateTime)+' APPOINT_ID="" TRAN_NO='+nvl(visitNo)+'/>'
+ '</Regist>'
+ '<Bill><DataRow RCPT_NO='+nvl($('msgJson').args.insurancePrePayNo)+' TYPE="02" INSUR_LIMITS="1" /></Bill>'
+ '<Insurance>'
+ '<DataRow INSUR_NO='+nvl($('msgJson').args.ssCardNo)
    +' INSUR_PWD="" INSUR_VISIT_ID="" INSURANCE_TYPE=' +nvl(insuranceType)
    +' PAY_TYPE='+nvl(payType)
    +' MT_TYPE='+nvl(mtType)
    +' INSUR_PAY='+nvl($('msgJson').args.fundPay)
    +' ACCOUNT_PAY =' +nvl($('msgJson').args.accountPay)
    +' OWN_PAY='+nvl($('msgJson').args.fundPay)+' />'
+ '</Insurance>'
+ '</CommitData>'
+ '<ReturnData />'
+ '<ClientInfo>'
+ '<Info METHOD="TranConfirm"  OPT_ID="AB9999" OPT_NAME="" OPT_IP="" OPT_DATE="" OPT_GUID="" TOKEN="" OPT_ACCT="" />'
+ '</ClientInfo>'
+ '<ServerInfo><Info DEV_ID="000015" DEV_IP="" DEV_DATE="" DEV_GUID="" DEV_ACCT=""/></ServerInfo>'
+ '<Result><Info EXECUTE_STATUS="0" EXECUTE_MESSAGE=""/></Result>'
+ '</BITCRoot>';

connectorMap.put('msg2xml',msg2xml);