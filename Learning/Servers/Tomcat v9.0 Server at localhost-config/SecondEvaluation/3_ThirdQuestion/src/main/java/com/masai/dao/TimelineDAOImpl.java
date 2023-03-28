package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.masai.exception.PostNotFoundException;
import com.masai.exception.TagNotFoundException;
import com.masai.model.Post;
import com.masai.model.Tag;

public class TimelineDAOImpl implements TimelineDAO {

	@Override
	public void addPost(Post post) {
		
		EntityManager em = EMUtil.conn();
		
		Post p1 = new Post();
		p1.setTitle(post.getTitle());
		p1.setDescription(post.getDescription());
		p1.setPostedAt(post.getPostedAt());
		p1.setLastUpdatedAt(post.getLastUpdatedAt());
		
		p1.setTags(post.getTags());
		
		em.getTransaction().begin();
		em.persist(p1);
		System.out.println("Added");
		em.getTransaction().commit();;
		em.close();
	}

	@Override
	public Post getPost(int postId) throws PostNotFoundException {
		EntityManager em = EMUtil.conn();
		
		Post post = em.find(Post.class, postId);
		
		if(post==null) throw new PostNotFoundException("There is no Post");
		
		return post;
	}

	@Override
	public Tag getTags(int tagId) throws TagNotFoundException {
		EntityManager em = EMUtil.conn();
		
		Tag tag = em.find(Tag.class, tagId);
		
		if(tag==null) throw new TagNotFoundException("There is no Post");
		
		return tag;
	}


}
