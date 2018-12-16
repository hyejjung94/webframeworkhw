package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.RegisterDAO;
import model.Register;
import model.Curriculum;

@Service
public class RegisterService {
	@Autowired
	private RegisterDAO registerDAO;
 
	//������û ��� ��ȸ
	public List<Register> getRegisterList() {
		return registerDAO.getRegisterList();
	}
	
	public void insert(Register register) {
		registerDAO.insert(register);
	}
}
