package action;

import java.util.List;
import java.text.SimpleDateFormat;

import entity.Students;

import service.StudentsDAO;
import service.impl.StudentsDAOImpl;

//学生Action类
public class StudentsAction extends SuperAction{

	private static final long serialVersionUID = 1L;
	StudentsDAO sdao = new StudentsDAOImpl(); 
	
	//查询所有学生的动作
	public String query() {
		
		List<Students> list = sdao.queryAllStudents();
		
		//放进session中
		if (list != null && list.size() > 0) {
			session.setAttribute("students_list", list);
		}
		return "query_success";
	}
	
	//删除学生动作
	public String delete() {
		String sid = request.getParameter("sid");
		sdao.deleteStudents(sid);
		return "delete_success";
	}
	
	//添加学生动作
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
	
	//修改学生资料动作
	public String modify() {
		//获取传递过来的学生id
		String sid = request.getParameter("sid");
		Students s = sdao.queryStudentsByID(sid);
		/*
		 * <s:property value="#session.modify_students.sname"/>
		 * 便于在页面显示
		 */
		session.setAttribute("modify_students", s);
		return "modify_success";
	}
	
	//保存修改后学生资料动作
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
