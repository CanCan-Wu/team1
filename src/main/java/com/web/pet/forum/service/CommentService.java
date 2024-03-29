package com.web.pet.forum.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import com.web.pet.forum.dao.CommentDao;
import com.web.pet.forum.model.Comment;

@EnableTransactionManagement
@Transactional
@Service
public class CommentService {
	
	@Autowired
	CommentDao dao;	
	
	public int saveComment(Comment comment) {//新增一則留言
		return dao.saveComment(comment);
	}	
	
	public List<Comment> getAllComments(String hql) {//依hql條件取得所有留言			
		 List<Comment> list = dao.getAllComments(hql);		
		return list;
	}	

	public Comment getComment(Integer commentId) {//取得一則留言		
		 Comment comment = dao.getComment(commentId);
		return comment;		
	}
	
	public int modifyComment(Comment comment) {//修改留言
		return dao.modifyComment(comment);
	}
	
	public List<Comment> getCommentByPosterUid(String posterUid){//按posterUid找留言
		List<Comment> list = dao.getCommentByPosterUid(posterUid);
		return list;
	}
	

	
}
