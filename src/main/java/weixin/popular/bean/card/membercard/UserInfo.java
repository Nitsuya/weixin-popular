package weixin.popular.bean.card.membercard;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author Nitsuya
 */
public class UserInfo {

    /** 开发者设置的会员卡会员信息类目 */
    @JSONField(name = "common_field_list")
    private Field commonFieldList;

    /** 开发者设置的会员卡会员信息类目 */
    @JSONField(name = "custom_field_list")
    private Field customFieldList;

    public Field getCommonFieldList() {
        return commonFieldList;
    }

    public void setCommonFieldList(Field commonFieldList) {
        this.commonFieldList = commonFieldList;
    }

    public Field getCustomFieldList() {
        return customFieldList;
    }

    public void setCustomFieldList(Field customFieldList) {
        this.customFieldList = customFieldList;
    }
}
