package com.ideal.blockchain.entity.saas;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(description = "PD_RECEIVABLE_REQ")
@Entity
@Table(name = "PD_RECEIVABLE_REQ")
public class Receivable {

    private static final String OBJECT_TYPE_NAME="receivable";
    @Transient
    private  String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "Ӧ���˿������Ų���Ϊ��")
    @Id
    @Column(name="RECEIVABLE_REQUEST_ID")
    private String receivableRequestId;

    @NotBlank(message = "������Ų���Ϊ��")
    @Column(name="CHAIN_NO")
    private String chainNo;
    @ApiModelProperty(value = "�������")
    @Column(name="BLANK_NOTE_NO")
    private String blankNoteNo;
    @Column(name="BLANK_NOTE_TYPE")
    private String blankNoteType;
    @ApiModelProperty(value = "״̬")
    private String status;
    @Column(name="PROMISE_PAY_REVIEW_STATUS")
    @ApiModelProperty(value ="��ŵ������ҵ���״̬")
    private String promisePayReviewStatus;
    @ApiModelProperty(value ="ƽ̨���״̬")
    @Column(name="PLATFORM_REVIEW_STATUS")
    private String platformReviewStatus;
    @ApiModelProperty(value ="���������״̬")
    @Column(name="FACTOR_REVIEW_STATUS")
    private String factorReviewStatus;
    @ApiModelProperty(value ="�ſ���ҵ���״̬")
    @Column(name="LOAN_ENTERPRISE_REVIEW_STATUS")
    private String loanEnterpriseReviewStatus;
    @ApiModelProperty(value ="���")
    private BigDecimal amount;
    @ApiModelProperty(value ="ʣ����")
    @Column(name="REMAIN_AMOUNT")
    private BigDecimal remainAmount;
    @ApiModelProperty(value ="��������/��ŵ��������")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="EXPIRE_DATE")
    private Date expireDate;
    @ApiModelProperty(value ="ǩ����ҵ����")
    @Column(name="ISSUE_ENTERPRISE_NAME")
    private String issueEnterpriseName;
    @ApiModelProperty(value ="ǩ����ҵId")
    @Column(name="ISSUE_ENTERPRISE_ID")
    private String issueEnterpriseId;
    @ApiModelProperty(value ="��ŵ������ҵ����")
    @Column(name="COMMITMENT_PAY_ENTERPRISE_NAME")
    private String commitmentPayEnterpriseName;
    @ApiModelProperty(value ="��ŵ������ҵId")
    @Column(name="COMMITMENT_PAY_ENTERPRISE_ID")
    private String commitmentPayEnterpriseId;
    @ApiModelProperty(value ="�Ƿ��е���")
    @Column(name="IS_ENSURE")
    private String isEnsure;
    @Column(name="ENSURE_ENTERPRISE_NAME")
    @ApiModelProperty(value ="������ҵ����")
    private String ensureEnterpriseName;
    @ApiModelProperty(value ="������ҵId")
    @Column(name="ENSURE_ENTERPRISE_ID")
    private String ensureEnterpriseId;
    @ApiModelProperty(value ="�������ڻ�������")
    @Column(name="FINANCIAL_ORGANS_NAME")
    private String financialOrgansName;
    @ApiModelProperty(value ="�������ڻ���Id")
    @Column(name="FINANCIAL_ORGANS_ID")
    private String financialOrgansId;
    @ApiModelProperty(value ="����������ҵ����")
    @Column(name="HOLD_ENTERPRISE_NAME")
    private String holdEnterpriseName;
    @ApiModelProperty(value ="����������ҵId")
    @Column(name="HOLD_ENTERPRISE_ID")
    private String holdEnterpriseId;
    @ApiModelProperty(value ="��һ�ְ������")
    @Column(name="LAST_BLANK_NOTE_NO")
    private String lastBlankNoteNo;
    @ApiModelProperty(value ="��һ�ְ�����ţ������@ƴ�ӣ�")
    @Column(name="NEXT_BLANK_NOTE_NO")
    private String nextBlankNoteNo;
    @ApiModelProperty(value ="�Ƿ��������")
    @Column(name="IS_CLEAR")
    private String isClear;
    @ApiModelProperty(value ="��ע/ժҪ3")
    @Column(name="REMARK3")
    private String remark3;
    @ApiModelProperty(value ="��ע/ժҪ2")
    @Column(name="REMARK2")
    private String remark2;
    @ApiModelProperty(value ="��ע/ժҪ1")
    @Column(name="REMARK")
    private String remark;
    @ApiModelProperty(value ="����ʱ��")
    @Column(name="CREATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    @Column(name="LAST_UPDATE_TIME")
    @ApiModelProperty(value ="������ʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastUpdateTime;
    @ApiModelProperty(value ="�����������ݵ��û�id")
    @Column(name="ADD_USER_ID")
    private String addUserId;
    @ApiModelProperty(value ="ƽ̨��Ʒ���")
    @Column(name="PRODUCT_CODE")
    private String productCode;
    @ApiModelProperty(value ="ǩ����ҵ����")
    @Column(name="ACCEPT_ENTERPRISE_NAME")
    private String acceptEnterpriseName;
    @ApiModelProperty(value ="ǩ����ҵId")
    @Column(name="ACCEPT_ENTERPRISE_ID")
    private String acceptEnterpriseId;
    @ApiModelProperty(value ="������ת�����״̬")
    @Column(name="FACTOR_TRANSFER_STATUS")
    private String factorTransferStatus;
    @ApiModelProperty(value ="���׶�����ҵID")
    @Column(name="COUNTERPARTY_ENTERPRISE_ID")
    private String counterpartyEnterpriseId;
    @ApiModelProperty(value ="���׶�����ҵ����")
    @Column(name="COUNTERPARTY_ENTERPRISE_NAME")
    private String counterpartyEnterpriseName;
    @Column(name="PLATFORM_FIRST_REVIEWOR")
    @ApiModelProperty(value ="ƽ̨���������")
    private String platformFirstReviewor;
    @ApiModelProperty(value ="ƽ̨���������")
    @Column(name="PLATFORM_SECOND_REVIEWOR")
    private String platformSecondReviewor;
    @ApiModelProperty(value ="�����̳��������")
    @Column(name="FACTOR_FIRST_REVIEWOR")
    private String factorFirstReviewor;
    @ApiModelProperty(value ="�����̸��������")
    @Column(name="FACTOR_SECOND_REVIEWOR")
    private String factorSecondReviewor;
    @Column(name="SUBMIT_TIME")
    @ApiModelProperty(value ="�ύʱ��")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date submitTime;
}
