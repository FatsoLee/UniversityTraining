package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;


//����Action�ĸ���
public class SuperAction extends ActionSupport implements ServletRequestAware,
	ServletResponseAware,ServletContextAware{

	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;	//�������
	protected HttpServletResponse resonse;	//��Ӧ����
	protected HttpSession session;	//�Ự����
	protected ServletContext application;	//ȫ�ֶ���
	
	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	@Override
	public void setServletResponse(HttpServletResponse resopnse) {
		// TODO Auto-generated method stub
		this.resonse = resopnse;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		this.session = this.request.getSession();
		
	}

}
