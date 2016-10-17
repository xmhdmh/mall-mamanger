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

import com.mall.dao.article.ArticleMapper;
import com.mall.dao.article.ArticleMessageMapper;
import com.mall.dao.category.CategoryRelationMapper;
import com.mall.dao.orders.OrdersMapper;
import com.mall.dao.product.ProductBrandRelationMapper;
import com.mall.dao.product.ProductMapper;
import com.mall.dao.product.ProductOrderRelationMapper;
import com.mall.dao.shop.ShopMapper;
import com.mall.dao.system.SysAreaMapper;
import com.mall.dao.system.SysDicMapper;
import com.mall.dao.system.SysLogMapper;
import com.mall.dao.system.SysSequencesMapper;
import com.mall.dao.user.SysPermissionMapper;
import com.mall.dao.user.SysRoleMapper;
import com.mall.dao.user.SysRolePermissionMapper;
import com.mall.dao.user.SysUserRoleMapper;
import com.mall.dao.user.UserInfoMapper;
import com.mall.dao.user.UserShopRlationMapper;

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
    @Autowired
    private SysLogMapper sysLogMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleMessageMapper articleMessageMapper;
    @Autowired
    private CategoryRelationMapper categoryRelationMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private ProductBrandRelationMapper productBrandRelationMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductOrderRelationMapper productOrderRelationMapper;
    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private SysAreaMapper sysAreaMapper;
    @Autowired
    private SysDicMapper sysDicMapper;
    @Autowired
    private SysSequencesMapper sysSequencesMapper;
    @Autowired
    private UserShopRlationMapper userShopRlationMapper;
    
    public ArticleMapper getArticleMapper() {
        return articleMapper;
    }
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }
    public ArticleMessageMapper getArticleMessageMapper() {
        return articleMessageMapper;
    }
    public void setArticleMessageMapper(ArticleMessageMapper articleMessageMapper) {
        this.articleMessageMapper = articleMessageMapper;
    }
    public CategoryRelationMapper getCategoryRelationMapper() {
        return categoryRelationMapper;
    }
    public void setCategoryRelationMapper(CategoryRelationMapper categoryRelationMapper) {
        this.categoryRelationMapper = categoryRelationMapper;
    }
    public OrdersMapper getOrdersMapper() {
        return ordersMapper;
    }
    public void setOrdersMapper(OrdersMapper ordersMapper) {
        this.ordersMapper = ordersMapper;
    }
    public ProductBrandRelationMapper getProductBrandRelationMapper() {
        return productBrandRelationMapper;
    }
    public void setProductBrandRelationMapper(ProductBrandRelationMapper productBrandRelationMapper) {
        this.productBrandRelationMapper = productBrandRelationMapper;
    }
    public ProductMapper getProductMapper() {
        return productMapper;
    }
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
    public ProductOrderRelationMapper getProductOrderRelationMapper() {
        return productOrderRelationMapper;
    }
    public void setProductOrderRelationMapper(ProductOrderRelationMapper productOrderRelationMapper) {
        this.productOrderRelationMapper = productOrderRelationMapper;
    }
    public ShopMapper getShopMapper() {
        return shopMapper;
    }
    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }
    public SysAreaMapper getSysAreaMapper() {
        return sysAreaMapper;
    }
    public void setSysAreaMapper(SysAreaMapper sysAreaMapper) {
        this.sysAreaMapper = sysAreaMapper;
    }
    public SysDicMapper getSysDicMapper() {
        return sysDicMapper;
    }
    public void setSysDicMapper(SysDicMapper sysDicMapper) {
        this.sysDicMapper = sysDicMapper;
    }
    public SysSequencesMapper getSysSequencesMapper() {
        return sysSequencesMapper;
    }
    public void setSysSequencesMapper(SysSequencesMapper sysSequencesMapper) {
        this.sysSequencesMapper = sysSequencesMapper;
    }
    public UserShopRlationMapper getUserShopRlationMapper() {
        return userShopRlationMapper;
    }
    public void setUserShopRlationMapper(UserShopRlationMapper userShopRlationMapper) {
        this.userShopRlationMapper = userShopRlationMapper;
    }
    public SysLogMapper getSysLogMapper() {
		return sysLogMapper;
	}
	public void setSysLogMapper(SysLogMapper sysLogMapper) {
		this.sysLogMapper = sysLogMapper;
	}
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
