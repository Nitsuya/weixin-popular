package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

/**
 * @author Nitsuya
 */
public class GetshowwxaitemResult extends BaseResult {

    /** 是否可以设置 1可以，0不可以*/
    private Integer can_open;

    /** 是否已经设置 1已设置，0未设置*/
    private Integer is_open;

    /** 展示的公众号 appid*/
    private String appid;

    /** 展示的公众号 nickname*/
    private String nickname;

    /** 展示的公众号头像*/
    private String headimg;


    public Integer getCan_open() {
        return can_open;
    }

    public void setCan_open(Integer can_open) {
        this.can_open = can_open;
    }

    public Integer getIs_open() {
        return is_open;
    }

    public void setIs_open(Integer is_open) {
        this.is_open = is_open;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
}
