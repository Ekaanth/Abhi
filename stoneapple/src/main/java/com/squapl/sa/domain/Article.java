package com.squapl.sa.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Article {
	
	@Id
	@GeneratedValue
	private long   article_id;
	private String article_heading;
	private String article_meta_desc;
	private String article_cover_img;
	private String article_img_url;
	private String article_tag;
	private String article_body;
	private String article_status;
	private String read_time;
	private String related_blog_tags;
	private String h_2;
	private String domain;
	private String article_bitly;
	private long created_by;
	private Date published_timestamp;
	
	public long getArticle_id() {
		return article_id;
	}
	public void setArticle_id(long article_id) {
		this.article_id = article_id;
	}
	public String getArticle_heading() {
		return article_heading;
	}
	public void setArticle_heading(String article_heading) {
		this.article_heading = article_heading;
	}
	public String getArticle_meta_desc() {
		return article_meta_desc;
	}
	public void setArticle_meta_desc(String article_meta_desc) {
		this.article_meta_desc = article_meta_desc;
	}
	public String getArticle_cover_img() {
		return article_cover_img;
	}
	public void setArticle_cover_img(String article_cover_img) {
		this.article_cover_img = article_cover_img;
	}
	public String getArticle_img_url() {
		return article_img_url;
	}
	public void setArticle_img_url(String article_img_url) {
		this.article_img_url = article_img_url;
	}
	public String getArticle_tag() {
		return article_tag;
	}
	public void setArticle_tag(String article_tag) {
		this.article_tag = article_tag;
	}
	public String getArticle_body() {
		return article_body;
	}
	public void setArticle_body(String article_body) {
		this.article_body = article_body;
	}
	public String getArticle_status() {
		return article_status;
	}
	public void setArticle_status(String article_status) {
		this.article_status = article_status;
	}
	public String getRead_time() {
		return read_time;
	}
	public void setRead_time(String read_time) {
		this.read_time = read_time;
	}
	public String getRelated_blog_tags() {
		return related_blog_tags;
	}
	public void setRelated_blog_tags(String related_blog_tags) {
		this.related_blog_tags = related_blog_tags;
	}
	public String getH_2() {
		return h_2;
	}
	public void setH_2(String h_2) {
		this.h_2 = h_2;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getArticle_bitly() {
		return article_bitly;
	}
	public void setArticle_bitly(String article_bitly) {
		this.article_bitly = article_bitly;
	}
	public long getCreated_by() {
		return created_by;
	}
	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}
	public Date getPublished_timestamp() {
		return published_timestamp;
	}
	public void setPublished_timestamp(Date published_timestamp) {
		this.published_timestamp = published_timestamp;
	}
	
	
	public Article(long article_id, String article_heading, String article_meta_desc, String article_cover_img,
			String article_img_url, String article_tag, String article_body, String article_status, String read_time,
			String related_blog_tags, String h_2, String domain, String article_bitly, long created_by,
			Date published_timestamp) {

		this.article_id = article_id;
		this.article_heading = article_heading;
		this.article_meta_desc = article_meta_desc;
		this.article_cover_img = article_cover_img;
		this.article_img_url = article_img_url;
		this.article_tag = article_tag;
		this.article_body = article_body;
		this.article_status = article_status;
		this.read_time = read_time;
		this.related_blog_tags = related_blog_tags;
		this.h_2 = h_2;
		this.domain = domain;
		this.article_bitly = article_bitly;
		this.created_by = created_by;
		this.published_timestamp = published_timestamp;
	}
	
	public Article()
	{
		super();
	}
	
	
	@Override
	public String toString() {
		return "Article [article_id=" + article_id + ", article_heading=" + article_heading + ", article_meta_desc="
				+ article_meta_desc + ", article_cover_img=" + article_cover_img + ", article_img_url="
				+ article_img_url + ", article_tag=" + article_tag + ", article_body=" + article_body
				+ ", article_status=" + article_status + ", read_time=" + read_time + ", related_blog_tags="
				+ related_blog_tags + ", h_2=" + h_2 + ", domain=" + domain + ", article_bitly=" + article_bitly
				+ ", created_by=" + created_by + ", published_timestamp=" + published_timestamp + "]";
	}
	
	
	
}

