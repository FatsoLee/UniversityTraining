package JDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class JdbcUtils {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/autoarrange?useUnicode=true&characterEncoding=utf-8";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "123456";

	/**
	 * ͨ����̬����� ע�����ݿ�����
	 */
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���Connection
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * ���Statement
	 * 
	 * @return
	 */
	public static Statement getStatement() {
		Statement st = null;
		try {
			st = getConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}

	/**
	 * �ر�ResultSet
	 * 
	 * @param rs
	 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �ر�Statement
	 * 
	 * @param st
	 */
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * �ر�PreparedStatement
	 * 
	 * @param pStat
	 */
	public static void closePreparedStatement(PreparedStatement pStat) {
		if (pStat != null) {
			try {
				pStat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * �ر�Connection
	 * 
	 * @param conn
	 */
	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �ر�ȫ��
	 * 
	 * @param rs
	 * @param sta
	 * @param conn
	 */
	public static void closeAll(ResultSet rs, Statement sta, PreparedStatement pStat, Connection conn) {
		closeResultSet(rs);
		closeStatement(sta);
		closePreparedStatement(pStat);
		closeConnection(conn);
	}
}