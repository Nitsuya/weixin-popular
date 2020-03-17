package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

/**
 * @author Nitsuya
 */
public class QrcodejumpdownloadResult extends BaseResult {
    /** 文件名称 */
    private String file_name;

    /** 文件内容 */
    private String file_content;


    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_content() {
        return file_content;
    }

    public void setFile_content(String file_content) {
        this.file_content = file_content;
    }
}
