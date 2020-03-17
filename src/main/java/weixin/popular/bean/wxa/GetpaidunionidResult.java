package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

/**
 * @author Nitsuya
 */
public class GetpaidunionidResult extends BaseResult {
    /** 用户唯一标识，调用成功后返回 */
    private String unionid;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
