package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private Connection conn; //데이터베이스를 접근하기 위한 객체

	private PreparedStatement pstmt;

	private ResultSet rs; //정보를 담을 수 있는 변수를 만들어준다.

//mysql 처리부분

	public UserDAO() {

		// 생성자를 만들어준다.

		try {

			String dbURL = "jdbc:mysql://localhost:3306/mydb";

			String dbID = "root";

			String dbPassword = "mysql_password";

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}



//로그인 처리부분

	public int login(String userID, String userPassword) {

		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";

		try {

			pstmt = conn.prepareStatement(SQL);

			pstmt.setString(1, userID);

			rs = pstmt.executeQuery();

			if(rs.next()) {

				if(rs.getString(1).equals(userPassword)) {

					return 1; //로그인 성공					

				}

			}else { 

				return 0; //비밀번호 불일치

			}

			return -1; //아이디없음

		}catch(Exception e) {

			e.printStackTrace();

		}

		return -2; //데이터베이스 오류

	}

 

}

