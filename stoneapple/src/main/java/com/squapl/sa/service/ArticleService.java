package com.squapl.sa.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.squapl.sa.domain.Article;

public interface ArticleService {

	Iterable<Article> findAll();
	
	Article	findOne(Long id);
	
	Article create(Article article);
	
	Article update(Article article);
	
	void delete(Long id);
	
	void evictCache();
	
	Article findbyTitle(Long id);

	Page<Article> listAllByPage(Pageable pageable);
	
}
