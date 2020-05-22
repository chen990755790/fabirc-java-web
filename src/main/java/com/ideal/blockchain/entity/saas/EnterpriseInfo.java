package com.ideal.blockchain.entity.saas;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "AC_COMPANY_INFO")
@Entity
@Table(name = "AC_COMPANY_INFO")
public class EnterpriseInfo {
    private static final String OBJECT_TYPE_NAME = "enterpriseInfo";
    @Transient
    private String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "��˾��Ų���Ϊ��")
    @Id
    @Column(name = "COMPANY_ID")
    private String companyId;

    @NotBlank(message = "ͳһ������ô���/Ӫҵִ�ղ���Ϊ��")
    @Column(name = "SOCIAL_CREDIT_CODE")
    private String socialCreditCode;

    @NotBlank(message = "��ҵ���Ͳ���Ϊ��")
    @Column(name = "INDUSTRY_TYPE")
    private String industryType;

    @NotBlank(message = "��˾���Ʋ���Ϊ��")
    @Column(name="COMPANY_NAME")
    private String companyName;

    @NotBlank(message = "��˾ע���ʱ�����Ϊ��")
    @Column(name="COMPANY_REGISTER_CAPITAL")
    private String companyRegisterCapital;

    @NotBlank(message = "��˾ע��Ų���Ϊ��")
    @Column(name="COMPANY_REGISTER_NO")
    private String companyRegisterNo;

    @NotBlank(message = "�Ǽǻ��ز���Ϊ��")
    @Column(name="BELONG_ORG")
    private String belongOrg;

    @NotBlank(message = "��˾״̬����Ϊ��")
    @Column(name = "COMPANY_STATUS")
    private String companyStatus;

    @NotBlank(message = "��˾ע���ַ����Ϊ��")
    @Column(name="COMPANY_REGISTER_ADDRESS")
    private String companyRegisterAddress;

    @NotBlank(message = "Ӫҵ��ʼ���ڲ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "OPEN_START_DATE")
    private Date openStartDate;

    @NotBlank(message = "Ӫҵ�������ڲ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "OPEN_END_DATE")
    private Date openEndDate;

    @NotBlank(message = "�������ڲ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "START_DATE")
    private Date startDate;

    @NotBlank(message = "�������ڲ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "END_DATE")
    private Date endDate;

    @NotBlank(message = "�������ڲ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="CHECK_DATE")
    private Date checkDate;

    @NotBlank(message = "��ҵ�����ʱ�䲻��Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "NAME_CHANGE_DATE")
    private Date nameChangeDate;

    @NotBlank(message = "������Ϣ����ʱ�䲻��Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "BUSINESS_INFO_UPDATE_DATE")
    private Date businessInfoUpdateDate;

    @NotBlank(message = "����������Ϊ��")
    private String originalname;

    @NotBlank(message = "�Ƿ����в���Ϊ��")
    @Column(name = "IS_ON_STOCK")
    private String isOnStock;

    @NotBlank(message = "�������Ͳ���Ϊ��")
    @Column(name = "STOCK_TYPE")
    private String stockType;

    @NotBlank(message = "���й�˾���벻��Ϊ��")
    @Column(name = "STOCK_NUMBER")
    private String stockNumber;

    @NotBlank(message = "��֯�������벻��Ϊ��")
    @Column(name = "ORG_NO")
    private String orgNo;

    @NotBlank(message = "��ҵ����/��˾���ʲ���Ϊ��")
    @Column(name = "ECON_KING")
    private String econKing;

    @NotBlank(message = "��Ӫ��Χ����Ϊ��")
    @Column(name="COMPANY_BUSINESS_SCOPE")
    private String companyBusinessScope;

    @NotBlank(message = "ע��ʡ�ݲ���Ϊ��")
    private String province;

    @NotBlank(message = "��˾�绰����Ϊ��")
    @Column(name = "COMPANY_TELEPHONE")
    private String companyTelephone;

    @NotBlank(message = "��˾���治��Ϊ��")
    @Column(name="COMPANY_FAX")
    private String companyFax;

    @NotBlank(message = "��ע����Ϊ��")
    private String remark;

    @NotBlank(message = "����ʱ�䲻��Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @NotBlank(message = "����޸�ʱ�䲻��Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @NotBlank(message = "��˾ǩ�´���״̬����Ϊ��")
    @Column(name="COMPANY_SIGN_STATUS")
    private String companySignStatus;

    @NotBlank(message = "��˾LOGO����Ϊ��")
    @Column(name="COMPANY_LOGO")
    private String companyLogo;

    @NotBlank(message = "��˾�ʱ಻��Ϊ��")
    @Column(name="COMPANY_POSTCODE")
    private String companyPostcode;

    @NotBlank(message = "����ǩ��ʱ�䲻��Ϊ��")
    @Column(name = "ELECTRONIC_SIGN_TIME")
    private Date electronicSignTime;

    @NotBlank(message = "��˾ICON����Ϊ��")
    @Column(name="COMPANY_ICON")
    private String companyIcon;

    @NotBlank(message = "ʵ���ʱ�����Ϊ��")
    @Column(name = "ISSUED_CAPIT")
    private BigDecimal issuedCapit;

    @NotBlank(message = "�ʱ����ֲ���Ϊ��")
    @Column(name="CAPIT_CURRENCY")
    private String capitCurrency;

    @NotBlank(message = "�Ƿ���֤��һ����Ϊ��")
    @Column(name = "IS_CERTIFICATE_MERGE")
    private String isCertificateMerge;

    @NotBlank(message = "˰��Ǽ�֤�Ų���Ϊ��")
    @Column(name = "TAX_REGISTRATION_NO")
    private String taxRegistrationNo;

    @NotBlank(message = "ע����в���Ϊ��")
    private String city;

    @NotBlank(message = "�Ƿ�����ʹ�õ���ǩ�²���Ϊ��")
    @Column(name="ALLOW_SIGN")
    private String allowSign;

    @NotBlank(message = "ͳһ������ô���/Ӫҵִ�պź�׼���ڲ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "EXPIRY_DATE_SOCIAL_CREDIT_CODE")
    private Date expiryDateSocialCreditCode;

    @NotBlank(message = "��֯��������֤�����ղ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "EXPIRY_DATE_ORG_NO")
    private Date expiryDateOrgNo;

    @NotBlank(message = "˰��Ǽ�֤�����ղ���Ϊ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "EXPIRY_DATE_TAX_REGISTRATION")
    private Date expiryDateTaxRegistration;

    @NotBlank(message = "��ҵ���Ͳ���Ϊ��")
    @Column(name = "ENTERPRISE_TYPE")
    private String enterpriseType;

    @NotBlank(message = "��˾���䲻��Ϊ��")
    @Column(name="COMPANY_EMAIL")
    private String companyEmail;

    @NotBlank(message = "��ҵ״̬����Ϊ��")
    private String status;

    @NotBlank(message = "����״̬����Ϊ��")
    @Column(name = "ENABLE_STATUS")
    private String enableStatus;

    @NotBlank(message = "��˸�λ����Ϊ��")
    @Column(name = "REVIEW_STATION")
    private String reviewStation;
    @Column(name = "IS_PLATFORM")
    private String isPlatform;
}
