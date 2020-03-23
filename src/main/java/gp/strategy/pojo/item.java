package gp.strategy.pojo;

import java.util.Date;
import java.util.List;

public class item {
    private String approveStatus;
    private String prop;
    private String title;
    private String desc;
    private String detailUrl;
    private List<String> itemImgs;
    private List<String> itemRectangleImgs;
    private Long num;
    private String picUrl;
    private String price;

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public List<String> getItemImgs() {
        return itemImgs;
    }

    public void setItemImgs(List<String> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public List<String> getItemRectangleImgs() {
        return itemRectangleImgs;
    }

    public void setItemRectangleImgs(List<String> itemRectangleImgs) {
        this.itemRectangleImgs = itemRectangleImgs;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
