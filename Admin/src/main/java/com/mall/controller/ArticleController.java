/**   
* @Title: ArticleController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月28日 下午4:21:48
* @version V1.0   
*/
package com.mall.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.mall.model.article.Article;

/**
 * @ClassName: ArticleController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月28日 下午4:21:48
 * 
 */
@Controller
@RequestMapping("/article")
public class ArticleController extends BaseController{


	@RequestMapping("/query")
	public String query(Article param,@RequestParam(defaultValue="1") Integer currentPage,@RequestParam(defaultValue="10") Integer pageSize,ModelMap map){
		 PageHelper.startPage(currentPage,pageSize);
		 return "/article/main";
	}
}
