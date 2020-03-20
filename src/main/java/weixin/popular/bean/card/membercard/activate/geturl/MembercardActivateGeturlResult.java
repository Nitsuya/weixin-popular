package weixin.popular.bean.card.membercard.activate.geturl;

import weixin.popular.bean.BaseResult;

/**
 * 微信卡券－会员卡专区－创建会员卡-获取激活会员卡链接-响应参数
 * @author Nitsuya
 */
public class MembercardActivateGeturlResult extends BaseResult {
    /**	返回的url，内含调用开卡插件所需的参数 */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
