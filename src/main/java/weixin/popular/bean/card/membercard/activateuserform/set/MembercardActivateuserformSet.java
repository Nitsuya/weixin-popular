package weixin.popular.bean.card.membercard.activateuserform.set;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 微信卡券－会员卡专区－创建会员卡-设置开卡字段接口-请求参数
 * @author Nitsuya
 */
public class MembercardActivateuserformSet {

    /** 卡券ID */
    @JSONField(name = "card_id")
    private String cardId;

    /** 服务声明，用于放置商户会员卡守则 */
    @JSONField(name = "service_statement")
    private ServiceStatement serviceStatement;

    /** 绑定老会员链接 */
    @JSONField(name = "bind_old_card")
    private BindOldCard bindOldCard;

    @JSONField(name = "required_form")
    private Form requiredForm;

    @JSONField(name = "optional_form")
    private Form optionalForm;


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public ServiceStatement getServiceStatement() {
        return serviceStatement;
    }

    public void setServiceStatement(ServiceStatement serviceStatement) {
        this.serviceStatement = serviceStatement;
    }

    public BindOldCard getBindOldCard() {
        return bindOldCard;
    }

    public void setBindOldCard(BindOldCard bindOldCard) {
        this.bindOldCard = bindOldCard;
    }
}
