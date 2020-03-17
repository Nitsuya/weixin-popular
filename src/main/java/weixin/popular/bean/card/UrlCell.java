package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 推荐内容结构体
 *
 * @author Nitsuya
 *
 */
public class UrlCell {

    /** 送券的card_id列表，不支持普通券和朋友的券混合使用，最多填写10个card_id */
    @JSONField(name = "card_id_list")
    private List<String> cardIdList;

    /** 推荐位展示的截止时间 */
    @JSONField(name = "end_time")
    private Integer endTime;

    /** 文本内容 */
    private String text;

    /** 跳转链接，与card_id_list互斥，若设置了跳转url，用户点击模板消息详情后将跳转至该链接领券 */
    private String url;

    /** 跳转链接对应的小程序appid，与card_id_list互斥，若设置了，用户点击模板消息详情后将跳转至该小程序领券 */
    @JSONField(name = "app_brand_id")
    private String appBrandId;

    /** 跳转链接对应的小程序路径，与card_id_list互斥，若设置了，用户点击模板消息详情后将跳转至该小程序领券 */
    @JSONField(name = "app_brand_pass")
    private String appBrandPass;

    public List<String> getCardIdList() {
        return cardIdList;
    }

    public void setCardIdList(List<String> cardIdList) {
        this.cardIdList = cardIdList;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppBrandId() {
        return appBrandId;
    }

    public void setAppBrandId(String appBrandId) {
        this.appBrandId = appBrandId;
    }

    public String getAppBrandPass() {
        return appBrandPass;
    }

    public void setAppBrandPass(String appBrandPass) {
        this.appBrandPass = appBrandPass;
    }
}
