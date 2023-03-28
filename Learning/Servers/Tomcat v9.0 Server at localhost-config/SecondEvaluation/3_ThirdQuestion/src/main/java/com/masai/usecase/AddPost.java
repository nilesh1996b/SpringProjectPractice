package com.masai.usecase;

import java.util.Date;

import com.masai.dao.TimelineDAO;
import com.masai.dao.TimelineDAOImpl;
import com.masai.model.Post;
import com.masai.model.Tag;

public class AddPost {

	public static void main(String[] args) {
		
		TimelineDAO dao = new TimelineDAOImpl();
		
		Post post = new Post();
		post.setTitle("T1");
		post.setDescription("D1");
		post.setLastUpdatedAt(new Date("2011-08-08"));
		post.setPostedAt(new Date("2010-02-02"));
		
		Tag tag = new Tag();
		tag.setTagName("tg1");
		tag.setTagName("TN1");
		
		tag.getPost().add(post);
		post.getTags().add(tag);
		
		post.setTags(null);
		
		dao.addPost(post);

	}

}
