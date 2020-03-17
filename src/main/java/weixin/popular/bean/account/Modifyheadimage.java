package weixin.popular.bean.account;

/**
 * @author Nitsuya
 */
public class Modifyheadimage {
    /** 头像素材 media_id */
    private String head_img_media_id;

    /** 裁剪框左上角 x 坐标（取值范围：[0, 1]） */
    private float x1;

    /** 裁剪框左上角 y 坐标（取值范围：[0, 1]） */
    private float y1;

    /** 裁剪框右下角 x 坐标（取值范围：[0, 1]） */
    private float x2;

    /** 裁剪框右下角 y 坐标（取值范围：[0, 1]） */
    private float y2;

    public String getHead_img_media_id() {
        return head_img_media_id;
    }

    public void setHead_img_media_id(String head_img_media_id) {
        this.head_img_media_id = head_img_media_id;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
}
