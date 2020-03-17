package weixin.popular.bean.card.paygiftcard.batchget;

import com.alibaba.fastjson.annotation.JSONField;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.card.paygiftcard.Paygiftcard;

import java.util.List;

/**
 * 微信卡券－会员卡专区－管理会员卡-批量查询支付后投放卡券规则-响应参数
 * @author Nitsuya
 */
public class PaygiftcardBatchgetResult extends BaseResult {

    /** 总条数 */
    @JSONField(name = "total_count")
    private Integer totalCount;

    /** 规则信息 */
    @JSONField(name = "rule_list")
    private List<Paygiftcard> ruleList;

}
