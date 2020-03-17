package weixin.popular.bean.card.membercard.userinfo.get;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 微信卡券－会员卡专区－创建会员卡-拉取会员信息接口-请求参数
 * @author Nitsuya
 */
public class MembercardUserinfoGet {

    /** 卡券ID */
    @JSONField(name = "card_id")
    private String cardId;

    /** 卡券Code码 */
    private String code;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
