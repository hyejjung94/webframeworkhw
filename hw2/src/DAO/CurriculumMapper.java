package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Curriculum;

public class CurriculumMapper implements RowMapper<Curriculum>{
	@Override
	public Curriculum mapRow(ResultSet rs, int rowNum) throws SQLException {
		Curriculum curriculum = new Curriculum();
		
		curriculum.setCurriculum_year(rs.getInt("curriculum_year"));
		curriculum.setCurriculum_semester(rs.getString("curriculum_semester"));
		curriculum.setCurriculum_code(rs.getString("curriculum_code"));
		curriculum.setCurriculum_name(rs.getString("curriculum_name"));
		curriculum.setCurriculum_type(rs.getString("curriculum_type"));
		curriculum.setCurriculum_point(rs.getInt("curriculum_point"));
		
		return curriculum;
	}
}
