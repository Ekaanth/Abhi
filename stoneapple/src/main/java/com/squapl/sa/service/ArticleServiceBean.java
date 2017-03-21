package com.squapl.sa.service;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Article;
import com.squapl.sa.domain.ArticleRepository;

@Service	
public class ArticleServiceBean implements ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@Override
	//@Cacheable(value="articles")
	public Iterable <Article> findAll() {
		Iterable<Article> articles = articleRepository.findAll();
		System.out.println("findAll is running..."  );
		return articles;
	}
	
	@Override
	@Cacheable(value="articles", key="#id")
	public Article findOne(Long id) {
		Article article = articleRepository.findOne(id);
		//slowQuery(2000L);
		System.out.println("findByDirector is running..." + article.toString()  );
		return article;
	}
	private void slowQuery(long seconds){
	    try {
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
	}
	@Override

	@Cacheable(value="articles")
	public Article create(Article article) {
		
		Article savedArticle = articleRepository.save(article);
		return savedArticle;
	}
	
	@Override

	@Cacheable(value="articles")
	public Article update (Article article) {
		Article articlePersisted = findOne(article.getArticle_id());
		if(articlePersisted == null) {
			//cannot update Article that hasn't been persisted
			return null;
		}
		Article updatedArticle = articleRepository.save(article);
		return updatedArticle;
	}
	
	@Override
	@CacheEvict(value="articles")
	public void delete(Long id) {
		articleRepository.delete(id);
	}
	
	
	@Override
	@CacheEvict(value="articles", allEntries=true)
	public void evictCache() {
		
	}

	@Override
	public Article findbyTitle(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Article> listAllByPage(Pageable pageable) {
		return articleRepository.findAll(pageable);
	}

}
