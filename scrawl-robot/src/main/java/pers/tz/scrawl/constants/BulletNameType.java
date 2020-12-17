package pers.tz.scrawl.constants;

/**
 * @Author twz
 * @Date 2020-12-16
 * @Desc 子弹名field
 */
public enum BulletNameType {

    SHOTGUN_BULLET("SHOTGUN_BULLET"),  // 霰弹枪
    WATERGUN_BULLET("WATERGUN_BULLET"),  // 水枪
    LICKDOG_BULLET("LICKDOG_BULLET");  // 舔狗模式

    public final String value;
    BulletNameType(String value) {
        this.value = value;
    }

}
