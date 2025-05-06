package com.example.leave.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.leave.model.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//透過username取得Employee，使用JPQL語法(entity 結合 sql)
	@Query("select e from Employee where e.username = :username")
	Employee findByUsername(@Param("username") String username);
	

}
