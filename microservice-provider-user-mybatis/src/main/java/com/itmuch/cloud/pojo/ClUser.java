package com.itmuch.cloud.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户-账户表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-08-01 16:15:56
 *
 */
 public class ClUser implements Serializable {

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 
    */
    private String uuid;

    /**
    * 登录名
    */
    private String loginName;

    /**
    * 登录密码
    */
    private String loginPwd;

    /**
    * 登录密码修改时间
    */
    private Date loginPwdModifyTime;

    /**
    * 登录时间
    */
    private Date loginTime;

    /**
    * 注册时间
    */
    private Date registerTime;

    /**
    * 注册客户端
    */
    private String registerClient;

    /**
    * 交易密码
    */
    private String tradePwd;

    /**
    * 交易密码修改时间
    */
    private Date tradePwdModifyTime;

    /**
    * 邀请码
    */
    private String invitationCode;

    /**
    * 渠道
    */
    private Long channelId;

    /**
    * 代理等级 ，1一级，2二级，3普通用户
    */
    private String level;

    /**
    * 1有效，0无效，-1注销
    */
    private Integer state;

    /**
    * 备注
    */
    private String remark;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 创建时间
    */
    private Date createTime;


    /**
    * 获取主键Id
    *
    * @return id
    */
    public Long getId(){
        return id;
    }

    /**
    * 设置主键Id
    * 
    * @param id
    */
    public void setId(Long id){
        this.id = id;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getUuid(){
        return uuid;
    }

    /**
    * 设置
    * 
    * @param uuid 要设置的
    */
    public void setUuid(String uuid){
        this.uuid = uuid;
    }

    /**
    * 获取登录名
    *
    * @return 登录名
    */
    public String getLoginName(){
        return loginName;
    }

    /**
    * 设置登录名
    * 
    * @param loginName 要设置的登录名
    */
    public void setLoginName(String loginName){
        this.loginName = loginName;
    }

    /**
    * 获取登录密码
    *
    * @return 登录密码
    */
    public String getLoginPwd(){
        return loginPwd;
    }

    /**
    * 设置登录密码
    * 
    * @param loginPwd 要设置的登录密码
    */
    public void setLoginPwd(String loginPwd){
        this.loginPwd = loginPwd;
    }

    /**
    * 获取登录密码修改时间
    *
    * @return 登录密码修改时间
    */
    public Date getLoginPwdModifyTime(){
        return loginPwdModifyTime;
    }

    /**
    * 设置登录密码修改时间
    * 
    * @param loginPwdModifyTime 要设置的登录密码修改时间
    */
    public void setLoginPwdModifyTime(Date loginPwdModifyTime){
        this.loginPwdModifyTime = loginPwdModifyTime;
    }

    /**
    * 获取登录时间
    *
    * @return 登录时间
    */
    public Date getLoginTime(){
        return loginTime;
    }

    /**
    * 设置登录时间
    * 
    * @param loginTime 要设置的登录时间
    */
    public void setLoginTime(Date loginTime){
        this.loginTime = loginTime;
    }

    /**
    * 获取注册时间
    *
    * @return 注册时间
    */
    public Date getRegisterTime(){
        return registerTime;
    }

    /**
    * 设置注册时间
    * 
    * @param registerTime 要设置的注册时间
    */
    public void setRegisterTime(Date registerTime){
        this.registerTime = registerTime;
    }

    /**
    * 获取注册客户端
    *
    * @return 注册客户端
    */
    public String getRegisterClient(){
        return registerClient;
    }

    /**
    * 设置注册客户端
    * 
    * @param registerClient 要设置的注册客户端
    */
    public void setRegisterClient(String registerClient){
        this.registerClient = registerClient;
    }

    /**
    * 获取交易密码
    *
    * @return 交易密码
    */
    public String getTradePwd(){
        return tradePwd;
    }

    /**
    * 设置交易密码
    * 
    * @param tradePwd 要设置的交易密码
    */
    public void setTradePwd(String tradePwd){
        this.tradePwd = tradePwd;
    }

    /**
    * 获取交易密码修改时间
    *
    * @return 交易密码修改时间
    */
    public Date getTradePwdModifyTime(){
        return tradePwdModifyTime;
    }

    /**
    * 设置交易密码修改时间
    * 
    * @param tradePwdModifyTime 要设置的交易密码修改时间
    */
    public void setTradePwdModifyTime(Date tradePwdModifyTime){
        this.tradePwdModifyTime = tradePwdModifyTime;
    }

    /**
    * 获取邀请码
    *
    * @return 邀请码
    */
    public String getInvitationCode(){
        return invitationCode;
    }

    /**
    * 设置邀请码
    * 
    * @param invitationCode 要设置的邀请码
    */
    public void setInvitationCode(String invitationCode){
        this.invitationCode = invitationCode;
    }

    /**
    * 获取渠道
    *
    * @return 渠道
    */
    public Long getChannelId(){
        return channelId;
    }

    /**
    * 设置渠道
    * 
    * @param channelId 要设置的渠道
    */
    public void setChannelId(Long channelId){
        this.channelId = channelId;
    }

    /**
    * 获取代理等级 ，1一级，2二级，3普通用户
    *
    * @return 代理等级 ，1一级，2二级，3普通用户
    */
    public String getLevel(){
        return level;
    }

    /**
    * 设置代理等级 ，1一级，2二级，3普通用户
    * 
    * @param level 要设置的代理等级 ，1一级，2二级，3普通用户
    */
    public void setLevel(String level){
        this.level = level;
    }

    /**
    * 获取1有效，0无效，-1注销
    *
    * @return 1有效，0无效，-1注销
    */
    public Integer getState(){
        return state;
    }

    /**
    * 设置1有效，0无效，-1注销
    * 
    * @param state 要设置的1有效，0无效，-1注销
    */
    public void setState(Integer state){
        this.state = state;
    }

    /**
    * 获取备注
    *
    * @return 备注
    */
    public String getRemark(){
        return remark;
    }

    /**
    * 设置备注
    * 
    * @param remark 要设置的备注
    */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
    * 获取修改时间
    *
    * @return 修改时间
    */
    public Date getUpdateTime(){
        return updateTime;
    }

    /**
    * 设置修改时间
    * 
    * @param updateTime 要设置的修改时间
    */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
    * 获取创建时间
    *
    * @return 创建时间
    */
    public Date getCreateTime(){
        return createTime;
    }

    /**
    * 设置创建时间
    * 
    * @param createTime 要设置的创建时间
    */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

}
