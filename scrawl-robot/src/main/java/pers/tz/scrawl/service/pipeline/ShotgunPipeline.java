package pers.tz.scrawl.service.pipeline;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pers.tz.scrawl.constants.BulletNameType;
import sun.misc.BASE64Encoder;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;

/**
 * @Author twz
 * @Date 2020-12-12
 * @Desc base64编码方式保存霰弹枪弹匣
 */
@Slf4j
@AllArgsConstructor
@Component
public class ShotgunPipeline implements Pipeline {

    private final BASE64Encoder encoder;
    private final BufferedWriter bwShotgunWriter;

    @SneakyThrows
    @Override
    public void process(ResultItems resultItems, Task task) {
        String bulletStr = resultItems.get(BulletNameType.SHOTGUN_BULLET.value).toString() + "\n";
        final String encodeStr = encoder.encode(bulletStr.getBytes(StandardCharsets.UTF_8));
        bwShotgunWriter.write(encodeStr);
    }
}
