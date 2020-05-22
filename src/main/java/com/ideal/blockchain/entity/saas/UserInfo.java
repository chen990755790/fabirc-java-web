package com.ideal.blockchain.entity.saas;

import com.ideal.blockchain.dto.request.UserDto;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@ApiModel(description = "AC_USER")
@Entity
@Table(name = "AC_USER")
public class UserInfo extends UserDto {

    private static final String OBJECT_TYPE_NAME = "userInfo";
    @Transient
    private String objectType = OBJECT_TYPE_NAME;
    @Id
    @Column(name="USER_ID")
    @NotBlank(message = "�û���Ų���Ϊ��")
    private String userId;
    @NotBlank(message = "�û��ֻ����벻��Ϊ��")
    private String mobile;
    @NotBlank(message = "��½���벻��Ϊ��")
    @Column(name="LOGIN_PASSWORD")
    private String loginPassword;
    @NotBlank(message = "��˾��Ų���Ϊ��")
    @Column(name="COMPANY_ID")
    private String companyId;
    @Column(name="LOGIN_LAST_TIME")
    private Date loginLastTime;
    @Column(name="LOGIN_PASSWORD_ERROR_LAST_TIME")
    private Date loginPasswordErrorLastTime;
    @Column(name="LOGIN_PASSWORD_ERROR_TIMES")
    private Long loginPasswordErrorTimes;
    @Column(name="LOGIN_PASSWORD_UPDATE_TIME")
    private Date loginPasswordUpdateTime;
    @Column(name="STATUS")
    @NotBlank(message = "�û�״̬����Ϊ��")
    private String status;
    @Column(name="CREATE_TIME")
    private Date createTime;
    @Column(name="LAST_UPDATE_TIME")
    private Date lastUpdateTime;
    @Column(name="LAST_LOGIN_TIME")
    private Date lastLoginTime;
    @Column(name="IS_CONTACT")
    private String isContact;
    @Column(name="NAME")
    @NotBlank(message = "�û�����")
    private String name;

}
