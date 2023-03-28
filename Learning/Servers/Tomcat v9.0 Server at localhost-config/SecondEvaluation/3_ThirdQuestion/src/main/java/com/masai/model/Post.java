package com.masai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postId;
	private String title;
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date postedAt;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date lastUpdatedAt;

	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Tag> tags = new ArrayList<Tag>();


	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getPostedAt() {
		return postedAt;
	}


	public void setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
	}


	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}


	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}


	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", description=" + description + ", postedAt=" + postedAt
				+ ", lastUpdatedAt=" + lastUpdatedAt + ", tags=" + tags + "]";
	}
	
	
}
