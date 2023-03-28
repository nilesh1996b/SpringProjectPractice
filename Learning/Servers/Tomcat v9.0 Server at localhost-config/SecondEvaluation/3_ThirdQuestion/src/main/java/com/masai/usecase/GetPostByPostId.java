package com.masai.usecase;

import com.masai.dao.TimelineDAO;
import com.masai.dao.TimelineDAOImpl;
import com.masai.exception.PostNotFoundException;
import com.masai.model.Post;

public class GetPostByPostId {

	public static void main(String[] args) {
		
		TimelineDAO dao = new TimelineDAOImpl();
		
		try {
			Post post = dao.getPost(1);
			System.out.println(post);
		} catch (PostNotFoundException e) {
			System.out.println(e);
		}

	}

}
