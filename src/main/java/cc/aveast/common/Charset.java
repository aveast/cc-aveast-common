package cc.aveast.common;

public enum Charset {

    UTF_8  ("utf-8", "utf-8"),
    UTF8   ("utf8" , "utf-8"),
    GBK    ("gbk"  , "gbk"  ),
    ;

    private String code;

    private String standardCode;

    Charset(String code, String standardCode) {
        this.code = code;
        this.standardCode = standardCode;
    }

    public String getStandardCode() {
        return standardCode;
    }
}
