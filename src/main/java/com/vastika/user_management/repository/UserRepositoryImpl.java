package com.vastika.user_management.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.user_management.model.User;
import com.vastika.user_management.util.HibernateUtil;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.save(user);

	}

	@Override
	public void updateUser(User user) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.update(user);

	}

	@Override
	public void deleteUser(int id) {
		
		User user = getUser(id);
		if(user!=null) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.delete(user);
		}

	}

	@Override
	public User getUser(int id) {
		Session session = HibernateUtil.getSession(sessionFactory);
		return (User) session.get(User.class, id);

	}

	@Override
	public List<User> getAllUser() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();
	}
}
