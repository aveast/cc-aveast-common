package cc.aveast.common;

public class SystemException extends RuntimeException {

    private static String TIP_HEAD = "系统处理出现异常";
    private int    code;
    private String desc;

    public SystemException() {
        super(TIP_HEAD);
        this.code = ErrorCode.EXCEPTION.getCode();
        this.desc = ErrorCode.EXCEPTION.getDesc();
    }

    public SystemException(String message) {
        super(TIP_HEAD + " - " + message);
        this.code = ErrorCode.FAIL.getCode();
        this.desc = message;
    }

    public SystemException(int code, String msg) {
        super(TIP_HEAD + " - " + code + ":" + msg);
        this.code = code;
        this.desc = msg;
    }

    public SystemException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getDesc());
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.desc;
    }
}
