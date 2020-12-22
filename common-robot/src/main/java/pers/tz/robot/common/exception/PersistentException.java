package pers.tz.robot.common.exception;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 需要持久化的异常
 */
public class PersistentException extends RuntimeException {

    public PersistentException(String massage) {
        super(massage);
    }
}
