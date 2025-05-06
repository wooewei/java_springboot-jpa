package com.example.leave.model.entity;

import java.util.Date;
import java.util.List;

import com.example.leave.model.dto.LeaveRequestDTO;
import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.model.dto.SalaryDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "salary")
@Getter
@Setter
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id;
	
	@Column
	private Integer amount; //薪資金額
	

}
