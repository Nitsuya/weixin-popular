package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 自定义信息类目Field
 *
 * @author Nitsuya
 *
 */
public class CustomField {

    /**
     * 会员信息类目半自定义名称，当开发者变更这类类目信息的value值时 可以选择触发系统模板消息通知用户。
     * FIELD_NAME_TYPE_LEVEL 等级
     * FIELD_NAME_TYPE_COUPON 优惠券
     * FIELD_NAME_TYPE_STAMP 印花
     * FIELD_NAME_TYPE_DISCOUNT 折扣
     * FIELD_NAME_TYPE_ACHIEVEMEN 成就
     * FIELD_NAME_TYPE_MILEAGE 里程
     * FIELD_NAME_TYPE_SET_POINTS 集点
     * FIELD_NAME_TYPE_TIMS 次数
     * */
    @JSONField(name = "name_type")
    private String nameType;

    /**
     * 会员信息类目自定义名称，当开发者变更这类类目信息的value值时 不会触发系统模板消息通知用户
     * */
    private String name;

    /** 点击类目跳转外链url */
    private String url;

    /** 点击类目跳转小程序user_name [原始ID+@app] */
    @JSONField(name = "app_brand_user_name")
    private String appBrandUserName;

    /** 点击类目跳转小程序页面 */
    @JSONField(name = "app_brand_pass")
    private String appBrandPass;

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppBrandUserName() {
        return appBrandUserName;
    }

    public void setAppBrandUserName(String appBrandUserName) {
        this.appBrandUserName = appBrandUserName;
    }

    public String getAppBrandPass() {
        return appBrandPass;
    }

    public void setAppBrandPass(String appBrandPass) {
        this.appBrandPass = appBrandPass;
    }
}
