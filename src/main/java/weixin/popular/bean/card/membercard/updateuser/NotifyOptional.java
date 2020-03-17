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

    public Boolean getNotifyBalance() {
        return isNotifyBalance;
    }

    public void setNotifyBalance(Boolean notifyBalance) {
        isNotifyBalance = notifyBalance;
    }

    public Boolean getNotifyBonus() {
        return isNotifyBonus;
    }

    public void setNotifyBonus(Boolean notifyBonus) {
        isNotifyBonus = notifyBonus;
    }

    public Boolean getNotifyCustomField1() {
        return isNotifyCustomField1;
    }

    public void setNotifyCustomField1(Boolean notifyCustomField1) {
        isNotifyCustomField1 = notifyCustomField1;
    }

    public Boolean getNotifyCustomField2() {
        return isNotifyCustomField2;
    }

    public void setNotifyCustomField2(Boolean notifyCustomField2) {
        isNotifyCustomField2 = notifyCustomField2;
    }

    public Boolean getNotifyCustomField3() {
        return isNotifyCustomField3;
    }

    public void setNotifyCustomField3(Boolean notifyCustomField3) {
        isNotifyCustomField3 = notifyCustomField3;
    }
}
