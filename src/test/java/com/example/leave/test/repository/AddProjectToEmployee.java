package com.example.leave.test.repository;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.Project;
import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.ProjectRepository;

@SpringBootTest 
public class AddProjectToEmployee {

	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
		try {
			
		//取得專案 (請先自行查詢資料庫的紀錄)
		Project web = projectRepository.findById(1).get();
		Project ppt = projectRepository.findById(2).get();
		Project app = projectRepository.findById(3).get();
		
		//取得員工
		Employee david = employeeRepository.findById(1).get();
		Employee cindy = employeeRepository.findById(4).get();
		Employee eddison = employeeRepository.findById(5).get();
		Employee jack = employeeRepository.findById(6).get();
		
		//員工自行認領專案
		david.getProjects().add(web);
		david.getProjects().add(ppt);
		david.getProjects().add(app);
		employeeRepository.save(david);
		
		cindy.getProjects().add(ppt);
		cindy.getProjects().add(app);
		employeeRepository.save(cindy);
		
		eddison.getProjects().add(web);
		eddison.getProjects().add(ppt);
		eddison.getProjects().add(app);
		employeeRepository.save(eddison);
		
		jack.getProjects().add(web);
		employeeRepository.save(jack);
		
	
	}catch (Exception e){
		e.printStackTrace();
	}
  
   }

}