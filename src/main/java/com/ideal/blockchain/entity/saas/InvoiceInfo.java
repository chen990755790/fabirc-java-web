package com.ideal.blockchain.entity.saas;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@ApiModel(description = "AC_INVOICE_INFO")
@Entity
@Table(name = "AC_INVOICE_INFO")
public class InvoiceInfo {
    private static final String OBJECT_TYPE_NAME = "enterprise_invoice";
    @Transient
    private String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "��˾��Ų���Ϊ��")
    @Column(name="COMPANY_ID")
    @Id
    private String companyId;

    @NotBlank(message = "��˾���Ʋ���Ϊ��")
    @Column(name="COMPANY_NAME")
    private String companyName;
    @Column(name="TAXPAYER_IDENTIFY_NO")
    @NotBlank(message = "��˰��ʶ��Ų���Ϊ��")
    private String taxpayerIdentifyNo;

    @NotBlank(message = "��˾ע���ַ����Ϊ��")
    private String address;
    @Column(name="COMPANY_MOBILE")
    @NotBlank(message = "��˾�绰����Ϊ��")
    private String companyMobile;
    @Column(name="OPEN_ACCOUNT_BANK_NAME")
    @NotBlank(message = "��˾������֧�в���Ϊ��")
    private String openAccountBankName;
    @Column(name="BANK_ACCOUNT_NO")
    @NotBlank(message = "��˾�����˺Ų���Ϊ��")
    private String bankAccountNo;
    @Column(name="ADDRESSEE_NAME")
    @NotBlank(message = "��Ʊ�ʼ��ռ������Ʋ���Ϊ��")
    private String addresseeName;
    @Column(name="ADDRESSEE_MOBILE")
    @NotBlank(message = "��Ʊ�ʼ��ռ����ֻ��Ų���Ϊ��")
    private String addresseeMobile;
    @Column(name="ADDRESSEE_ADDRESS")
    @NotBlank(message = "��Ʊ�ʼ��ռ��˵�ַ����Ϊ��")
    private String addresseeAddress;

    private String remark;
}
