package pers.tz.robot.scrawl.service.processor;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pers.tz.robot.scrawl.config.MagazineScrawlConfig;
import pers.tz.robot.scrawl.constants.BulletNameType;
import pers.tz.robot.scrawl.service.pipeline.ShotgunPipeline;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;



/**
 * @Author twz
 * @Date 2020-12-11
 * @Desc 霰弹枪弹匣更新装置
 */
@Component
@AllArgsConstructor
public class ShotgunLevelProcessor implements PageProcessor {

    private MagazineScrawlConfig magazineScrawlConfig;
    private ShotgunPipeline shotgunPipeline;
    private Site magazineSite;

    @Override
    public void process(Page page) {
        page.putField(BulletNameType.SHOTGUN_BULLET.value, page.getRawText());
    }

    @Override
    public Site getSite() {
        return magazineSite;
    }

    public void start() {
        Spider.create(this)
                .addUrl(magazineScrawlConfig.getShotGunURL())  // 地址
                .addPipeline(shotgunPipeline)
                .thread(magazineScrawlConfig.getThreadCount()) // 线程数
                .run();
    }
}
