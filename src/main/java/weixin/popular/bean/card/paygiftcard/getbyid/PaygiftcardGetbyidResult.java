package weixin.popular.bean.card.paygiftcard.getbyid;

import com.alibaba.fastjson.annotation.JSONField;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.card.paygiftcard.Paygiftcard;

/**
 * 微信卡券－会员卡专区－管理会员卡-查询支付后投放卡券规则详情-响应参数
 * @author Nitsuya
 */
public class PaygiftcardGetbyidResult extends BaseResult {

    /** 规则信息 */
    @JSONField(name = "rule_info")
    private Paygiftcard ruleInfo;

}
