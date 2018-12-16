package model;

public class Curriculum {
	private Integer curriculum_year;
	private String curriculum_semester;
	private String curriculum_code;
	private String curriculum_name;
	private String curriculum_type;
	private int curriculum_point;
	
	public Integer getCurriculum_year() {
		return curriculum_year;
	}
	public void setCurriculum_year(Integer curriculum_year) {
		this.curriculum_year = curriculum_year;
	}
	public String getCurriculum_semester() {
		return curriculum_semester;
	}
	public void setCurriculum_semester(String curriculum_semester) {
		this.curriculum_semester = curriculum_semester;
	}
	public String getCurriculum_code() {
		return curriculum_code;
	}
	public void setCurriculum_code(String curriculum_code) {
		this.curriculum_code = curriculum_code;
	}
	public String getCurriculum_name() {
		return curriculum_name;
	}
	public void setCurriculum_name(String curriculum_name) {
		this.curriculum_name = curriculum_name;
	}
	public String getCurriculum_type() {
		return curriculum_type;
	}
	public void setCurriculum_type(String curriculum_type) {
		this.curriculum_type = curriculum_type;
	}
	public int getCurriculum_point() {
		return curriculum_point;
	}
	public void setCurriculum_point(int curriculum_point) {
		this.curriculum_point = curriculum_point;
	}
	
	@Override
	public String toString() {
		return "CurriculumDTO [curriculum_year=" + curriculum_year + ", curriculum_semester=" + curriculum_semester + ", curriculum_code="
				+ curriculum_code + ", curriculum_name=" + curriculum_name + ", course_type=" + curriculum_type + ", curriculum_point="
				+ curriculum_point + "]";
	}
}

