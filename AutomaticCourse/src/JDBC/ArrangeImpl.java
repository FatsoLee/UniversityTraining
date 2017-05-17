package JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import util.StringUtil;

public class ArrangeImpl implements Arrange{
	@Override
	public boolean insertInfo(String arrange[]) {
		// TODO Auto-generated method stub
		String sql = "insert into inputinfo(className,courseName,teacherName,courseNum,classroomType) values(?,?,?,?,?)";
		Connection con = JdbcUtils.getConnection();			
		PreparedStatement pStat = null;
		boolean isSuccess = true;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, arrange[0]);			
			pStat.setString(2, arrange[1]);		
			pStat.setString(3, arrange[2]);		
			pStat.setInt(4, Integer.valueOf(arrange[3]));		
			pStat.setString(5, arrange[4]);		
			pStat.executeUpdate();
			System.out.println("录入成功!!!");
		}catch(SQLException e) {
			System.out.println("录入失败!!!");
			e.printStackTrace();
			isSuccess = false;
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
		return isSuccess;
	}
	
	@Override
	public List<String> getInputInfo(String className) {
		List<String> arrangeList = new ArrayList<String>();
		String sql = "select * from inputinfo where className = ?";
		int i = 0;
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, className);	
			rs = pStat.executeQuery();
			while(rs.next()){
				arrangeList.add(i, rs.getString("courseName"));
				arrangeList.add(i+1, rs.getString("teacherName"));
				arrangeList.add(i+2, rs.getString("courseNum"));
				arrangeList.add(i+3, rs.getString("classroomType"));
				i += 4;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return arrangeList;
	}
	
	@Override
	public List<String> placeByType(String classroomType) {
		List<String> placeList = new ArrayList<String>();
		String sql = "select classroomPlace from classroom where classroomType=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		int i = 0;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, classroomType);
			rs = pStat.executeQuery();	
			while(rs.next()) {
				placeList.add(i, rs.getString("classroomPlace"));
				i++;
		 	}
		}catch(SQLException e) {
			System.out.println("获取classroomPlace失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return placeList;
	}
	
	@Override 
	public int numByName(String className) {
		int classNum = 0;
		String sql = "select classNum from class where className=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, className);
			rs = pStat.executeQuery();	
			if(rs.next()) {
				classNum = rs.getInt("classNum");			//获取classNum
		 	}
		}catch(SQLException e) {
			System.out.println("获取classNum失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classNum;
	}
	
	@Override 
	public int sizeByPlace(String classroomPlace) {
		int classroomSize = 0;
		String sql = "select classroomSize from classroom where classroomPlace=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, classroomPlace);
			rs = pStat.executeQuery();	
			if(rs.next()) {
				classroomSize = rs.getInt("classroomSize");			//获取classroomSize
		 	}
		}catch(SQLException e) {
			System.out.println("获取classroomSize失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classroomSize;
	}
	
	@Override
	public int getClassroomFlag(String classroomPlace, int weekNum, int sectionNum) {
		int classroomFlag = 0;
		String sql = "select classroomFlag from classroomjudge where classroomPlace=? && weekNum=? && sectionNum=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, classroomPlace);
			pStat.setInt(2, weekNum);
			pStat.setInt(3, sectionNum);
			rs = pStat.executeQuery();	
			if(rs.next()) {
				classroomFlag = rs.getInt("classroomFlag");			//获取classroomFlag
		 	}
		}catch(SQLException e) {
			System.out.println("获取classroomFlag失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classroomFlag;
	}
	
	@Override
	public void setClassroomFlag(String classroomPlace, int weekNum, int sectionNum, int classroomFlag) {
		String sql = "update classroomjudge set classroomFlag=? where classroomPlace=? && weekNum=? && sectionNum=?";
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setInt(1, classroomFlag);
			pStat.setString(2, classroomPlace);
			pStat.setInt(3, weekNum);
			pStat.setInt(4, sectionNum);
			int i = pStat.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
	}
	
	@Override
	public int getTeacherFlag(String teacherName, int weekNum, int sectionNum) {
		int teacherFlag = 0;
		String sql = "select teacherFlag from teacherjudge where teacherName=? && weekNum=? && sectionNum=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, teacherName);
			pStat.setInt(2, weekNum);
			pStat.setInt(3, sectionNum);
			rs = pStat.executeQuery();	
			if(rs.next()) {
				teacherFlag = rs.getInt("teacherFlag");			//获取teacherFlag
		 	}
		}catch(SQLException e) {
			System.out.println("获取teacherFlag失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return teacherFlag;
	}
	
	@Override
	public void setTeacherFlag(String teacherName, int weekNum, int sectionNum, int teacherFlag) {
		String sql = "update teacherjudge set teacherFlag=? where teacherName=? && weekNum=? && sectionNum=?";
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setInt(1, teacherFlag);
			pStat.setString(2, teacherName);
			pStat.setInt(3, weekNum);
			pStat.setInt(4, sectionNum);
			int i = pStat.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
	}
	
	@Override 
	public int getClassroomSize(int classroomId) {
		int classroomSize = 0;
		String sql = "select classroomSize from classroom where classroomId=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setInt(1, classroomId);
			rs = pStat.executeQuery();	
			if(rs.next()) {
				classroomSize = rs.getInt("classroomSize");			//获取classroomSize
		 	}
		}catch(SQLException e) {
			System.out.println("获取classroomSize失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classroomSize;
	}
	
	@Override 
	public int getClassNum(int classId) {
		int classNum = 0;
		String sql = "select classNum from class where classId=?";
		Connection con = JdbcUtils.getConnection();
		ResultSet rs = null;
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setInt(1, classId);
			rs = pStat.executeQuery();	
			if(rs.next()) {
				classNum = rs.getInt("classNum");			//获取classNum
		 	}
		}catch(SQLException e) {
			System.out.println("获取classNum失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classNum;
	}
	
	@Override
	public void insertResult(String arrange[]) {
		String sql = "insert into result(courseName,classroomPlace,weekNum,sectionNum,className,teacherName) values(?,?,?,?,?,?)";
		Connection con = JdbcUtils.getConnection();			
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, arrange[0]);			
			pStat.setString(2, arrange[1]);		
			pStat.setInt(3, Integer.valueOf(arrange[2]));		
			pStat.setInt(4, Integer.valueOf(arrange[3]));		
			pStat.setString(5, arrange[4]);		
			pStat.setString(6, arrange[5]);	
			pStat.executeUpdate();
			System.out.println("插入成功!!!");
		}catch(SQLException e) {
			System.out.println("插入失败!!!");
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
	}

	@Override
	public List<String> getResultInfo(String className) {
		List<String> resultList = new ArrayList<String>();
		String sql = "select * from result where className = ?";
		int i = 0;
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, className);	
			rs = pStat.executeQuery();
			while(rs.next()){
				resultList.add(i, rs.getString("courseName"));
				resultList.add(i+1, rs.getString("classroomPlace"));
				resultList.add(i+2, rs.getString("weekNum"));
				resultList.add(i+3, rs.getString("sectionNum"));
				resultList.add(i+4, rs.getString("teacherName"));
				i += 5;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return resultList;
	}
	
	@Override
	public boolean insertClassInfo(String classinfo[]) {
		String sql = "insert into class(className,classNum) values(?,?)";
		Connection con = JdbcUtils.getConnection();			
		PreparedStatement pStat = null;
		boolean isSuccess = true;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, classinfo[0]);		
			pStat.setInt(2, Integer.valueOf(classinfo[1]));		
			pStat.executeUpdate();
			System.out.println("插入班级信息成功!!!");
		}catch(SQLException e) {
			System.out.println("插入班级信息失败!!!");
			e.printStackTrace();
			isSuccess = false;
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
		return isSuccess;
	}
	
	@Override
	public boolean insertClassroomInfo(String classroominfo[]) {
		String sql = "insert into classroom(classroomPlace,classroomSize,classroomType) values(?,?,?)";
		Connection con = JdbcUtils.getConnection();			
		PreparedStatement pStat = null;
		boolean isSuccess = true;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, classroominfo[0]);		
			pStat.setString(2, classroominfo[1]);
			pStat.setString(3, classroominfo[2]);
			pStat.executeUpdate();
			System.out.println("插入课室信息成功!!!");
		}catch(SQLException e) {
			System.out.println("插入课室信息失败!!!");
			e.printStackTrace();
			isSuccess = false;
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
		return isSuccess;
	}
	
	@Override
	public boolean insertClassroomJudge(String classroomjudge[]) {
		String sql = "insert into classroomjudge(classroomPlace,weekNum,sectionNum,classroomFlag) values(?,?,?,?)";
		Connection con = JdbcUtils.getConnection();			
		PreparedStatement pStat = null;
		boolean isSuccess = true;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, classroomjudge[0]);		
			pStat.setString(2, classroomjudge[1]);
			pStat.setString(3, classroomjudge[2]);
			pStat.setString(4, classroomjudge[3]);
			pStat.executeUpdate();
			System.out.println("插入课室占用信息成功!!!");
		}catch(SQLException e) {
			System.out.println("插入课室占用信息失败!!!");
			e.printStackTrace();
			isSuccess = false;
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
		return isSuccess;
	}
	
	@Override
	public boolean insertTeacherJudge(String teacherjudge[]) {
		String sql = "insert into teacherjudge(teacherName,weekNum,sectionNum,teacherFlag) values(?,?,?,?)";
		Connection con = JdbcUtils.getConnection();			
		PreparedStatement pStat = null;
		boolean isSuccess = true;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, teacherjudge[0]);		
			pStat.setString(2, teacherjudge[1]);
			pStat.setString(3, teacherjudge[2]);
			pStat.setString(4, teacherjudge[3]);
			pStat.executeUpdate();
			System.out.println("插入教师占用信息成功!!!");
		}catch(SQLException e) {
			System.out.println("插入教师占用信息失败!!!");
			e.printStackTrace();
			isSuccess = false;
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
		return isSuccess;
	}
	
	@Override
	public void deleteResult() {
		String sql = "delete from result";
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		try{
			pStat = con.prepareStatement(sql);
			int i = pStat.executeUpdate();	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(null, null, pStat, con);
		}
	}

	@Override
	public List<String> getClassRoom() {
		List<String> classroomList = new ArrayList<String>();
		String sql = "select classroomPlace from classroom";
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		try{
			pStat = con.prepareStatement(sql);
			rs = pStat.executeQuery();
			while (rs.next()) {
				classroomList.add(rs.getString("classroomPlace"));
			}
		}catch(SQLException e) {
			System.out.println("获取classroomPlace失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classroomList;
	}

	@Override
	public List<String> getTeacherName() {
		List<String> classroomList = new ArrayList<String>();
		String sql = "select teacherName from inputinfo";
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		try{
			pStat = con.prepareStatement(sql);
			rs = pStat.executeQuery();
			while (rs.next()) {
				classroomList.add(rs.getString("teacherName"));
			}
		}catch(SQLException e) {
			System.out.println("获取classroomPlace失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return StringUtil.getOnlyList(classroomList);
	}
	
	@Override
	public List<String> getClassName() {
		List<String> classNameList = new ArrayList<String>();
		String sql = "select className from class";
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;	
		try{
			pStat = con.prepareStatement(sql);
			rs = pStat.executeQuery();
			while (rs.next()) {
				classNameList.add(rs.getString("className"));
			}
		}catch(SQLException e) {
			System.out.println("获取classroomPlace失败!!!");
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return classNameList;
	}
	
	@Override
	public List<String> getTeacherInfo(String tName) {
		// TODO Auto-generated method stub
		List<String> resultList = new ArrayList<String>();
		String sql = "select * from result where teacherName = ?";
		int i = 0;
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, tName);	
			rs = pStat.executeQuery();
			while(rs.next()){
				resultList.add(i, rs.getString("courseName"));
				resultList.add(i+1, rs.getString("classroomPlace"));
				resultList.add(i+2, rs.getString("weekNum"));
				resultList.add(i+3, rs.getString("sectionNum"));
				resultList.add(i+4, rs.getString("className"));
				i += 5;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return resultList;
	}

	@Override
	public List<String> getClassroomInfo(String cName) {
		// TODO Auto-generated method stub
		List<String> resultList = new ArrayList<String>();
		String sql = "select * from result where classroomPlace = ?";
		int i = 0;
		Connection con = JdbcUtils.getConnection();
		PreparedStatement pStat = null;
		ResultSet rs = null;
		try{
			pStat = con.prepareStatement(sql);
			pStat.setString(1, cName);	
			rs = pStat.executeQuery();
			while(rs.next()){
				resultList.add(i, rs.getString("courseName"));
				resultList.add(i+1, rs.getString("teacherName"));
				resultList.add(i+2, rs.getString("weekNum"));
				resultList.add(i+3, rs.getString("sectionNum"));
				resultList.add(i+4, rs.getString("className"));
				i += 5;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(rs, null, pStat, con);
		}
		return resultList;
	}
	
}
