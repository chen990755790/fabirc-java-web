package com.ideal.blockchain.enums;


public enum ResponseCodeEnum {

    SUCCESS("000000", "������ɹ�"),

    PROCESSING("0000001", "����������"),

    PROCESS_ERROR("000002", "��������ʧ��"),

    PROCESS_CANCEL("000003", "����������"),

    PROCESS_SUCCESS("000004", "��������ɹ�"),

    MSG_PARSING_FAILURE("000005", "���Ľ���ʧ��"),

    COMPRESS_FAILURE("000006", "����ѹ������ʧ��"),

    UNCOMPRESS_FAILURE("000007", "���Ľ�ѹ������ʧ��"),

    INVALID_PARAM("000008", "��Ч���������"),

    VALID_TARGETSYSCODE_FAILURE("000009", "Ŀ��ϵͳУ��ʧ��"),

    VALID_DATAMSGSIZE_FAILURE("000010", "���������ݳ���У��ʧ��"),

    UNDEFINED_SERVICE("000011", "����������δ����"),

    PARAM_VRFY_FAIL("000012", "����У��δͨ��"),

    ENCRYP_MACHINE_HANDLE_FAILURE("000013", "���ܻ�����ʧ��"),

    BUSI_ERROR("000014", "�ڲ������쳣"),

    SIGN_VERIFY_FAILURE("000015", "��֤ǩ��ʧ��"),

    IP_VERIFY_FAILURE("000016", "IP��ַ��֤ʧ��"),

    COLLECTION_NOT_EXISTS("000017", "�������Ʋ�����"),

    FAILURE("999996", "ʧ��"),

    REMOTE_CALL_FAILURE("999997", "Զ�̵���ʧ��"),

    DB_ERROR("999998", "���ݿ�ִ��ʧ��"),

    UNDEFINED_ERROR("999999", "������ʧ��"),


    ;
    private String code;
    private String desc;

    ResponseCodeEnum(String code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ResponseCodeEnum getResponseCodeEnum(String value) {
        if (value != null) {
            for (ResponseCodeEnum nameEnum : values()) {
                if (nameEnum.getCode().equals(value)) {
                    return nameEnum;
                }
            }
        }
        return null;
    }

    public static boolean isResponseCodeEnum(String value) {
        if (value != null) {
            for (ResponseCodeEnum nameEnum : values()) {
                if (nameEnum.getCode().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }


}
