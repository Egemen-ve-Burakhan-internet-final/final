<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ogretmen Kayit Sayfasi</title>
</head>
<body>
	<div>
		<div>
			<h1 style="text-align:center">Ogretim Elemani Kayit Islemleri</h1>
		</div>
		<div>
			<table border=1px; width="80%" align= center>
				<tr>
					<td style="text-align:center"><a href="index.jsp">Anasayfa               </a></td>
					<td style="text-align:center"><a href="ogretmen_kayit.jsp">Ogretim Elemani Kayit Islemleri</a></td>
				</tr>
			</table>
		</div><br>
		
		<div>
			<form>
				<table align= center>
					<tr>
						<td><label>Ogretim Elemani Unvan</label></td>
						<td><input type="text" name="unvan"></td>
					</tr>
		
					<tr>
						<td><label>Ogretim Elemani Adi</label></td>
						<td><input type="text" name="adi"></td>
					</tr>
		
					<tr>
						<td><label>Ogretim Elemani Soyadi</label></td>
						<td><input type="text" name="soyadi"></td>
					</tr>
		
					<tr>
						<td><label>Ders Sec</label></td>
						<td>
							<select name="ders" id="ders">
							    <option value="matematik">Matematik</option>
							    <option value="turkce">Turkce</option>
							    <option value="ingilizce">Ingilizce</option>
							    <option value="tarih">Tarih</option>
							    <option value="felsefe">Felsefe</option>
							    <option value="biyoloji">Biyoloji</option>
							    <option value="fizik">Fizik</option>
							    <option value="kimya">Kimya</option>
							    <option value="internet_programciligi">Internet Programciligi</option>
							    <option value="muzik">Muzik</option>
							    <option value="beden_egitimi">Beden Egitimi</option>
							    <option value="din_kulturu">Din Kulturu</option>
			 			 	</select>
			 			</td>
					</tr>
					<tr>
						<td colspan="2" align=center><input type="button" name="buton" value="Kayit Ol"></td>
					</tr>
				</table>
			</form>
		</div>
		
		
	</div>
</body>
</html>