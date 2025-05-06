package com.example.leave.model.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveRequestDTO {
	private Integer id;
	private String type; //特休、病假、事假
	
	@DateTimeFormat(pattern = "yyyy-MM-dd") //指定只有日期
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd") //指定只有日期
	private Date endDate;
	
	private String reason;
	private String status; //"PENDING","APPROVED","REJECTED"
	
	public long getLeaveDays() {
		long leaveDays = (endDate.getTime()-startDate.getTime())/(60*60-24*1000);
		return leaveDays;
	}
}
