package JDBC;

import java.util.List;

public interface Arrange {
	/**
	 * ¼���ſ���Ϣ
	 * @param arrange[]
	 * @return isSuccess
	 * */
	public boolean insertInfo(String arrange[]);
	/**
	 * ��ȡinputinfo��Ϣ
	 * @param className
	 * @return arrangeList
	 * */
	public List<String> getInputInfo(String className);
	/**
	 * ���ݿ������ͻ�ȡ���ҵص�
	 * @param classroomType
	 * @return placeList
	 * */
	public List<String> placeByType(String classroomType);
	/**
	 * ���ݰ༶����ȡ�༶����
	 * @param className
	 * @return classNum
	 * */
	public int numByName(String className);
	/**
	 * ���ݿ��ҵص��ȡ������������
	 * @param classroomPlace
	 * @return classroomSize
	 * */
	public int sizeByPlace(String classroomPlace);
	/**
	 * ��ȡ�����Ƿ���ñ�־λ(0���ã�1������)
	 * @param classroomPlace, weekNum, sectionNum
	 * @return classroomFlag
	 * */
	public int getClassroomFlag(String classroomPlace, int weekNum, int sectionNum);
	/**
	 * ���ÿ���ռ�ñ�־λ
	 * @param classroomPlace, weekNum, sectionNum, classroomFlag
	 * @return null
	 * */
	public void setClassroomFlag(String classroomPlace, int weekNum, int sectionNum, int classroomFlag);
	/**
	 * ��ȡ��ʦ�Ƿ���б�־λ
	 * @param teacherName, weekNum, sectionNum
	 * @return teacherFlag
	 * */
	public int getTeacherFlag(String teacherName, int weekNum, int sectionNum);
	/**
	 * ���ý�ʦ���б�־λ
	 * @param teacherName, weekNum, sectionNum, teacherFlag
	 * @return null 
	 * */
	public void setTeacherFlag(String teacherName, int weekNum, int sectionNum, int teacherFlag);
	/**
	 * ��ȡ������������
	 * @param classroomId
	 * @return classroomSize
	 * */
	public int getClassroomSize(int classroomId);
	/**
	 * ��ȡ�༶����
	 * @param classId
	 * @return classNum
	 * */
	public int getClassNum(int classId);
	/**
	 * ����α�
	 * @param arrange[]
	 * @return isSuccss
	 * */
	public void insertResult(String arrange[]);
	/**
	 * ��ȡresultInfo��Ϣ
	 * @param className
	 * @return resultList
	 * */
	public List<String> getResultInfo(String className);
	/**
	 * ����༶��Ϣ
	 * @param classinfo[]
	 * @return isSuccess
	 * */
	public boolean insertClassInfo(String classinfo[]);
	/**
	 * ���������Ϣ
	 * @param classroominfo[]
	 * @return isSuccess
	 * */
	public boolean insertClassroomInfo(String classroominfo[]);
	/**
	 * �������ռ����Ϣ
	 * @param classroomJudge[]
	 * @return isSuccess
	 * */
	public boolean insertClassroomJudge(String classroomjudge[]);
	/**
	 * �������ռ����Ϣ
	 * @param teacherJudge[]
	 * @return isSuccess
	 * */
	public boolean insertTeacherJudge(String teacherjudge[]);
	/**
	 * ���result�ڵ�����
	 * @param null
	 * @return null
	 * */
	public void deleteResult();
	
	/**
	 * ��ȡ�������еص�
	 * @param null
	 * @return null
	 * */
	public List<String> getClassRoom();
	
	/**
	 * ��ȡ������ʦ
	 * @param null
	 * @return null
	 * */
	public List<String> getTeacherName();
	
	/**
	 * ��ȡ���а༶
	 * @param null
	 * @return null
	 * */
	public List<String> getClassName();
	

	/**
	 * ��ȡ��ʦ�α���Ϣ
	 * @param className
	 * @return resultList
	 * */
	public List<String> getTeacherInfo(String tName);
	
	/**
	 * ��ȡ���ҿα���Ϣ
	 * @param className
	 * @return resultList
	 * */
	public List<String> getClassroomInfo(String cName);
}
