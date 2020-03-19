package weixin.popular.bean.card.membercard.unactivate;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 微信卡券－会员卡专区－创建会员卡-取消激活-请求参数
 * @author Nitsuya
 */
public class MembercardUnactivate {
    /** 卡券ID,自定义code卡券必填 */
    @JSONField(name = "card_id")
    private String cardId;

    /** 领取会员卡用户获得的code */
    private String code;

    public MembercardUnactivate() {
    }

    public MembercardUnactivate(String cardId, String code) {
        this.cardId = cardId;
        this.code = code;
    }

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
