package com.ideal.blockchain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Enterprise {
    private static final String OBJECT_TYPE_NAME="enterprise";

    private static final String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "��˾��Ų���Ϊ��")
    private String companyId;

    @NotBlank(message = "ͳһ������ô���/Ӫҵִ�ղ���Ϊ��")
    private String socialCreditCode;

    @NotBlank(message = "��ҵ���Ͳ���Ϊ��")
    private String industryType;

    @NotBlank(message = "��˾���Ʋ���Ϊ��")
    private String companyName;

    @NotBlank(message = "��˾ע���ʱ�����Ϊ��")
    private String companyRegisterCapital;

    @NotBlank(message = "��˾ע��Ų���Ϊ��")
    private String companyRegisterNo;

    @NotBlank(message = "�Ǽǻ��ز���Ϊ��")
    private String belongOrg;

    @NotBlank(message = "��˾״̬����Ϊ��")
    private String companyStatus;

    @NotBlank(message = "��˾ע���ַ����Ϊ��")
    private String companyRegisterAddress;

    @NotBlank(message = "Ӫҵ��ʼ���ڲ���Ϊ��")
    private Date openStartDate;

    @NotBlank(message = "Ӫҵ�������ڲ���Ϊ��")
    private Date openEndDate;

    @NotBlank(message = "�������ڲ���Ϊ��")
    private Date startDate;

    @NotBlank(message = "�������ڲ���Ϊ��")
    private Date endDate;

    @NotBlank(message = "�������ڲ���Ϊ��")
    private Date checkDate;

    @NotBlank(message = "��ҵ�����ʱ�䲻��Ϊ��")
    private Date nameChangeDate;

    @NotBlank(message = "������Ϣ����ʱ�䲻��Ϊ��")
    private Date businessInfoUpdateDate;

    @NotBlank(message = "����������Ϊ��")
    private String originalname;

    @NotBlank(message = "�Ƿ����в���Ϊ��")
    private String isOnStock;

    @NotBlank(message = "�������Ͳ���Ϊ��")
    private String stockType;

    @NotBlank(message = "���й�˾���벻��Ϊ��")
    private String stockNumber;

    @NotBlank(message = "��֯�������벻��Ϊ��")
    private String orgNo;

    @NotBlank(message = "��ҵ����/��˾���ʲ���Ϊ��")
    private String econKing;

    @NotBlank(message = "��Ӫ��Χ����Ϊ��")
    private String companyBusinessScope;

    @NotBlank(message = "ע��ʡ�ݲ���Ϊ��")
    private String province;

    @NotBlank(message = "��˾�绰����Ϊ��")
    private String companyTelephone;

    @NotBlank(message = "��˾���治��Ϊ��")
    private String companyFax;

    @NotBlank(message = "��ע����Ϊ��")
    private String remark;

    @NotBlank(message = "����ʱ�䲻��Ϊ��")
    private Date createTime;

    @NotBlank(message = "����޸�ʱ�䲻��Ϊ��")
    private Date lastUpdateTime;

    @NotBlank(message = "��˾ǩ�´���״̬����Ϊ��")
    private String companySignStatus;

    @NotBlank(message = "��˾LOGO����Ϊ��")
    private String companyLogo;

    @NotBlank(message = "��˾�ʱ಻��Ϊ��")
    private String companyPostcode;

    @NotBlank(message = "����ǩ��ʱ�䲻��Ϊ��")
    private Date electronicSignTime;

    @NotBlank(message = "��˾ICON����Ϊ��")
    private String companyIcon;

    @NotBlank(message = "ʵ���ʱ�����Ϊ��")
    private BigDecimal issuedCapit;

    @NotBlank(message = "�ʱ����ֲ���Ϊ��")
    private String capitCurrency;

    @NotBlank(message = "�Ƿ���֤��һ����Ϊ��")
    private String isCertificateMerge;

    @NotBlank(message = "˰��Ǽ�֤�Ų���Ϊ��")
    private String taxRegistrationNo;

    @NotBlank(message = "ע����в���Ϊ��")
    private String city;

    @NotBlank(message = "�Ƿ�����ʹ�õ���ǩ�²���Ϊ��")
    private String allowSign;

    @NotBlank(message = "ͳһ������ô���/Ӫҵִ�պź�׼���ڲ���Ϊ��")
    private Date expiryDateSocialCreditCode;

    @NotBlank(message = "��֯��������֤�����ղ���Ϊ��")
    private Date expiryDateOrgNo;

    @NotBlank(message = "˰��Ǽ�֤�����ղ���Ϊ��")
    private Date expiryDateTaxRegistration;

    @NotBlank(message = "��ҵ���Ͳ���Ϊ��")
    private String enterpriseType;

    @NotBlank(message = "��˾���䲻��Ϊ��")
    private String companyEmail;

    @NotBlank(message = "��ҵ״̬����Ϊ��")
    private String status;

    @NotBlank(message = "����״̬����Ϊ��")
    private String enableStatus;

    @NotBlank(message = "��˸�λ����Ϊ��")
    private String reviewStation;

    private String isPlatform;
}
