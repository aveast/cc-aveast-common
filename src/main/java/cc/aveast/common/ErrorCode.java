package cc.aveast.common;

public enum ErrorCode {

    SUCCESS   ( 0   , "成功"),
    FAIL      (-1   , "失败"),
    EXCEPTION (-2   , "异常"),


    PARAM_TYPE_ERROR (-101, "变量类型错误"),

    // -1000 : 序列化类
    VARIABLE_TYPE_NOT_SUPPROT  (-1001, "变量类型不支持"),

    // -1100 : 定长报文序列化


    ;

    private int code;

    private String desc;

    ErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean isIt(int code) {
        return this.code == code;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
