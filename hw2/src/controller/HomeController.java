package controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Curriculum;
import service.CurriculumService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private CurriculumService courseService;

	/**
	 * Home view, home.jsp
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "main";
	}

	/*
	 * 년도, 학기별 이수학점 현황 view, semesterPointForm.jsp
	 */
	@RequestMapping(value = "/semesterPoints", method = RequestMethod.GET)
	public String getCoursePointBySemester(Model model) {
		List<Curriculum> semesterPoints = courseService.getGroupBy_Year_Semester();

		model.addAttribute("semesterPoints", semesterPoints);

		return "semesterPointForm";
	}
	
	/*
	 * 이수구분별 이수학점 조회 view, TypePointForm.jsp
	 */
	@RequestMapping(value = "/typePoints", method = RequestMethod.GET)
	public String getCoursePointByType(Model model) {
		List<Curriculum> typePoints = courseService.getGroupBy_Type();

		model.addAttribute("typePoints", typePoints);

		return "typePointForm";
	}
	
	@RequestMapping(value="/yearSemesterCurriculum", method = RequestMethod.GET)
	public String getDetailSemsterPoint(Integer curriculum_year, String curriculum_semester, Model model) {
		List<Curriculum> curriculumnameList = courseService.getYearSemester_Detail(curriculum_year, curriculum_semester);
		
		model.addAttribute("curriculum_year", curriculum_year);
		model.addAttribute("curriculum_semester", curriculum_semester);
		model.addAttribute("curriculumnameList", curriculumnameList);
		return "detailCurriculum";
	}
}

