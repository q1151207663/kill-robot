package pers.tz.robot.scrawl.service.pipeline;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.constants.BulletNameType;
import sun.misc.BASE64Encoder;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc TODO
 */
@Component
@AllArgsConstructor
public class LickDoggunPipeline implements Pipeline {

    private final BASE64Encoder encoder;
    private final BufferedWriter bwLockDogWriter;

    @SneakyThrows
    @Override
    public void process(ResultItems resultItems, Task task) {
        String bulletStr = resultItems.get(BulletNameType.LICKDOG_BULLET.value).toString() + "\n";
        final String encodeStr = encoder.encode(bulletStr.getBytes(StandardCharsets.UTF_8));
        bwLockDogWriter.write(encodeStr);
    }
}
