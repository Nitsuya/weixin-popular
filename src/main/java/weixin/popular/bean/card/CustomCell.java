package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 自定义信息类目Cell
 *
 * @author Nitsuya
 *
 */
public class CustomCell {

    /** 入口名称 */
    private String name;

    /** 入口右侧提示语，6个汉字内 */
    private String tips;

    /** 入口跳转链接 */
    private String url;

    /** 入口跳转小程序user_name [原始ID+@app] */
    @JSONField(name = "app_brand_user_name")
    private String appBrandUserName;

    /** 入口跳转小程序页面 */
    @JSONField(name = "app_brand_pass")
    private String appBrandPass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
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
