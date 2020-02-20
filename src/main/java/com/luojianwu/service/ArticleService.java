package com.luojianwu.service;

import java.util.List;

import com.luojianwu.pojo.Article;
import com.luojianwu.pojo.Condations;

public interface ArticleService {

	List<Article> list(String condition, Condations con);

}
