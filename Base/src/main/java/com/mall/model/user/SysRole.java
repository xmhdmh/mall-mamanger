package com.mall.model.user;

/**
 * 
* @ClassName: SysRole
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 庄友权
* @date 2016年9月9日 上午9:57:53
*
 */
public class SysRole{
    private Long id; // 编号
    private String role; // 角色标识程序中判断使用,如"admin",这个是唯一的:
    private String description; // 角色描述,UI界面显示使用
    private Boolean available;// 是否可用,如果不可用将不会添加给用户

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
