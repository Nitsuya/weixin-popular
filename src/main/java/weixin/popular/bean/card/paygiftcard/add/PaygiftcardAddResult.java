package weixin.popular.bean.card.paygiftcard.add;

import com.alibaba.fastjson.annotation.JSONField;
import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * 微信卡券－会员卡专区－管理会员卡-设置支付后投放卡券-响应参数
 * @author Nitsuya
 */
public class PaygiftcardAddResult extends BaseResult {

    /** 本次设置的规则id，供后续修改删除使用 */
    @JSONField(name = "rule_id")
    private String ruleId;

    /** 设置成功的mchid列表 */
    @JSONField(name = "succ_mchid_list")
    private List<String> succMchidList;

    /** 设置失败的mchid列表 */
    @JSONField(name = "fail_mchid_list")
    private List<FailMchid> failMchidList;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public List<String> getSuccMchidList() {
        return succMchidList;
    }

    public void setSuccMchidList(List<String> succMchidList) {
        this.succMchidList = succMchidList;
    }

    public List<FailMchid> getFailMchidList() {
        return failMchidList;
    }

    public void setFailMchidList(List<FailMchid> failMchidList) {
        this.failMchidList = failMchidList;
    }
}
