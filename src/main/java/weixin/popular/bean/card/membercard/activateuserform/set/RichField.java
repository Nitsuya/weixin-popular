package weixin.popular.bean.card.membercard.activateuserform.set;

import java.util.List;

/**
 * @author Nitsuya
 */
public class RichField {
    /**
     * FORM_FIELD_[文档未标注] 富文本类型
     * FORM_FIELD_RADIO 自定义单选
     * FORM_FIELD_SELECT自定义选择项
     * FORM_FIELD_CHECK_BOX 自定义多选
     * */
    private String type;

    /** 字段名 */
    private String name;

    /** 选择项 */
    private List<String> values;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
