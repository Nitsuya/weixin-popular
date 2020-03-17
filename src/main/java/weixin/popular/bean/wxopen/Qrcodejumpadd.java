package weixin.popular.bean.wxopen;

import java.util.List;

/**
 * @author Nitsuya
 */
public class Qrcodejumpadd {
    /** 二维码规则 */
    private String prefix;

    /** 是否独占符合二维码前缀匹配规则的所有子规 1 为不占用，2 为占用; 详见 */
    private Integer permit_sub_rule;

    /** 小程序功能页面 */
    private String path;

    /** 测试范围 1开发版（配置只对开发者生效） 2体验版（配置对管理员、体验者生效) 3正式版（配置对开发者、管理员和体验者生效） */
    private Integer open_version;

    /** 测试链接，至多 5 个用于测试的二维码完整链接，此链接必须符合已填写的二维码规则。 */
    private List<String> debug_url;

    /** 编辑标志位，0 表示新增二维码规则，1 表示修改已有二维码规则 */
    private String is_edit;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getPermit_sub_rule() {
        return permit_sub_rule;
    }

    public void setPermit_sub_rule(Integer permit_sub_rule) {
        this.permit_sub_rule = permit_sub_rule;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getOpen_version() {
        return open_version;
    }

    public void setOpen_version(Integer open_version) {
        this.open_version = open_version;
    }

    public List<String> getDebug_url() {
        return debug_url;
    }

    public void setDebug_url(List<String> debug_url) {
        this.debug_url = debug_url;
    }

    public String getIs_edit() {
        return is_edit;
    }

    public void setIs_edit(String is_edit) {
        this.is_edit = is_edit;
    }
}
