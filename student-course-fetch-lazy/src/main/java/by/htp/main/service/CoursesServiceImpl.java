package by.htp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.main.dao.CoursesDAO;
import by.htp.main.entity.Instructor;

@Service
public class CoursesServiceImpl implements CoursesService {

	@Autowired
	private CoursesDAO instructorDAO;
	
	@Transactional
	public List<Instructor> getInstructors() {
		return instructorDAO.getInstructors();
	}

/*	//@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		// log
		
		// check

		customerDAO.saveCustomer(theCustomer);
	}

	//@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	//@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}*/
}





