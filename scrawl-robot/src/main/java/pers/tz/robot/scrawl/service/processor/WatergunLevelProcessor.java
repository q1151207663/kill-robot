package pers.tz.robot.scrawl.service.processor;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.config.MagazineScrawlConfig;
import pers.tz.robot.scrawl.constants.BulletNameType;
import pers.tz.robot.scrawl.service.pipeline.WatergunPipeline;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 水枪弹匣更新装置
 */
@Component
@AllArgsConstructor
public class WatergunLevelProcessor implements PageProcessor {

    private MagazineScrawlConfig magazineScrawlConfig;
    private WatergunPipeline watergunPipeline;
    private Site magazineSite;

    @Override
    public void process(Page page) {
        page.putField(BulletNameType.WATERGUN_BULLET.value, page.getRawText());
    }

    @Override
    public Site getSite() {
        return magazineSite;
    }

    public void start() {
        Spider.create(this)
                .addUrl(magazineScrawlConfig.getWaterGunUrl())  // 地址
                .addPipeline(watergunPipeline)
                .thread(magazineScrawlConfig.getThreadCount()) // 线程数
                .run();
    }

}
