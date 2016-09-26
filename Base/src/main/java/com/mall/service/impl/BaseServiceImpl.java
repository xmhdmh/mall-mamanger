/**   
* @Title: BaseServiceImpl.java
* @Package com.mall.service.impl.comm
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月9日 下午1:17:52
* @version V1.0   
*/


package com.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.dao.user.SysPermissionMapper;
import com.mall.dao.user.SysRoleMapper;
import com.mall.dao.user.SysRolePermissionMapper;
import com.mall.dao.user.SysUserRoleMapper;
import com.mall.dao.user.UserInfoMapper;

/**
 * @ClassName: BaseServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午1:17:52
 * 
 */
@Service
public class BaseServiceImpl {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;
    @Autowired
    private SysPermissionMapper sysPermissionMapper;
    
    /** 
     * @return sysUserRoleMapper 
     */
    
    public SysUserRoleMapper getSysUserRoleMapper() {
        return sysUserRoleMapper;
    }
    /** 
     * @param sysUserRoleMapper 要设置的 sysUserRoleMapper 
     */
    
    public void setSysUserRoleMapper(SysUserRoleMapper sysUserRoleMapper) {
        this.sysUserRoleMapper = sysUserRoleMapper;
    }
    /** 
     * @return sysRoleMapper 
     */
    
    public SysRoleMapper getSysRoleMapper() {
        return sysRoleMapper;
    }
    /** 
     * @param sysRoleMapper 要设置的 sysRoleMapper 
     */
    
    public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
        this.sysRoleMapper = sysRoleMapper;
    }
    /** 
     * @return sysRolePermissionMapper 
     */
    
    public SysRolePermissionMapper getSysRolePermissionMapper() {
        return sysRolePermissionMapper;
    }
    /** 
     * @param sysRolePermissionMapper 要设置的 sysRolePermissionMapper 
     */
    
    public void setSysRolePermissionMapper(
            SysRolePermissionMapper sysRolePermissionMapper) {
        this.sysRolePermissionMapper = sysRolePermissionMapper;
    }
    /** 
     * @return sysPermissionMapper 
     */
    
    public SysPermissionMapper getSysPermissionMapper() {
        return sysPermissionMapper;
    }
    /** 
     * @param sysPermissionMapper 要设置的 sysPermissionMapper 
     */
    
    public void setSysPermissionMapper(SysPermissionMapper sysPermissionMapper) {
        this.sysPermissionMapper = sysPermissionMapper;
    }
    /** 
     * @return tAdsCategoryMapper 
     */
    
    /** 
     * @return userInfoMapper 
     */
    
    public UserInfoMapper getUserInfoMapper() {
        return userInfoMapper;
    }
    /** 
     * @param userInfoMapper 要设置的 userInfoMapper 
     */
    
    public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }
    
    
}
