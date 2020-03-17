package weixin.popular.bean.card.paygiftcard;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class MemberRule {

    /** 要赠送的会员卡card_id */
    @JSONField(name = "card_id")
    private String cardId;

    /** 单次消费送会员卡的金额下限 ，以分为单位 */
    @JSONField(name = "least_cost")
    private String leastCost;

    /** 单次消费送会员卡的金额上限，以分为单位 */
    @JSONField(name = "max_cost")
    private String maxCost;

    /** 商户自定义领卡网页链接，填入后点击支付即会员消息会跳转至商户网页领卡 */
    @JSONField(name = "jump_url")
    private String jumpUrl;

    /** 商户自定义领卡小程序appid，填入后点击支付即会员消息会跳转至商户小程序领卡 */
    @JSONField(name = "app_brand_id")
    private String appBrandId;

    /** 商户自定义领卡小程序路径，填入后点击支付即会员消息会跳转至商户小程序领卡 */
    @JSONField(name = "app_brand_pass")
    private String appBrandPass;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getLeastCost() {
        return leastCost;
    }

    public void setLeastCost(String leastCost) {
        this.leastCost = leastCost;
    }

    public String getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(String maxCost) {
        this.maxCost = maxCost;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getAppBrandId() {
        return appBrandId;
    }

    public void setAppBrandId(String appBrandId) {
        this.appBrandId = appBrandId;
    }

    public String getAppBrandPass() {
        return appBrandPass;
    }

    public void setAppBrandPass(String appBrandPass) {
        this.appBrandPass = appBrandPass;
    }
}
