package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * @author Nitsuya
 */
public class GetwxamplinkforshowResult extends BaseResult {
    /** 总记录数 */
    private Integer total_num;

    /** 公众号信息列表 */
    private List<BizInfo> biz_info_list;

    public static class BizInfo {
        /** 公众号昵称 */
        private String nickname;

        /** 公众号 appid */
        private String appid;

        /** 公众号头像 */
        private String headimg;

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getHeadimg() {
            return headimg;
        }

        public void setHeadimg(String headimg) {
            this.headimg = headimg;
        }
    }

    public Integer getTotal_num() {
        return total_num;
    }

    public void setTotal_num(Integer total_num) {
        this.total_num = total_num;
    }

    public List<BizInfo> getBiz_info_list() {
        return biz_info_list;
    }

    public void setBiz_info_list(List<BizInfo> biz_info_list) {
        this.biz_info_list = biz_info_list;
    }
}
