package JDBC;

import java.util.List;

public interface Arrange {
	/**
	 * 录入排课信息
	 * @param arrange[]
	 * @return isSuccess
	 * */
	public boolean insertInfo(String arrange[]);
	/**
	 * 获取inputinfo信息
	 * @param className
	 * @return arrangeList
	 * */
	public List<String> getInputInfo(String className);
	/**
	 * 根据课室类型获取课室地点
	 * @param classroomType
	 * @return placeList
	 * */
	public List<String> placeByType(String classroomType);
	/**
	 * 根据班级名获取班级人数
	 * @param className
	 * @return classNum
	 * */
	public int numByName(String className);
	/**
	 * 根据课室地点获取课室容纳人数
	 * @param classroomPlace
	 * @return classroomSize
	 * */
	public int sizeByPlace(String classroomPlace);
	/**
	 * 获取课室是否可用标志位(0可用，1不可用)
	 * @param classroomPlace, weekNum, sectionNum
	 * @return classroomFlag
	 * */
	public int getClassroomFlag(String classroomPlace, int weekNum, int sectionNum);
	/**
	 * 设置课室占用标志位
	 * @param classroomPlace, weekNum, sectionNum, classroomFlag
	 * @return null
	 * */
	public void setClassroomFlag(String classroomPlace, int weekNum, int sectionNum, int classroomFlag);
	/**
	 * 获取教师是否空闲标志位
	 * @param teacherName, weekNum, sectionNum
	 * @return teacherFlag
	 * */
	public int getTeacherFlag(String teacherName, int weekNum, int sectionNum);
	/**
	 * 设置教师空闲标志位
	 * @param teacherName, weekNum, sectionNum, teacherFlag
	 * @return null 
	 * */
	public void setTeacherFlag(String teacherName, int weekNum, int sectionNum, int teacherFlag);
	/**
	 * 获取课室容纳人数
	 * @param classroomId
	 * @return classroomSize
	 * */
	public int getClassroomSize(int classroomId);
	/**
	 * 获取班级人数
	 * @param classId
	 * @return classNum
	 * */
	public int getClassNum(int classId);
	/**
	 * 插入课表
	 * @param arrange[]
	 * @return isSuccss
	 * */
	public void insertResult(String arrange[]);
	/**
	 * 获取resultInfo信息
	 * @param className
	 * @return resultList
	 * */
	public List<String> getResultInfo(String className);
	/**
	 * 插入班级信息
	 * @param classinfo[]
	 * @return isSuccess
	 * */
	public boolean insertClassInfo(String classinfo[]);
	/**
	 * 插入课室信息
	 * @param classroominfo[]
	 * @return isSuccess
	 * */
	public boolean insertClassroomInfo(String classroominfo[]);
	/**
	 * 插入课室占用信息
	 * @param classroomJudge[]
	 * @return isSuccess
	 * */
	public boolean insertClassroomJudge(String classroomjudge[]);
	/**
	 * 插入课室占用信息
	 * @param teacherJudge[]
	 * @return isSuccess
	 * */
	public boolean insertTeacherJudge(String teacherjudge[]);
	/**
	 * 清空result内的数据
	 * @param null
	 * @return null
	 * */
	public void deleteResult();
	
	/**
	 * 获取教室所有地点
	 * @param null
	 * @return null
	 * */
	public List<String> getClassRoom();
	
	/**
	 * 获取所有老师
	 * @param null
	 * @return null
	 * */
	public List<String> getTeacherName();
	
	/**
	 * 获取所有班级
	 * @param null
	 * @return null
	 * */
	public List<String> getClassName();
	

	/**
	 * 获取教师课表信息
	 * @param className
	 * @return resultList
	 * */
	public List<String> getTeacherInfo(String tName);
	
	/**
	 * 获取教室课表信息
	 * @param className
	 * @return resultList
	 * */
	public List<String> getClassroomInfo(String cName);
}
