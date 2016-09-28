/**   
* @Title: AdsController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月28日 下午3:26:42
* @version V1.0   
*/


package com.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: AdsController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月28日 下午3:26:42
 * 
 */
@Controller
@RequestMapping("/image")
public class ImageController extends BaseController{
    /**
     * 广告列表
    * @Title: index 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/adsList")
    public String adsList(){
        return "/adsList";
    }
}
