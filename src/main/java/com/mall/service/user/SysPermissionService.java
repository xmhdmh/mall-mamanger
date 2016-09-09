/**   
* @Title: SysPermissionService.java
* @Package com.mall.service.user
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月9日 下午1:50:13
* @version V1.0   
*/


package com.mall.service.user;

import java.util.List;

import com.mall.model.user.SysPermission;


/**
 * @ClassName: SysPermissionService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午1:50:13
 * 
 */

public interface SysPermissionService {
    /**
     * 根据角色ID获取权限列表
    * @Title: findByRolePermission 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param roleId
    * @param @return    设定文件 
    * @return List<SysPermission>    返回类型 
    * @throws
     */
    public List<SysPermission> findByRolePermission(Long roleId);
}
