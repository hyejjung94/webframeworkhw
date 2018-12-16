package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import model.Register;

@Repository
public class RegisterDAO {
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from register";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	/*
	 * 수강신청목록 불러오기
	 */
	public List<Register> getRegisterList() {
		String sqlStatement = "select * from register";
		List<Register> registerList = jdbcTemplateObject.query(sqlStatement, new RowMapper<Register>() {

			@Override
			public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
				Register register = new Register();

				register.setCurriculum_code(rs.getString("curriculum_code"));
				register.setCurriculum_name(rs.getString("curriculum_name"));
				register.setCurriculum_type(rs.getString("curriculum_type"));
				register.setCurriculum_point(rs.getInt("curriculum_point"));

				return register;
			}
		});
		return registerList;
	}
	
	public boolean insert(Register register) {
		
		String curriculum_code = register.getCurriculum_code();
		String curriculum_name = register.getCurriculum_name();
		String curriculum_type = register.getCurriculum_type();
		int curriculum_point = register.getCurriculum_point(); 
		
		String sqlStatement = "insert into register (curriculum_code, curriculum_name, curriculum_type, curriculum_point) values (?, ?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{curriculum_code, curriculum_name, curriculum_type, curriculum_point}) == 1);
		
	}
	
	
}