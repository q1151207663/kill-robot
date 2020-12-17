package pers.tz.scrawl.constants;

/**
 * @Author twz
 * @Date 2020-12-12
 * @Desc TODO
 */
public enum RequestHeaderType {
    ACCEPT("accept"),
    REFERER("referer"),
    SEC_FETCH_DEST("sec_fetch_dest"),
    SEC_FETCH_MODE("sec_fetch_mode"),
    SEC_FETCH_SITE("sec_fetch_site"),
    X_REQUESTED_WITH("x_requested_with");

    public final String value;

    RequestHeaderType(String value) {
        this.value = value;
    }
}
