package weixin.popular.bean.wxopen;

import java.util.List;

public class Modifycategory {
    /** 一级类目 ID */
    private Integer first;

    /** 二级类目 ID */
    private Integer second;

    /** 资质信息列表 */
    private List<Certicate> certicates;

    public static class Certicate {
        /** 资质名称 */
        private String key;

        /** 资质图片 */
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public List<Certicate> getCerticates() {
        return certicates;
    }

    public void setCerticates(List<Certicate> certicates) {
        this.certicates = certicates;
    }
}
