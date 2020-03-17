package weixin.popular.bean.card.paygiftcard.add;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class FailMchid {
    /** 错误码 */
    private String errcode;

    /** 错误信息 */
    private String errmsg;

    /** 支付的商户号 */
    private String mchid;

    /** 该mchid当前被占用的appid，商户须使用该appid解除绑定后重新设置 */
    @JSONField(name = "occupy_appid")
    private String occupyAppid;

    /** 该mchid当前被占用的rule_id，商户须使用修改或删除该rule_id重新设置 */
    @JSONField(name = "occupy_rule_id")
    private Integer occupyRuleId;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getOccupyAppid() {
        return occupyAppid;
    }

    public void setOccupyAppid(String occupyAppid) {
        this.occupyAppid = occupyAppid;
    }

    public Integer getOccupyRuleId() {
        return occupyRuleId;
    }

    public void setOccupyRuleId(Integer occupyRuleId) {
        this.occupyRuleId = occupyRuleId;
    }
}
