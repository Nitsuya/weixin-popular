package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class PayInfo {
    @JSONField(name = "swipe_card")
    private SwipeCard swipeCard;
}
