package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.CurriculumDAO;
import model.Curriculum;

@Service
public class CurriculumService {
	@Autowired
	private CurriculumDAO curriculumDAO;
	
	//학기별 이수학점 조회
	public List<Curriculum> getGroupBy_Year_Semester(){
		return curriculumDAO.getGroupBy_Year_Semester();
	}
	
	//이수구분별 이수학점 조회
	public List<Curriculum> getGroupBy_Type() {
		return curriculumDAO.getGroupBy_Type();
	}
	
	//해당 년도,학기 별 이수과목명 조회
	public List<Curriculum> getYearSemester_Detail(int curriculum_year, String curriculum_semester) {
		return curriculumDAO.getYearSemester_Detail(curriculum_year, curriculum_semester);
	}
}

