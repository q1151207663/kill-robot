package pers.tz.scrawl.vo;

import lombok.Data;
import pers.tz.scrawl.constants.ApiCode;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 统一响应VO
 */
@Data
public class ApiResult<Vo> {

    private int code = ApiCode.SUCCESS.code;
    private String msg;
    private Vo data;  // 数据包

    public static ApiResult ok() {
        return ok("success");
    }

    public static<Vo> ApiResult<Vo> ok(Vo vo) {
        ApiResult apiResult = init();
        apiResult.code = ApiCode.SUCCESS.code;
        apiResult.data = vo;
        return apiResult;
    }

    public static ApiResult fail(String msg) {
        ApiResult apiResult = init();
        apiResult.code = ApiCode.FAILURE.code;
        apiResult.msg = msg;
        return apiResult;
    }

    public static ApiResult fail(int code, String msg) {
        ApiResult apiResult = init();
        apiResult.code = code;
        apiResult.msg = msg;
        return apiResult;
    }

    private static ApiResult init() {
        return new ApiResult();
    }
}
