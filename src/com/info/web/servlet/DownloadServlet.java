package com.info.web.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.info.common.util.AppSEQHelper;
import com.info.service.SystemCodeService;

public class DownloadServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7460597250785199492L;
	//@Autowired
	AppSEQHelper SEQ;
	SystemCodeService service;
	private String contentType = "application/x-msdownload";//也可以是文件的mime  
    private String enc = "utf-8";  
    private String fileRoot = "d:/file/";  
    public void init() throws ServletException {           
        super.init();
         ServletContext servletContext = this.getServletContext();
         WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);   
         SEQ = (AppSEQHelper)ctx.getBean("appSEQHelper");  
         service =(SystemCodeService)ctx.getBean("systemCodeService"); 
     }   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        //String filepath = new String(request.getParameter("filepath").getBytes("ISO-8859-1"),"gbk"); 
    	String filepath = request.getParameter("filepath");
    	String fullFilePath = fileRoot + filepath;  
        /*读取文件*/  
        File file = new File(fullFilePath);  
        
        /*如果文件存在*/  
        if (file.exists()) {  
        	//针对不同的浏览器打开中文路径乱码情况处理
        	//判断浏览器 
			/*String agent = request.getHeader("USER-AGENT"); 
			if (null != agent && -1 != agent.indexOf("MSIE")){//IE 
				// 设置文件头，文件名称或编码格式 
				response.setHeader("Content-Disposition", "attachment;filename=\"" + java.net.URLEncoder.encode(ProjectResultsFileObj.getFFileName(), "UTF-8") + "\"");
			}else{//firefox 
				response.setHeader("Content-Disposition", "attachment;filename=\"" + new String(ProjectResultsFileObj.getFFileName().getBytes("UTF-8"),"iso-8859-1") + "\""); 
			} */
            String filename = URLEncoder.encode("中文文件.pdf", enc);  
            response.reset();  
            response.setContentType(contentType); 
            response.addHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");  
            int fileLength = (int) file.length();  
            response.setContentLength(fileLength);  
            /*如果文件长度大于0*/  
            if (fileLength != 0) {  
                /*创建输入流*/  
                InputStream inStream = new FileInputStream(file);  
                byte[] buf = new byte[4096];  
                /*创建输出流*/  
                ServletOutputStream servletOS = response.getOutputStream();  
                int readLength;  
                while (((readLength = inStream.read(buf)) != -1)) {  
                    servletOS.write(buf, 0, readLength);  
                }  
                inStream.close();  
                servletOS.flush();  
                servletOS.close();  
            }  
        }  
    }  
}
