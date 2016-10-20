package com.mall.model.user;
/**
 * 
* @ClassName: UserInfo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 庄友权
* @date 2016年9月9日 上午10:28:36
*
 */
public class UserInfo{
    private Long id;// 用户id;
    private String username;// 账号.
    private String name;// 名称（昵称或者真实姓名，不同系统不同定义）
    private String password; // 密码;
    private String salt;// 加密密码的盐
    private byte state;// 用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 ,
                       // 1:正常状态,2：用户被锁定.
    private String email;//邮箱
    private String phone;//电话
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }
    
    /**
     * 密码盐.
     * 
     * @return
     */
    public String getCredentialsSalt() {
        return this.username + this.salt;
    }
}
