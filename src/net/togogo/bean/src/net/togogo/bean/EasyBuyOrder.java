package net.togogo.bean.src.net.togogo.bean;

import java.util.Date;

public class EasyBuyOrder {
    private int id;
    private int userId;
    private String loginName;
    private String userAddress;
    private Date creatTime;
    private float cost;
    private String serialNumber;

    public EasyBuyOrder(int id, int userId, String loginName, String userAddress, Date creatTime, float cost, String serialNumber) {
        this.id = id;
        this.userId = userId;
        this.loginName = loginName;
        this.userAddress = userAddress;
        this.creatTime = creatTime;
        this.cost = cost;
        this.serialNumber = serialNumber;
    }

    public EasyBuyOrder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "EasyBuyOrder{" +
                "id=" + id +
                ", userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", creatTime=" + creatTime +
                ", cost=" + cost +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
