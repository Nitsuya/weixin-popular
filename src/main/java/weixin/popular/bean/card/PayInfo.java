package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class PayInfo {
    @JSONField(name = "swipe_card")
    private SwipeCard swipeCard;

    public SwipeCard getSwipeCard() {
        return swipeCard;
    }

    public void setSwipeCard(SwipeCard swipeCard) {
        this.swipeCard = swipeCard;
    }
}
