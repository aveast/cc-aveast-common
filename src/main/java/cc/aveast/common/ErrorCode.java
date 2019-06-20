package cc.aveast.common;

public enum ErrorCode {

    SUCCESS   ( 0   , "成功"),
    FAIL      (-1   , "失败"),
    EXCEPTION (-2   , "异常"),




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
