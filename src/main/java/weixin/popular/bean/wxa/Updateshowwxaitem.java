package weixin.popular.bean.wxa;

/**
 * @author Nitsuya
 */
public class Updateshowwxaitem {
    /** 是否打开扫码关注组件 0关闭，1开启*/
    private Integer wxa_subscribe_biz_flag;

    /** 如果开启，需要传新的公众号 appid*/
    private String appid;

    public Integer getWxa_subscribe_biz_flag() {
        return wxa_subscribe_biz_flag;
    }

    public void setWxa_subscribe_biz_flag(Integer wxa_subscribe_biz_flag) {
        this.wxa_subscribe_biz_flag = wxa_subscribe_biz_flag;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
