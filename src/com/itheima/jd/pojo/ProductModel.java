package com.itheima.jd.pojo;

public class ProductModel {
    // 商品编号
    private Integer pid;//主要是和solr域中的类型一致便可，当然可以和数据库中的一致。
    // 商品名称
    private String name;
    // 商品分类名称
    private String catalog_name;
    // 价格
    private Float price;//主要是和solr域中的类型一致便可，当然可以和数据库中的一致。
    // 图片名称
    private String picture;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
