package pers.tz.scrawl.service.processor;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pers.tz.scrawl.config.MagazineScrawlConfig;
import pers.tz.scrawl.constants.BulletNameType;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import pers.tz.scrawl.service.pipeline.LickDoggunPipeline;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc TODO
 */
@Component
@AllArgsConstructor
public class LickDoggunLevelProcessor implements PageProcessor {

    private MagazineScrawlConfig magazineScrawlConfig;
    private LickDoggunPipeline lickDoggunPipeline;
    private Site magazineSite;

    @Override
    public void process(Page page) {
        page.putField(BulletNameType.LICKDOG_BULLET.value, page.getRawText());
    }

    @Override
    public Site getSite() {
        return magazineSite;
    }

    public void start() {
        Spider.create(this)
                .addUrl(magazineScrawlConfig.getLickDogUrl())  // 地址
                .addPipeline(lickDoggunPipeline)
                .thread(magazineScrawlConfig.getThreadCount()) // 线程数
                .run();
    }
}
