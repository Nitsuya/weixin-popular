package weixin.popular.bean.card.paygiftcard.batchget;

/**
 * 微信卡券－会员卡专区－管理会员卡-批量查询支付后投放卡券规则-请求参数
 * @author Nitsuya
 */
public class PaygiftcardBatchget {

    /** 类型，此处填写 RULE_TYPE_PAY_MEMBER_CARD */
    private String type;

    /** 是否仅查询生效的规则 */
    private Boolean effective;

    /** 起始偏移量 */
    private Integer offset;

    /** 查询的数量 */
    private Integer count;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getEffective() {
        return effective;
    }

    public void setEffective(Boolean effective) {
        this.effective = effective;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
