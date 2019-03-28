package io.renren.orderManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description: 用户信息表(根据1.1建立)
 * @author: 么红帅
 * @date: 2019/3/28 16:34
 */
@Entity
public class UserInfo {
    @Id
    //用户信息表主键
    private String userInfoId;
    //用户名
    private String userInfoName;
    //昵称
    private String userInfoNickname;
    //手机号
    private String userInfoPhoneNum;
    //邮箱
    private String userInfoEmail;
    //邮箱验证码
    private String emailCheckCode;
    //邮箱是否验证
    private boolean emailCheck;
    //用户头像
    private String headIcon;
    //用户的个性描述
    private String personalityDescription;
    //密码
    private String userPwd;
    //密码秘钥
    private String pwdSecret;
    //用户等级
    private int userGrade;
    //用户类型（关联字典表）
    private int userType;
    //用户注册时间
    private Date createTime;
    //上次登录时间
    private Date lastLoginTime;
    //登录天数
    private int loginTimes;
    //上次操作id
    private String lastOperationIp;
    //上次操作时间
    private Date lastOperationTime;
    //上次修改密码时间
    private Date lastChangePwdTime;
    //用户账户锁定
    private boolean userLock;
    //用户token票据
    private String userToken;
    //备用字段
    private String field1;
    //备用字段
    private String field2;
    //备用字段
    private String field3;
    //备用字段
    private String field4;
    //备用字段
    private String field5;

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserInfoName() {
        return userInfoName;
    }

    public void setUserInfoName(String userInfoName) {
        this.userInfoName = userInfoName;
    }

    public String getUserInfoNickname() {
        return userInfoNickname;
    }

    public void setUserInfoNickname(String userInfoNickname) {
        this.userInfoNickname = userInfoNickname;
    }

    public String getUserInfoPhoneNum() {
        return userInfoPhoneNum;
    }

    public void setUserInfoPhoneNum(String userInfoPhoneNum) {
        this.userInfoPhoneNum = userInfoPhoneNum;
    }

    public String getUserInfoEmail() {
        return userInfoEmail;
    }

    public void setUserInfoEmail(String userInfoEmail) {
        this.userInfoEmail = userInfoEmail;
    }

    public String getEmailCheckCode() {
        return emailCheckCode;
    }

    public void setEmailCheckCode(String emailCheckCode) {
        this.emailCheckCode = emailCheckCode;
    }

    public boolean isEmailCheck() {
        return emailCheck;
    }

    public void setEmailCheck(boolean emailCheck) {
        this.emailCheck = emailCheck;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getPersonalityDescription() {
        return personalityDescription;
    }

    public void setPersonalityDescription(String personalityDescription) {
        this.personalityDescription = personalityDescription;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getPwdSecret() {
        return pwdSecret;
    }

    public void setPwdSecret(String pwdSecret) {
        this.pwdSecret = pwdSecret;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getLastOperationIp() {
        return lastOperationIp;
    }

    public void setLastOperationIp(String lastOperationIp) {
        this.lastOperationIp = lastOperationIp;
    }

    public Date getLastOperationTime() {
        return lastOperationTime;
    }

    public void setLastOperationTime(Date lastOperationTime) {
        this.lastOperationTime = lastOperationTime;
    }

    public Date getLastChangePwdTime() {
        return lastChangePwdTime;
    }

    public void setLastChangePwdTime(Date lastChangePwdTime) {
        this.lastChangePwdTime = lastChangePwdTime;
    }

    public boolean isUserLock() {
        return userLock;
    }

    public void setUserLock(boolean userLock) {
        this.userLock = userLock;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }
}
