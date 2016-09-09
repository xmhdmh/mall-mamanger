package com.mall.model.user;

/**
 * @ClassName: SysRolePermission
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 上午10:12:14
 * 
 */
public class SysRolePermission {
    private Long id;
    private Long roleId;
    private Long permissionId;
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
    /** 
     * @return permissionId 
     */
    
    public Long getPermissionId() {
        return permissionId;
    }
    /** 
     * @param permissionId 要设置的 permissionId 
     */
    
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
    
}
