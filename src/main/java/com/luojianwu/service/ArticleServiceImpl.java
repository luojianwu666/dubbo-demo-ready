package com.luojianwu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luojianwu.dao.ArticleDao;
import com.luojianwu.pojo.Article;
import com.luojianwu.pojo.Condations;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> list(String condition,Condations con) {
		// TODO Auto-generated method stub
		return articleDao.list(condition,con);
	}
}
