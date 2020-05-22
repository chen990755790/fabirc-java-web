package com.ideal.blockchain.enums;

public enum BlockBusinessTypeEnum {

    FACTORING("01", "����"),

    TRANSFER("02","ת��"),

    ENTERPRISE("03","��ҵ��Ϣ");

    private String code;
    private String desc;

    BlockBusinessTypeEnum(String code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static BlockBusinessTypeEnum getResponseCodeEnum(String value) {
        if (value != null) {
            for (BlockBusinessTypeEnum nameEnum : values()) {
                if (nameEnum.getCode().equals(value)) {
                    return nameEnum;
                }
            }
        }
        return null;
    }

    public static boolean isResponseCodeEnum(String value) {
        if (value != null) {
            for (BlockBusinessTypeEnum nameEnum : values()) {
                if (nameEnum.getCode().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }


}
