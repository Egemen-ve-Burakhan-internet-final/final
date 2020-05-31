package ogr;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;

import ogr.Ogretmen;


public class Ogrkayit {
	
	public int ogrkayit(Ogretmen ogr) throws SQLException
	{	 
		/* veri taban� ba�lant� kodu */
		String connUrl= "jdbc:sqlserver://localhost:1433;databaseName=okuldb;integratedSecurity=true;";
		Connection conn = DriverManager.getConnection(connUrl);
		Statement stmt = conn.createStatement();
		
		try
		{   
			/* kay�t ekleme sql sorgusu */			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO ogretmen_kayit values (?,?,?,?)");
			/* formdan al�nan verileri veri taban�na atma */
			pst.setString(1, ogr.getUnvan());
			pst.setString(2, ogr.getAd());
			pst.setString(3, ogr.getSoyad());
			pst.setInt(4, ogr.getDers());	
			
			/* ders id ile ��retim g�revlisinin se�ti�i ders birbirine e�itse bunlar� al�r */
			ResultSet rs = stmt.executeQuery("SELECT dolu FROM dersler WHERE ders_id = "+ogr.getDers()+"");
			while (rs.next ()) {  
     		int dks = rs.getInt ("dolu");
			System.out.println ("dolu:" + dks );
			    /* e�er dolu 1 ise dersin dolu oldu�unu g�sterir */
				if(dks == 1)
				{
					System.out.println("dolu ders");
					return 0;
				}
				
			}			
			pst.execute();
				
			/* ders id ile ��retim g�revlisinin se�ti�i ders birbirine e�itse dolu'yu 1 yapar (dersin al�nd���n� g�sterir) */		
			PreparedStatement pst2 = conn.prepareStatement("UPDATE dersler set dolu = 1 where ders_id = "+ ogr.getDers() +" ");			
			pst2.execute();
			
		}
		
		catch (Exception e) {
	    System.out.println(e);
	    
		}
           return 1;
	}

}
