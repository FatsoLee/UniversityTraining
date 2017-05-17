package action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import service.UserDAO;
import service.impl.UserDAOImpl;

import com.opensymphony.xwork2.ModelDriven;

import entity.Users;

public class UsersAction extends SuperAction implements ModelDriven<Users> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users user = new Users();

	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}

	// �û���½����
	public String login() {
		System.out.println(user.getUsername() + " " + user.getPassword());
		UserDAO udao = new UserDAOImpl();
		if (udao.userLogin(user)) {
			session.setAttribute("loginUserName", user.getUsername());
			return "login_success";
		} else {
			// System.out.println("error������");
			return "login_failure";
		}
	}
	
	@SkipValidation			//ע����������֤	
	//�û�ע��
	public String logout() {
		if(session.getAttribute("loginUserName") != null) {
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
			
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		//�û�������Ϊ��
		if("".equals(user.getUsername().trim())) {
			this.addFieldError("usernameError", "�û�������Ϊ��");
		}
		//���벻С��6λ
		if(user.getPassword().length()<6) {
			this.addFieldError("passwordError", "���볤�Ȳ�С��6λ");
		}
	}
	
	

}
