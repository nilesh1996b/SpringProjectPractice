package com.masai.dao;

import java.util.Date;
import java.util.List;

import com.masai.exception.PostNotFoundException;
import com.masai.exception.TagNotFoundException;
import com.masai.model.Post;
import com.masai.model.Tag;

public interface TimelineDAO {
	
	public void addPost(Post post); 
	public Post getPost(int postId) throws PostNotFoundException; 
	
	public Tag getTags(int tagId) throws TagNotFoundException; 

}
