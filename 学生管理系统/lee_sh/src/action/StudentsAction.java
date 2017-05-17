package action;

import java.util.List;
import java.text.SimpleDateFormat;

import entity.Students;

import service.StudentsDAO;
import service.impl.StudentsDAOImpl;

//ѧ��Action��
public class StudentsAction extends SuperAction{

	private static final long serialVersionUID = 1L;
	StudentsDAO sdao = new StudentsDAOImpl(); 
	
	//��ѯ����ѧ���Ķ���
	public String query() {
		
		List<Students> list = sdao.queryAllStudents();
		
		//�Ž�session��
		if (list != null && list.size() > 0) {
			session.setAttribute("students_list", list);
		}
		return "query_success";
	}
	
	//ɾ��ѧ������
	public String delete() {
		String sid = request.getParameter("sid");
		sdao.deleteStudents(sid);
		return "delete_success";
	}
	
	//���ѧ������
	public String add() throws Exception{
		Students stu = new Students();
		stu.setSname(request.getParameter("sname"));
		stu.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		stu.setBirthday(sdf.parse(request.getParameter("birthday")));
		stu.setAddress(request.getParameter("address"));
		sdao.addStudents(stu);
		return "add_success";
	}
	
	//�޸�ѧ�����϶���
	public String modify() {
		//��ȡ���ݹ�����ѧ��id
		String sid = request.getParameter("sid");
		Students s = sdao.queryStudentsByID(sid);
		/*
		 * <s:property value="#session.modify_students.sname"/>
		 * ������ҳ����ʾ
		 */
		session.setAttribute("modify_students", s);
		return "modify_success";
	}
	
	//�����޸ĺ�ѧ�����϶���
	public String save() throws Exception {
		Students stu = new Students();
		stu.setSid(request.getParameter("sid"));
		stu.setSname(request.getParameter("sname"));
		stu.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		stu.setBirthday(sdf.parse(request.getParameter("birthday")));
		stu.setAddress(request.getParameter("address"));
		sdao.addStudents(stu);
		return "save_success";
	}
}
