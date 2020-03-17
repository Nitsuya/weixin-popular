package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * @author Nitsuya
 */
public class QrcodejumpgetResult extends BaseResult {
    /** 是否已经打开二维码跳转链接设置 */
    private Integer qrcodejump_open;

    /** 本月还可发布的次数 */
    private Integer qrcodejump_pub_quota;

    /** 二维码规则数量 */
    private Integer list_size;

    /** 二维码规则详情列表 */
    private List<Rule> rule_list;

    public static class Rule {

        /** 二维码规则 */
        private String prefix;

        /** 是否独占符合二维码前缀匹配规则的所有子规 1为不占用，2为占用 */
        private Integer permit_sub_rule;

        /** 小程序功能页面 */
        private String path;

        /** 测试范围 1开发版（配置只对开发者生效） 2体验版（配置对管理员、体验者生效) 3正式版（配置对开发者、管理员和体验者生效） */
        private String open_version;

        /** 测试链接（选填）可填写不多于 5 个用于测试的二维码完整链接，此链接必须符合已填写的二维码规则。 */
        private List<String> debug_url;

        /** 发布标志位，1 表示未发布，2 表示已发布 */
        private String state;

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

        public String getOpen_version() {
            return open_version;
        }

        public void setOpen_version(String open_version) {
            this.open_version = open_version;
        }

        public List<String> getDebug_url() {
            return debug_url;
        }

        public void setDebug_url(List<String> debug_url) {
            this.debug_url = debug_url;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public Integer getQrcodejump_open() {
        return qrcodejump_open;
    }

    public void setQrcodejump_open(Integer qrcodejump_open) {
        this.qrcodejump_open = qrcodejump_open;
    }

    public Integer getQrcodejump_pub_quota() {
        return qrcodejump_pub_quota;
    }

    public void setQrcodejump_pub_quota(Integer qrcodejump_pub_quota) {
        this.qrcodejump_pub_quota = qrcodejump_pub_quota;
    }

    public Integer getList_size() {
        return list_size;
    }

    public void setList_size(Integer list_size) {
        this.list_size = list_size;
    }

    public List<Rule> getRule_list() {
        return rule_list;
    }

    public void setRule_list(List<Rule> rule_list) {
        this.rule_list = rule_list;
    }
}
