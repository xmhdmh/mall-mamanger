/**   
* @Title: ProductController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月28日 下午3:37:17
* @version V1.0   
*/


package com.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ProductController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月28日 下午3:37:17
 * 
 */
@Controller
@RequestMapping("/product")
public class ProductController extends BaseController{
    /**
     * 产品添加
    * @Title: productAdd 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/productAdd")
    public String productAdd(){
        return "/productAdd";
    }
    /**
     * 产品分类列表
    * @Title: categoryList 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/categoryList")
    public String categoryList(){
        return "/categoryList";
    }
    /**
     * 产品列表
    * @Title: productList 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/productsList")
    public String productList(){
        return "/productsList";
    }
    /**
     * 品牌列表
    * @Title: brandIndex 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/brandList")
    public String brandList(){
        return "/brandList";
    }
}
