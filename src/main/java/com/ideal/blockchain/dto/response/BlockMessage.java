package com.ideal.blockchain.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BlockMessage implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(name = "�����")
    private long blockNumber;
    @ApiModelProperty(name = "��һ�������ϣ")
    private String previousHash;
    @ApiModelProperty(name = "��ǰ�����ϣ")
    private String dataHash;
    @ApiModelProperty(name = "ͨ������")
    private String channelId;
    @ApiModelProperty(name = "���˺����������")
    private int envelopeCount;
    @ApiModelProperty(name = "��������")
    private int transactionCount;
    @ApiModelProperty(name = "����Ԫ����")
    private String transActionsMetaData;
    @ApiModelProperty(name = "����id")
    private String txid;
}
