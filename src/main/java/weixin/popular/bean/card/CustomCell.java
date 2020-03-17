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
}
