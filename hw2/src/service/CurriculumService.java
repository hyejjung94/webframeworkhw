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
	
	//�б⺰ �̼����� ��ȸ
	public List<Curriculum> getGroupBy_Year_Semester(){
		return curriculumDAO.getGroupBy_Year_Semester();
	}
	
	//�̼����к� �̼����� ��ȸ
	public List<Curriculum> getGroupBy_Type() {
		return curriculumDAO.getGroupBy_Type();
	}
	
	//�ش� �⵵,�б� �� �̼������ ��ȸ
	public List<Curriculum> getYearSemester_Detail(int curriculum_year, String curriculum_semester) {
		return curriculumDAO.getYearSemester_Detail(curriculum_year, curriculum_semester);
	}
}

