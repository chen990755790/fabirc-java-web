package com.ideal.blockchain.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InvoiceInfo {
    private static final String OBJECT_TYPE_NAME="enterprise_invoice";

    private static final String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "��˾��Ų���Ϊ��")
    private String companyId;

    @NotBlank(message = "��˾���Ʋ���Ϊ��")
    private String companyName;

    @NotBlank(message = "��˰��ʶ��Ų���Ϊ��")
    private String taxpayerIdentifyNo;

    @NotBlank(message = "��˾ע���ַ����Ϊ��")
    private String address;

    @NotBlank(message = "��˾�绰����Ϊ��")
    private String companyMobile;

    @NotBlank(message = "��˾������֧�в���Ϊ��")
    private String openAccountBankName;

    @NotBlank(message = "��˾�����˺Ų���Ϊ��")
    private String bankAccountNo;

    @NotBlank(message = "��Ʊ�ʼ��ռ������Ʋ���Ϊ��")
    private String addresseeName;

    @NotBlank(message = "��Ʊ�ʼ��ռ����ֻ��Ų���Ϊ��")
    private String addresseeMobile;

    @NotBlank(message = "��Ʊ�ʼ��ռ��˵�ַ����Ϊ��")
    private String addresseeAddress;

    private String remark;
}
