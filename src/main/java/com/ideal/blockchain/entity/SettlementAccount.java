package com.ideal.blockchain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class SettlementAccount {
    private static final String OBJECT_TYPE_NAME="enterprise_account";

    private String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "�����˻���Ų���Ϊ��")
    private String bankAccountId;
    @NotBlank(message = "��˾��Ų���Ϊ��")
    private String companyId;
    @NotBlank(message = "��˾���Ʋ���Ϊ��")
    private String companyName;
    @NotBlank(message = "�����˺Ų���Ϊ��")
    private String bankAccountNo;
    @NotBlank(message = "�����˻����Ʋ���Ϊ��")
    private String bankAccountName;

    private String bankName;

    @NotBlank(message = "������֧�в���Ϊ��")
    private String bankBranchName;

    private String bankProvince;

    private String bankCity;

    private String bankCode;

    private String bankCnapsCode;

    private String bankUsage;
    @NotBlank(message = "�����˻�״̬����Ϊ��")
    private String status;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastUpdateTime;

    private String bankAccountCertificate;
}
