package com.gdin.web.loadServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;

/**
 * Servlet implementation class ServletUpload
 */
@WebServlet("/ServletUpload")
public class ServletUpload extends HttpServlet {
	private ServletConfig config;
	//初始化Servlet
	final public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}
	//处理GET请求
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("The method of the HTML form must be POST.");
	}
	//响应POST请求
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");
		
		String imageDir = "/uploadfile/" ;//要在工程的目录下创建该目录来存放图片，便于管理
		//获得服务器url表示方法(http://localhost:8080/bookchpt6(工程名)/)
		String servURL = request.getScheme()+"://"+request.getServerName()+
							":"+request.getServerPort()+request.getContextPath() + imageDir;
		//获取服务器本地存放位置
		String fileDir = request.getRealPath("")+ imageDir;
		
		PrintWriter out = response.getWriter();
		out.println("<head><title>jspsmart 上传附件结果</title></head>");
		
		// 变量定义
		int count=0;
		SmartUpload mySmartUpload = new SmartUpload();
		try {
			// 初始化
			mySmartUpload.initialize(config,request,response);

			//获取用户通过form提交的其他<input>控件的数据
			String fileDesc = mySmartUpload.getRequest().getParameter("desc");
			
			// 上载
			mySmartUpload.upload();			
			count = mySmartUpload.save(fileDir);
			
			//获取文件名，构造可以访问的URL
			Files uploadfile = mySmartUpload.getFiles();
			String fileName = uploadfile.getFile(0).getFileName();
			//构造通过jspsmart访问上传后的附件的路径
			String downloadURL = request.getContextPath()+"/servlet/ServDownload?filepath="+ imageDir + fileName;
			//构造直接通过url访问上传后的附件的路径
			servURL = servURL + fileName;
			
			// 显示处理结果
			out.println(count + " 文件上传成功，存放于服务器目录："+ fileDir);
			out.println("<br>可以通过jspsmart控件访问服务器文件:"+downloadURL+"(<a href='"+downloadURL+"'>点击查看文件</a>)");
			out.println("<br>可以通过url来访问："+servURL+"(<a href='"+servURL+"'>点击查看文件</a>)");
			out.println("<br>文件描述："+fileDesc);
		} catch (Exception e){
			out.println("Unable to upload the file.<br>");
			out.println("Error : " + e.toString());
		}
    }

}
