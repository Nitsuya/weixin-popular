package weixin.popular.bean.card.paygiftcard;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class Paygiftcard {

    /** 营销规则类型，支付即会员填 写RULE_TYPE_PAY_MEMBER_CARD */
    private String type;

    /** 营销规则结构体 */
    @JSONField(name = "base_info")
    private BaseInfo baseInfo;

    /** 支付即会员结构体 */
    @JSONField(name = "member_rule")
    private MemberRule memberRule;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public MemberRule getMemberRule() {
        return memberRule;
    }

    public void setMemberRule(MemberRule memberRule) {
        this.memberRule = memberRule;
    }
}
