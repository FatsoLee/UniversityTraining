package service.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;

import entity.Users;
import service.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean userLogin(Users u) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		String hql = "";
		try {
//			System.out.println(u.getUid()+" "+u.getUsername()+" "+u.getPassword());
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "from Users where username=? and password=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPassword());
//			System.out.println(query.getQueryString());
			List list = query.list();
			tx.commit();	//提交事务
//			System.out.println("List Size:"+list.size());
			if(list.size()>0) {
//				System.out.println("true");
				return true;
			} else {
//				System.out.println("error");
				return false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

}
