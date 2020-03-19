package weixin.popular.bean.card.membercard.updateuser;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class NotifyOptional {
    /** 积分变动时是否触发系统模板消息，默认为true */
    @JSONField(name = "is_notify_balance")
    private Boolean isNotifyBalance;

    /** 余额变动时是否触发系统模板消息，默认为true */
    @JSONField(name = "is_notify_bonus")
    private Boolean isNotifyBonus;

    /** 自定义group1变动时是否触发系统模板消息，默认为false */
    @JSONField(name = "is_notify_custom_field1")
    private Boolean isNotifyCustomField1;

    /** 自定义group2变动时是否触发系统模板消息，默认为false */
    @JSONField(name = "is_notify_custom_field2")
    private Boolean isNotifyCustomField2;

    /** 自定义group3变动时是否触发系统模板消息，默认为false */
    @JSONField(name = "is_notify_custom_field3")
    private Boolean isNotifyCustomField3;

    public Boolean getIsNotifyBalance() {
        return isNotifyBalance;
    }

    public void setIsNotifyBalance(Boolean isNotifyBalance) {
        isNotifyBalance = isNotifyBalance;
    }

    public Boolean getIsNotifyBonus() {
        return isNotifyBonus;
    }

    public void setIsNotifyBonus(Boolean isNotifyBonus) {
        isNotifyBonus = isNotifyBonus;
    }

    public Boolean getIsNotifyCustomField1() {
        return isNotifyCustomField1;
    }

    public void setIsNotifyCustomField1(Boolean isNotifyCustomField1) {
        isNotifyCustomField1 = isNotifyCustomField1;
    }

    public Boolean getIsNotifyCustomField2() {
        return isNotifyCustomField2;
    }

    public void setIsNotifyCustomField2(Boolean isNotifyCustomField2) {
        isNotifyCustomField2 = isNotifyCustomField2;
    }

    public Boolean getIsNotifyCustomField3() {
        return isNotifyCustomField3;
    }

    public void setIsNotifyCustomField3(Boolean isNotifyCustomField3) {
        isNotifyCustomField3 = isNotifyCustomField3;
    }
}
