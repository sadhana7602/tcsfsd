package com.tcs.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out=response.getWriter();
		int count=0;
			Cookie cookies[]=request.getCookies();
			if(cookies==null) {
				Cookie cookie=new Cookie("visits",++count+"");
				response.addCookie(cookie);
			}
			else {
			Cookie c=null;
			boolean flag=false;
			for(int i=0;i<cookies.length;i++ ) {
				c=cookies[i];
				if(c.getName().equals("visits"))
				{
					flag=true;
					break;
				}
			}
			
				if(flag) {
					count=Integer.parseInt(c.getValue());
					count++;
					c.setValue(count+"");
					response.addCookie(c);
				}
				
			}

		out.println("You have refreshed the page "+count+" times");
	}


}
