package com.luojianwu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.luojianwu.pojo.Article;
import com.luojianwu.pojo.Condations;

public interface ArticleDao {

	
	List<Article> list(@Param("condition")String condition, @Param("con")Condations con);

}
