package com.masai.usecase;

import com.masai.dao.TimelineDAO;
import com.masai.dao.TimelineDAOImpl;
import com.masai.exception.PostNotFoundException;
import com.masai.exception.TagNotFoundException;
import com.masai.model.Post;
import com.masai.model.Tag;

public class GetTagByPostId2 {

	public static void main(String[] args) {
		
		TimelineDAO dao = new TimelineDAOImpl();
		
		try {
			Tag tag = dao.getTags(5);
			System.out.println(tag);
		} catch (TagNotFoundException e) {
			System.out.println(e);
		}

	}

}
