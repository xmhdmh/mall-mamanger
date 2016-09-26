package com.mall.model.user;

/**
 * @ClassName: SysUserRole
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 上午10:09:49
 * 
 */
public class SysUserRole {
    private Long id;
    private Long userId;
    private Long roleId;
    
    /** 
     * @return id 
     */
    
    public Long getId() {
        return id;
    }
    /** 
     * @param id 要设置的 id 
     */
    
    public void setId(Long id) {
        this.id = id;
    }
    /** 
     * @return userId 
     */
    
    public Long getUserId() {
        return userId;
    }
    /** 
     * @param userId 要设置的 userId 
     */
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /** 
     * @return roleId 
     */
    
    public Long getRoleId() {
        return roleId;
    }
    /** 
     * @param roleId 要设置的 roleId 
     */
    
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    
}
