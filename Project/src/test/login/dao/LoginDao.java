package test.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.login.dto.LoginDto;
import test.util.DbcpBean;

public class LoginDao {
	private static LoginDao dao;
	private LoginDao() {}
	public static LoginDao getInstance() {
		if(dao==null) {
			dao=new LoginDao();
		}
		return dao;
	}
	//회원정보(이메일)를 수정 반영하는 메소드
		public boolean update(LoginDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int flag = 0;
			try {
				conn = new DbcpBean().getConn();
				//실행할 sql 문 준비하기 
				String sql = "UPDATE login"
						+ " SET email=?"
						+ " WHERE id=?";
				pstmt = conn.prepareStatement(sql);
				//? 에 바인딩 할 값이 있으면 바인딩한다.
				pstmt.setString(1, dto.getEmail());
				pstmt.setString(2, dto.getId());
				//sql  문 수행하고 update or insert or delete 된 row 의 갯수 리턴받기 
				flag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
				}
			}
			if (flag > 0) {
				return true;
			} else {
				return false;
			}
		}
	
	//비밀번호를 수정 반영하는 메소드
		public boolean updatePwd(LoginDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int flag = 0;
			try {
				conn = new DbcpBean().getConn();
				//실행할 sql 문 준비하기 
				String sql = "UPDATE login"
						+ " SET pwd=?"
						+ " WHERE id=? AND pwd=?";
				pstmt = conn.prepareStatement(sql);
				//? 에 바인딩 할 값이 있으면 바인딩한다.
				pstmt.setString(1, dto.getNewPwd());
				pstmt.setString(2, dto.getId());
				pstmt.setString(3, dto.getPwd());
				//sql  문 수행하고 update or insert or delete 된 row 의 갯수 리턴받기 
				flag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
				}
			}
			if (flag > 0) {
				return true;
			} else {
				return false;
			}
		}
	
	//인자로 전달된 id  에 해당하는 정보를 삭제하는 메소드
		public boolean delete(String id) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int flag = 0;
			try {
				conn = new DbcpBean().getConn();
				//실행할 sql 문 준비하기 
				String sql = "DELETE FROM login"
						+ " WHERE id=?";
				pstmt = conn.prepareStatement(sql);
				//? 에 바인딩 할 값이 있으면 바인딩한다.
				pstmt.setString(1, id);
				//sql  문 수행하고 update or insert or delete 된 row 의 갯수 리턴받기 
				flag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
				}
			}
			if (flag > 0) {
				return true;
			} else {
				return false;
			}
		}
	
	//인자로 전달된 id 에 해당하는 정보를 리턴하는 메소드
		public LoginDto getData(String id) {
			//UsersDto 객체의 참조값을 담을 지역 변수 만들기 
			LoginDto dto=null;
			//필요한 객체의 참조값을 담을 지역변수 만들기 
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				//Connection 객체의 참조값 얻어오기 
				conn = new DbcpBean().getConn();
				//실행할 sql 문 준비하기
				String sql = "SELECT pwd,email,profile,regdate"
						+ " FROM login"
						+ " WHERE id=?";
				pstmt = conn.prepareStatement(sql);
				//sql 문에 ? 에 바인딩할 값이 있으면 바인딩하고 
				pstmt.setString(1, id);
				//select 문 수행하고 결과 받아오기 
				rs = pstmt.executeQuery();
				//결과 값 추출하기 
				if (rs.next()) {
					dto=new LoginDto();
					dto.setId(id);
					dto.setPwd(rs.getString("pwd"));
					dto.setEmail(rs.getString("email"));
					dto.setProfile(rs.getString("profile"));
					dto.setRegdate(rs.getString("regdate"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
				}
			}
			return dto;
		}
	
	//UsersDto 객체에 있는 id, pwd 가 유효한 정보인지 여부를 리턴하는 메소드
		public boolean isValid(LoginDto dto) {
			//유효한 정보인지 여부를 담을 지역변수 만들고 초기값 false 부여하기
			boolean isValid=false;
			//필요한 객체의 참조값을 담을 지역변수 만들기 
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				//Connection 객체의 참조값 얻어오기 
				conn = new DbcpBean().getConn();
				//실행할 sql 문 준비하기
				String sql = "SELECT id"
						+ " FROM login"
						+ " WHERE id=? AND pwd=?";
				pstmt = conn.prepareStatement(sql);
				//sql 문에 ? 에 바인딩할 값이 있으면 바인딩하고 
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPwd());
				//select 문 수행하고 결과 받아오기 
				rs = pstmt.executeQuery();
				//반복문 돌면서 결과 값 추출하기 
				while (rs.next()) {
					//select 된 결과가 있으면 유효한 정보 이므로 isValid 에 true 를 넣어준다.
					isValid=true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
				}
			}
			//아이디 비밀번호가 유효한 정보인지 여부를 리턴해준다.
			return isValid;
		}
	
		//회원정보를 저장하는 메소드 (profile 칼럼은 제외)
		public boolean insert(LoginDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int flag = 0;
			try {
				conn = new DbcpBean().getConn();
				//실행할 sql 문 준비하기 
				String sql = "INSERT INTO login"
						+ " (id, pwd, email, regdate)"
						+ " VALUES(?, ?, ?, SYSDATE)";
				pstmt = conn.prepareStatement(sql);
				//? 에 바인딩 할 값이 있으면 바인딩한다.
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPwd());
				pstmt.setString(3, dto.getEmail());
				//sql  문 수행하고 update or insert or delete 된 row 의 갯수 리턴받기 
				flag = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (Exception e) {
				}
			}
			if (flag > 0) {
				return true;
			} else {
				return false;
			}
		}
	
}
