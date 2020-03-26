package com.ideal.blockchain.entity;

import com.ideal.blockchain.dto.request.UserDto;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class UserInfo extends UserDto {

    private static final String OBJECT_TYPE_NAME="userInfo";

    private static final String objectType = OBJECT_TYPE_NAME;

    @NotBlank(message = "�û���Ų���Ϊ��")
    private String userId;
    @NotBlank(message = "�û��ֻ����벻��Ϊ��")
    private String mobile;
    @NotBlank(message = "��½���벻��Ϊ��")
    private String loginPassword;
    @NotBlank(message = "��˾��Ų���Ϊ��")
    private String companyId;
    private Date loginLastTime;

    private Date loginPasswordErrorLastTime;

    private Long loginPasswordErrorTimes;

    private Date loginPasswordUpdateTime;
    @NotBlank(message = "�û�״̬����Ϊ��")
    private String status;

    private Date createTime;

    private Date lastUpdateTime;

    private Date lastLoginTime;

    private String isContact;
    @NotBlank(message = "�û�����")
    private String name;

}
