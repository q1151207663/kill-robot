package pers.tz.scrawl.exception.handler;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pers.tz.scrawl.constants.ApiCode;
import pers.tz.scrawl.vo.ApiResult;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 全局异常捕捉器，捕获
 */
@ControllerAdvice
@Slf4j
@AllArgsConstructor
public class GlobalControllerAdvice {

    private OutputStream persistentLogOutputStream;

    /**
     * 捕获需要存储到日志文件的异常
     *
     * @param e
     */
    @ExceptionHandler(value = Exception.class)
    public ApiResult handler(Exception e) {
        try {
            log.error("global controller advice catch exception", e.getMessage(), e);
            persistentLogOutputStream.write(e.getMessage().getBytes(StandardCharsets.UTF_8));
            return ApiResult.fail(ApiCode.FAILURE.code, e.getMessage());
        } catch (IOException e1) {
            log.error("persistent log failure: {}", e1.getMessage(), e);
            return ApiResult.fail(ApiCode.PERSISTENCE_FAILURE.code, e1.getMessage());
            // todo 发送邮件给开发者
        }
    }
}
