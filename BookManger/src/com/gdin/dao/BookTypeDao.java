package com.gdin.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.gdin.model.BookType;
import com.gdin.util.StringUtil;

public class BookTypeDao {

	public int bookTypeAdd(Connection con,BookType bookType) throws Exception{
		String sql="insert into t_bookType values(null,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		return pstmt.executeUpdate();
	}
	
	public ResultSet bookTypeList(Connection con,BookType bookType) throws Exception{
		/*
		 * �㷨����BookType��Ϊ�յ�ʱ�򣬼����ѯ����
		 */
		StringBuffer sb=new StringBuffer("select * from t_bookType");
		if(StringUtil.isNotEmpty(bookType.getBookTypeName())){
			sb.append(" and bookTypeName like '%"+bookType.getBookTypeName()+"%'");
		}
		PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
		
		/*
		 * �洢����--��ѯ
		 */
//		CallableStatement cstmt = con.prepareCall("{call inquiry_booktype(?)}");
//		cstmt.setString(1, bookType.getBookTypeName());
//		return cstmt.executeQuery();
	}
	
	public int bookTypeDelete(Connection con,String id)throws Exception{
		String sql="delete from t_bookType where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, id);
		return pstmt.executeUpdate();
		
		/*
		 * �洢����--ɾ��(�漰�������)
		 */
//		CallableStatement cstmt = con.prepareCall("{call delete_booktype(?)}");
//		cstmt.setString(1, id);
//		return cstmt.executeUpdate();
	}
	
	public int bookTypeModify(Connection con,BookType bookType)throws Exception{
		/*String sql="update t_bookType set bookTypeName=?,bookTypeDesc=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		pstmt.setInt(3, bookType.getId());
		return pstmt.executeUpdate();*/
		
		/*
		 * �洢����--�޸�
		 */
		CallableStatement cstmt = con.prepareCall("{call modify_booktype(?,?,?)}");
		cstmt.setString(1, bookType.getBookTypeName());
		cstmt.setString(2, bookType.getBookTypeDesc());
		cstmt.setInt(3, bookType.getId());
		return cstmt.executeUpdate();
	}
}
