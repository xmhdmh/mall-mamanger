/**   
* @Title: SysRoleService.java
* @Package com.mall.service.user
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月9日 下午1:50:01
* @version V1.0   
*/
package com.mall.service.user;
import java.util.List;
import com.mall.model.user.SysRole;
import com.mall.service.BaseService;

/**
 * @ClassName: SysRoleService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午1:50:01
 * 
 */

public interface SysRoleService extends BaseService<SysRole>{
    /**
     * 根据用户id获取角色列表
    * @Title: findByUserRole 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param id
    * @param @return    设定文件 
    * @return List<SysRole>    返回类型 
    * @throws
     */
    public List<SysRole> findByUserRole(Long userId);

}
