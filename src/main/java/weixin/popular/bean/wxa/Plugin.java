package weixin.popular.bean.wxa;

/**
 * @author Nitsuya
 */
public class Plugin {
    /** 操作类型 apply申请使用插件 list查询已添加的插件列表 unbind删除已添加的插件 update快速更新插件版本号 */
    private String action;

    /** 插件的appid  action为[apply,unbind,update]需要传入*/
    private String plugin_appid;

    /** 升级至版本号，要求此插件版本支持快速更新 action为[update]需要传入 */
    private String user_version;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPlugin_appid() {
        return plugin_appid;
    }

    public void setPlugin_appid(String plugin_appid) {
        this.plugin_appid = plugin_appid;
    }

    public String getUser_version() {
        return user_version;
    }

    public void setUser_version(String user_version) {
        this.user_version = user_version;
    }
}
