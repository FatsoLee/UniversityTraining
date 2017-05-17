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

	// 用户登陆动作
	public String login() {
		System.out.println(user.getUsername() + " " + user.getPassword());
		UserDAO udao = new UserDAOImpl();
		if (udao.userLogin(user)) {
			session.setAttribute("loginUserName", user.getUsername());
			return "login_success";
		} else {
			// System.out.println("error进来了");
			return "login_failure";
		}
	}
	
	@SkipValidation			//注销不进行验证	
	//用户注销
	public String logout() {
		if(session.getAttribute("loginUserName") != null) {
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
			
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		//用户名不能为空
		if("".equals(user.getUsername().trim())) {
			this.addFieldError("usernameError", "用户名不能为空");
		}
		//密码不小于6位
		if(user.getPassword().length()<6) {
			this.addFieldError("passwordError", "密码长度不小于6位");
		}
	}
	
	

}
