package me.zhl.fanli.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "detail_url")
    private String detailUrl;

    @Column
    private Float price;

    @Column
    private Float rate;

    @Column
    private Float income;

    @Column(name = "short_url")
    private String shortUrl;

    @Column
    private String url;

    @Column(name = "tao_code")
    private String taoCode;

    @Column(name = "coupon_count")
    private Integer couponCount;

    @Column(name = "coupon_remainder")
    private Integer couponRemainder;

    @Column(name = "coupon_value")
    private String couponValue;

    @Column(name = "coupon_start_datetime")
    private Date couponStartDatetime;

    @Column(name = "coupon_end_datetime")
    private Date couponEndDatetime;

    @Column(name = "coupon_url")
    private String couponUrl;

    @Column(name = "coupon_tao_code")
    private String couponTaoCode;

    @Column(name = "coupon_short_url")
    private String couponShortUrl;

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getIncome() {
        return income;
    }

    public void setIncome(Float income) {
        this.income = income;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTaoCode() {
        return taoCode;
    }

    public void setTaoCode(String taoCode) {
        this.taoCode = taoCode;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getCouponRemainder() {
        return couponRemainder;
    }

    public void setCouponRemainder(Integer couponRemainder) {
        this.couponRemainder = couponRemainder;
    }

    public String getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(String couponValue) {
        this.couponValue = couponValue;
    }

    public Date getCouponStartDatetime() {
        return couponStartDatetime;
    }

    public void setCouponStartDatetime(Date couponStartDatetime) {
        this.couponStartDatetime = couponStartDatetime;
    }

    public Date getCouponEndDatetime() {
        return couponEndDatetime;
    }

    public void setCouponEndDatetime(Date couponEndDatetime) {
        this.couponEndDatetime = couponEndDatetime;
    }

    public String getCouponUrl() {
        return couponUrl;
    }

    public void setCouponUrl(String couponUrl) {
        this.couponUrl = couponUrl;
    }

    public String getCouponTaoCode() {
        return couponTaoCode;
    }

    public void setCouponTaoCode(String couponTaoCode) {
        this.couponTaoCode = couponTaoCode;
    }

    public String getCouponShortUrl() {
        return couponShortUrl;
    }

    public void setCouponShortUrl(String couponShortUrl) {
        this.couponShortUrl = couponShortUrl;
    }
}
