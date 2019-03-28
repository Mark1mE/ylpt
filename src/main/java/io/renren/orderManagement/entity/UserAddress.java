package io.renren.orderManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/26 17:04
 */
@Entity
public class UserAddress {
    @Id
    private String uaId;
    //用户信息表主键
    private String userInfoId;
    //国家
    private String country;
    //省份
    private String province;
    //城市
    private String city;
    //县区
    private String district;
    //乡镇
    private String town;
    //详细地址
    private String addressDetail;
    //邮政编码
    private String zipcode;
    //收货人地址
    private String receiverName;
    //收货人电话
    private String receiverPhone;
    //收货人性别
    private int receiverSex;
    //调用的地图插件的坐标数据 ---这个是干嘛的?
    private String mapApiStr;
    //排序号
    private int addressOrder;
    //使用次数
    private int useNum;
    //创建时间
    private Date createTime;
    //创建用户id   ---这个地址除了用户自己创建还有谁？
    private String createUser;
    //修改时间   ---难道这就是商家修改的地方？他有这个能力吗
    private Date updateTime;
    //修改用户id
    private String updateUser;
    //是否是默认地址(1-默认地址/2-非默认)
    private int isDefault;

    public String getUaId() {
        return uaId;
    }

    public void setUaId(String uaId) {
        this.uaId = uaId;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public int getReceiverSex() {
        return receiverSex;
    }

    public void setReceiverSex(int receiverSex) {
        this.receiverSex = receiverSex;
    }

    public String getMapApiStr() {
        return mapApiStr;
    }

    public void setMapApiStr(String mapApiStr) {
        this.mapApiStr = mapApiStr;
    }

    public int getAddressOrder() {
        return addressOrder;
    }

    public void setAddressOrder(int addressOrder) {
        this.addressOrder = addressOrder;
    }

    public int getUseNum() {
        return useNum;
    }

    public void setUseNum(int useNum) {
        this.useNum = useNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }
}
