package weixin.popular.bean.card.membercard;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author Nitsuya
 */
public class Field {

    /** 会员信息类目名称 */
    private String name;

    /** 会员卡信息类目值，比如等级值等 */
    private String value;

    /** 填写项目为多选时的返回 */
    @JSONField(name = "value_list")
    private List<String> valueList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }
}
