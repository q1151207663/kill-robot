package pers.tz.scrawl.constants;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc api code
 */
public enum ApiCode {

    SUCCESS(0),  // 成功
    FAILURE(-1),  // 失败
    PERSISTENCE_FAILURE(-2);  // 持久化异常日志失败

    public final int code;

    ApiCode(int code) {
        this.code = code;
    }
}
