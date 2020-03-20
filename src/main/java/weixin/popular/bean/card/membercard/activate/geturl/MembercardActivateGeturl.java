package weixin.popular.bean.card.membercard.activate.geturl;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 微信卡券－会员卡专区－创建会员卡-获取激活会员卡链接-请求参数
 * @author Nitsuya
 */
public class MembercardActivateGeturl {

    /** 会员卡的card_id */
    @JSONField(name = "card_id")
    private String cardId;

    /** 渠道值，用于统计本次领取的渠道参数 */
    @JSONField(name = "outer_str")
    private String outerStr;

    public MembercardActivateGeturl() {
    }

    public MembercardActivateGeturl(String cardId) {
        this.cardId = cardId;
    }

    public MembercardActivateGeturl(String cardId, String outerStr) {
        this.cardId = cardId;
        this.outerStr = outerStr;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getOuterStr() {
        return outerStr;
    }

    public void setOuterStr(String outerStr) {
        this.outerStr = outerStr;
    }
}
