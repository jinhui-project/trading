package com.jinhui.zlrt.entity.dto;

import javax.validation.constraints.NotNull;

/**
 * 新增银行卡请求参数
 *
 * @autor wsc
 * @create 2018-01-30 9:48
 **/
public class AddBankCardRequest {

    //证联支付分配给商户的机构代码
    @NotNull(message = "证联支付分配给商户的机构代码不能为空")
    private String instuId;
    //商户的系统日期(YYYYMMDD)
    @NotNull(message = "商户的系统日期不能为空")
    private String fundDate;
    //商户的时间戳(HHMMSS)
    @NotNull(message = "商户的时间戳不能为空")
    private String fundTime;
    //商户系统流水号
    @NotNull(message = "商户系统流水号不能为空")
    private String fundSeqId;
    //客户类型
    @NotNull(message = "客户类型不能为空")
    private String custType;
    //用户在证联支付平台里的客户号
    @NotNull(message = "用户在证联支付平台里的客户号不能为空")
    private String userId;
    //客户的姓名
    @NotNull(message = "客户的姓名不能为空")
    private String userNameText;
    //证件类型
    @NotNull(message = "证件类型不能为空")
    private String certType;
    //证件号码
    @NotNull(message = "证件号码不能为空")
    private String certId;
    //银行代码
    private String bankCode;
    //省份代码
    private String bankProvinceCode;
    //地区代码
    private String bankRegionCode;
    //银行卡号
    @NotNull(message = "银行卡号不能为空")
    private String cardNo;
    //支付密码
    private String payPassWord;
    //客户手机号
    private String phoneNo;
    //手机验证码
    private String identifyingCode;
    //商户保留域
    private String resv;

    public String getInstuId() {
        return instuId;
    }

    public void setInstuId(String instuId) {
        this.instuId = instuId;
    }

    public String getFundDate() {
        return fundDate;
    }

    public void setFundDate(String fundDate) {
        this.fundDate = fundDate;
    }

    public String getFundTime() {
        return fundTime;
    }

    public void setFundTime(String fundTime) {
        this.fundTime = fundTime;
    }

    public String getFundSeqId() {
        return fundSeqId;
    }

    public void setFundSeqId(String fundSeqId) {
        this.fundSeqId = fundSeqId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNameText() {
        return userNameText;
    }

    public void setUserNameText(String userNameText) {
        this.userNameText = userNameText;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankProvinceCode() {
        return bankProvinceCode;
    }

    public void setBankProvinceCode(String bankProvinceCode) {
        this.bankProvinceCode = bankProvinceCode;
    }

    public String getBankRegionCode() {
        return bankRegionCode;
    }

    public void setBankRegionCode(String bankRegionCode) {
        this.bankRegionCode = bankRegionCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPayPassWord() {
        return payPassWord;
    }

    public void setPayPassWord(String payPassWord) {
        this.payPassWord = payPassWord;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getIdentifyingCode() {
        return identifyingCode;
    }

    public void setIdentifyingCode(String identifyingCode) {
        this.identifyingCode = identifyingCode;
    }

    public String getResv() {
        return resv;
    }

    public void setResv(String resv) {
        this.resv = resv;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }
}
