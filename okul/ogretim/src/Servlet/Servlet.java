package Servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogr.Ogrkayit;
import ogr.Ogretmen;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Ogretmen.java kod sayfas�n� �a��rma */
		Ogretmen ogr = new Ogretmen(request);
		
		/* Ogrkayit.java kod sayfas�n� �a��rma */
		Ogrkayit ogrkayit = new Ogrkayit();
		
		/* return de�eri atama */
		int ret = 1;
		
		/* Ogrkayit'dan gelen veriyi ret de�erine atama */
		try {
			ret = ogrkayit.ogrkayit(ogr);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		System.out.println(ret);
		
		/* ret de�eri 1'e e�itse i�lem ba�ar�l� */
		if(ret==1)
		{
		PrintWriter out = response.getWriter(); 
		out.write("<html>"+
		"<head><meta charset=\"UTF-8\"><title>ba�ar�l�</title>"+
		"</head>"+ 
		"<body>"+
		"<div>\r\n" + 
		"			<table border=1px; width=\"80%\" align= center>\r\n" + 
		"				<tr>\r\n" + 
		"					<td style=\"text-align:center\"><a href=\"index.jsp\">Anasayfa               </a></td>\r\n" + 
		"					<td style=\"text-align:center\"><a href=\"ogretmen_kayit.jsp\">Ogretim Elemani Kayit Islemleri</a></td>\r\n" + 
		"				</tr>\r\n" + 
		"			</table>\r\n" + 
		"		</div>"+
		"<center><h1 style=\"color:green;\">kayit basarili<h1></center>"+
		"</body></html>");
		}
		/* ret de�eri 0'a e�itse i�lem ba�ar�s�z */
		else if(ret==0)
		{
			PrintWriter out = response.getWriter(); 
			out.write("<html>"+
			"<head><meta charset=\"UTF-8\"><title>ba�ar�s�z</title>"+
			"</head>"+ 
			"<body>"+
			"<div>\r\n" + 
			"			<table border=1px; width=\"80%\" align= center>\r\n" + 
			"				<tr>\r\n" + 
			"					<td style=\"text-align:center\"><a href=\"index.jsp\">Anasayfa               </a></td>\r\n" + 
			"					<td style=\"text-align:center\"><a href=\"ogretmen_kayit.jsp\">Ogretim Elemani Kayit Islemleri</a></td>\r\n" + 
			"				</tr>\r\n" + 
			"			</table>\r\n" + 
			"		</div>"+
			"<center><h1 style=\"color:red;\">kayit basarisiz<h1></center>"+
			"</body></html>");
		}
		
	}

}
