package weixin.popular.bean.card;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 推荐类型
 * @author Nitsuya
 */
public class MsgOperation {

    /** 推荐内容结构体 */
    @JSONField(name = "url_cell")
    private UrlCell urlCell;
}
