package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import model.Curriculum;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CurriculumDAO {
	
	private JdbcTemplate jdbcTemplateObject;

	// 학기별 이수학점 현황
	public List<Curriculum> getGroupBy_Year_Semester() {
		String sqlStatement = "SELECT curriculum_year, curriculum_semester, SUM(curriculum_point) " + "FROM curriculum "
				+ "GROUP BY curriculum_year, curriculum_semester " + "ORDER BY curriculum_year, curriculum_semester";

		List<Curriculum> curriculumList = jdbcTemplateObject.query(sqlStatement, new RowMapper<Curriculum>() {

			@Override
			public Curriculum mapRow(ResultSet rs, int rowNum) throws SQLException {
				Curriculum curriculum = new Curriculum();

				curriculum.setCurriculum_year(rs.getInt("curriculum_year"));
				curriculum.setCurriculum_semester(rs.getString("curriculum_semester"));
				curriculum.setCurriculum_point(rs.getInt("SUM(curriculum_point)"));

				return curriculum;
			}
		});
		return curriculumList;
	}

	// 이수 구분별 이수학점 현황
	public List<Curriculum> getGroupBy_Type() {
		String sqlStatement = "SELECT curriculum_type, SUM(curriculum_point) " + "FROM curriculum "
				+ "GROUP BY curriculum_type;";

		List<Curriculum> curriculumList = jdbcTemplateObject.query(sqlStatement, new RowMapper<Curriculum>() {

			@Override
			public Curriculum mapRow(ResultSet rs, int rowNum) throws SQLException {
				Curriculum curriculum = new Curriculum();

				curriculum.setCurriculum_type(rs.getString("curriculum_type"));
				curriculum.setCurriculum_point(rs.getInt("SUM(curriculum_point)"));

				return curriculum;
			}
		});
		return curriculumList;
	}
	
	public List<Curriculum> getYearSemester_Detail(int curriculum_year, String curriculum_semester){
		String sqlStatement = "SELECT * " 
							+ "FROM curriculum " 
							+ "WHERE curriculum_year = ? AND curriculum_semester = ?";
		
		List<Curriculum> curriculumList = jdbcTemplateObject.query(sqlStatement, new Object[]{curriculum_year, curriculum_semester}, new CurriculumMapper());
		
		return curriculumList;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
}
