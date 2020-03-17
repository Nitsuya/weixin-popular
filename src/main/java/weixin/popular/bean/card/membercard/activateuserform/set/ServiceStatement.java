package weixin.popular.bean.card.membercard.activateuserform.set;

/**
 *
 * @author Nitsuya
 */
public class ServiceStatement {

    /** 链接名称 */
    private String name;

    /** 自定义url， 请填写http:// 或者https://开头的链接 */
    private String url;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
