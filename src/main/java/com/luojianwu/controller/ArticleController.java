package com.luojianwu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luojianwu.pojo.Article;
import com.luojianwu.pojo.Condations;
import com.luojianwu.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(Model model,String condition,Condations con) {
		//PageHelper.startPage(pageNum, pageSize);
		
		List<Article> articleList = articleService.list(condition,con);
		/*PageInfo pageInfo = new PageInfo(articleList);
		model.addAttribute("pageInfo", pageInfo);*/
		model.addAttribute("condition", condition);
		model.addAttribute("articleList", articleList);
		return "list";
	}
}
