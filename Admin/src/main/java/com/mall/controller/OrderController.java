/**   
* @Title: OrderController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月28日 下午4:20:05
* @version V1.0   
*/


package com.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: OrderController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月28日 下午4:20:05
 * 
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController{
    /**
     * 订单管理
    * @Title: orderForm 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/orderForm")
    public String orderForm(){
        return "/orderForm";
    }
}
