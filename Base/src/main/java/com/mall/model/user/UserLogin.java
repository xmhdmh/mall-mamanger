package com.mall.model.user;

import java.util.Date;

/**
 * 
* @ClassName: UserLogin
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 庄友权
* @date 2016年9月9日 上午10:28:36
*
 */
public class UserLogin{
    private Long id;// 用户id;
    private String userName;// 账号.
    private String password; // 密码;
    private String salt;// 加密密码的盐
    private byte state;// 用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 ,
                       // 1:正常状态,2：用户被锁定.
    private String email;//邮箱
    private String phone;//电话
    private Date lastLoginTime;
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
        return this.userName + this.salt;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
    
}
