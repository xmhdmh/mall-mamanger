package com.mall.model.user;

import java.util.Date;

public class UserDetail {
    private Long id;

    private String nickName;

    private Date birthday;

    private String sex;

    private String qq;
    
    private String avatarFile;
    
    private String homeAddre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

	public String getAvatarFile() {
		return avatarFile;
	}

	public void setAvatarFile(String avatarFile) {
		this.avatarFile = avatarFile;
	}

	public String getHomeAddre() {
		return homeAddre;
	}

	public void setHomeAddre(String homeAddre) {
		this.homeAddre = homeAddre;
	}


    
    
}