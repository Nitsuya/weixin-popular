package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class SwipeCard {

    /** 会员卡支持微信支付刷卡 */
    @JSONField(name = "is_swipe_card")
    private Boolean isSwipeCard;

    public Boolean getIsSwipeCard() {
        return isSwipeCard;
    }

    public void setIsSwipeCard(Boolean isSwipeCard) {
        isSwipeCard = isSwipeCard;
    }
}
