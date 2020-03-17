package weixin.popular.bean.card.membercard.activateuserform.set;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 *
 * @author Nitsuya
 */
public class Form {

    /** 当前结构（required_form或者optional_form ）内的字段是否允许用户激活后再次修改，商户设置为true时，需要接收相应事件通知处理修改事件 */
    @JSONField(name = "can_modify")
    private Boolean canModify;


    /** 自定义url， 请填写http:// 或者https://开头的链接 */
    private String url;

    /**
     * 微信格式化的选项类型
     * USER_FORM_INFO_FLAG_MOBILE	手机号
     * USER_FORM_INFO_FLAG_SEX	性别
     * USER_FORM_INFO_FLAG_NAME	姓名
     * USER_FORM_INFO_FLAG_BIRTHDAY	生日
     * USER_FORM_INFO_FLAG_IDCARD	身份证
     * USER_FORM_INFO_FLAG_EMAIL	邮箱
     * USER_FORM_INFO_FLAG_LOCATION	详细地址
     * USER_FORM_INFO_FLAG_EDUCATION_BACKGRO	教育背景
     * USER_FORM_INFO_FLAG_INDUSTRY	行业
     * USER_FORM_INFO_FLAG_INCOME	收入
     * USER_FORM_INFO_FLAG_HABIT	兴趣爱好
     * */
    @JSONField(name = "common_field_id_list")
    private List<String> commonFieldIdList;

    /**
     * 自定义富文本类型，包含以下三个字段，开发者可以分别在必填和选填中至多定义五个自定义选项
     */
    @JSONField(name = "rich_field_list")
    private List<RichField> richFieldList;

    /** 自定义选项名称，开发者可以分别在必填和选填中至多定义五个自定义选项 */
    @JSONField(name = "custom_field_list")
    private List<String> customFieldList;


    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getCommonFieldIdList() {
        return commonFieldIdList;
    }

    public void setCommonFieldIdList(List<String> commonFieldIdList) {
        this.commonFieldIdList = commonFieldIdList;
    }

    public List<RichField> getRichFieldList() {
        return richFieldList;
    }

    public void setRichFieldList(List<RichField> richFieldList) {
        this.richFieldList = richFieldList;
    }

    public List<String> getCustomFieldList() {
        return customFieldList;
    }

    public void setCustomFieldList(List<String> customFieldList) {
        this.customFieldList = customFieldList;
    }
}
