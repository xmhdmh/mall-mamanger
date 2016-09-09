/**   
* @Title: SysPermissionServiceImpl.java
* @Package com.mall.service.impl.user
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月9日 下午2:10:48
* @version V1.0   
*/


package com.mall.service.impl.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mall.model.user.SysPermission;
import com.mall.model.user.SysRolePermission;
import com.mall.service.impl.comm.BaseServiceImpl;
import com.mall.service.user.SysPermissionService;

/**
 * @ClassName: SysPermissionServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午2:10:48
 * 
 */
@Service
public class SysPermissionServiceImpl extends BaseServiceImpl implements SysPermissionService{

    /* (非 Javadoc) 
    * <p>Title: findByRolePermission</p> 
    * <p>Description: </p> 
    * @param roleId
    * @return 
    * @see com.mall.service.user.SysPermissionService#findByRolePermission(java.lang.Long) 
    */ 
    
    
    @Override
    public List<SysPermission> findByRolePermission(Long roleId) {
        // TODO Auto-generated method stub
        SysRolePermission model=new SysRolePermission();
        model.setRoleId(roleId);
        List<SysRolePermission> sysRolePermissions=super.getSysRolePermissionMapper().query(model);
        List<SysPermission> list=new ArrayList<SysPermission>();
        for (SysRolePermission sysRolePermission : sysRolePermissions) {
            SysPermission sysPermission=super.getSysPermissionMapper().selectByPrimaryKey(sysRolePermission.getPermissionId());
            list.add(sysPermission);
        }
        return list;
    }

}
