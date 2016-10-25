/**   
* @Title: SysRoleServiceImpl.java
* @Package com.mall.service.impl.user
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月9日 下午2:10:37
* @version V1.0   
*/


package com.mall.service.impl.user;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.model.user.SysRole;
import com.mall.model.user.SysUserRole;
import com.mall.model.user.UserLogin;
import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.user.SysRoleService;

/**
 * @ClassName: SysRoleServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午2:10:37
 * 
 */
@Service
@Transactional
public class SysRoleServiceImpl extends BaseServiceImpl implements SysRoleService{

    /* (非 Javadoc) 
    * <p>Title: findByUserRole</p> 
    * <p>Description: </p> 
    * @param id
    * @return 
    * @see com.mall.service.user.SysRoleService#findByUserRole(java.lang.Long) 
    */ 
    @Override
    public List<SysRole> findByUserRole(Long userId) {
        SysUserRole model=new SysUserRole();
        model.setUserId(userId);
        List<SysUserRole> sysUserRoles=super.getSysUserRoleMapper().query(model);
        List<SysRole> list=new ArrayList<SysRole>();
        for (SysUserRole sysUserRole : sysUserRoles) {
            SysRole sysRole=super.getSysRoleMapper().findById(sysUserRole.getRoleId());
            list.add(sysRole);
        }
        return list;
    }

	@Override
	public List<SysRole> query(SysRole param) {
		return super.getSysRoleMapper().query(param);
	}

	@Override
	public Integer update(SysRole param) {
		return super.getSysRoleMapper().update(param);
	}

	@Override
	public Integer delete(Long id) {
		return super.getSysRoleMapper().delete(id);
	}

	@Override
	public Integer insert(SysRole param) {
		Integer result=0;
		SysRole role=super.getSysRoleMapper().findByName(param.getRole());
		if(role!=null){
			result=-1;
		}else{
	        Subject currentUser = SecurityUtils.getSubject(); 
	        Session session = currentUser.getSession();
	        UserLogin userLogin=(UserLogin) session.getAttribute("userLogin");
	        param.setCreatedBy(userLogin.getId());
			result=super.getSysRoleMapper().insert(param);
		}
		return result;
	}

    @Override
    public SysRole findById(Long id) {
        // TODO Auto-generated method stub
        return super.getSysRoleMapper().findById(id);
    }
}
