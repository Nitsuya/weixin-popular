package weixin.popular.bean.wxa;

import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * @author Nitsuya
 */
public class PluginResult extends BaseResult {
    /** 申请或使用中的插件信息列表，当 action == 'list' 时返回 */
    private List<Plugin> plugin_list;

    public static class Plugin {
        /** 插件 appid */
        private String appid;
        /** 插件申请状态 1申请中 2申请通过 3被拒绝 4申请已超时 */
        private String status;
        /** 插件昵称 */
        private String nickname;
        /** 插件头像 */
        private String headimgurl;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }
    }

    public List<Plugin> getPlugin_list() {
        return plugin_list;
    }

    public void setPlugin_list(List<Plugin> plugin_list) {
        this.plugin_list = plugin_list;
    }
}
