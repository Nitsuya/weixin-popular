package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

import java.util.List;

/**
 * @author Nitsuya
 */
public class GetallcategoriesResult extends BaseResult {

    /** 类目信息列表 */
    private List<Category> categories_list;

    public static class Category {

        /** 类目 ID */
        private Integer id;

        /** 类目名称 */
        private String name;

        /** 类目层级 */
        private Integer level;

        /** 类目父级 ID */
        private Integer father;

        /** 子级类目 ID */
        private List<Integer> children;

        /** 是否为敏感类目（1为敏感类目，需要提供相应资质审核；0为非敏感类目，无需审核） */
        private Integer sensitive_type;

        /** sensitive_type 为 1 的类目需要提供的资质证明 */
        private Qualify qualify;

        public static class Qualify {

            private String remark;

            private List<Inner> inner_list;

            public static class Inner {
                /** 资质文件名称 */
                private String name;

                /** 资质文件示例 */
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

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public List<Inner> getInner_list() {
                return inner_list;
            }

            public void setInner_list(List<Inner> inner_list) {
                this.inner_list = inner_list;
            }
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public Integer getFather() {
            return father;
        }

        public void setFather(Integer father) {
            this.father = father;
        }

        public List<Integer> getChildren() {
            return children;
        }

        public void setChildren(List<Integer> children) {
            this.children = children;
        }

        public Integer getSensitive_type() {
            return sensitive_type;
        }

        public void setSensitive_type(Integer sensitive_type) {
            this.sensitive_type = sensitive_type;
        }

        public Qualify getQualify() {
            return qualify;
        }

        public void setQualify(Qualify qualify) {
            this.qualify = qualify;
        }
    }

    public List<Category> getCategories_list() {
        return categories_list;
    }

    public void setCategories_list(List<Category> categories_list) {
        this.categories_list = categories_list;
    }
}
