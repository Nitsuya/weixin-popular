package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * @author Nitsuya
 */
public class GetweappsupportversionResult extends BaseResult {
    /** 当前版本 */
    private String now_version;
    /** 版本的用户占比列表 */
    private UvInfo uv_info;

    public static class UvInfo{
        private List<Item> items;

        public static class Item{
            /** 百分比 */
            private Integer percentage;

            /** 基础库版本号 */
            private String version;

            public Integer getPercentage() {
                return percentage;
            }

            public void setPercentage(Integer percentage) {
                this.percentage = percentage;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }
    }

    public String getNow_version() {
        return now_version;
    }

    public void setNow_version(String now_version) {
        this.now_version = now_version;
    }

    public UvInfo getUv_info() {
        return uv_info;
    }

    public void setUv_info(UvInfo uv_info) {
        this.uv_info = uv_info;
    }
}
