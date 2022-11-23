package com.career.revenue.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.career.constants.AppConstants;
import com.career.revenue.dto.ElectricityDto;
import com.career.revenue.dto.MentorSalaryDto;
import com.career.revenue.dto.OthersDto;
import com.career.revenue.dto.RentDto;
import com.career.revenue.entity.Expences;
import com.career.revenue.repo.ExpencesRepo;
import com.career.revenue.service.ExpencesService;

@Service
public class ExpencesServiceImpl implements ExpencesService {
	
	@Autowired
	private ExpencesRepo expencesRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	private String response;
	

	@Override
	public String mentorSalary(MentorSalaryDto mentorSalary) {
		Expences expence = mapper.map(mentorSalary, Expences.class);
		Expences save = expencesRepo.save(expence);
		if(save == null)
			response = AppConstants.MENTOR_SALARY_FAILED;
		else
			response = AppConstants.MENTOR_SALARY_SUCCESS;
		
		return response;
	}


	@Override
	public String rentExpences(RentDto rent) {
		Expences expence = mapper.map(rent, Expences.class);
		Expences save = expencesRepo.save(expence);
		if(save == null)
			response = AppConstants.RENT_PAYMENT_FAILED;
		else
			response = AppConstants.RENT_PAYMENT_SUCCESSFUL;
		
		return response;
	}


	@Override
	public String electricityExpences(ElectricityDto electricity) {
		Expences expence = mapper.map(electricity, Expences.class);
		Expences save = expencesRepo.save(expence);
		if(save == null)
			response = AppConstants.ELECTRICITY_PAYMENT_FAILED;
		else
			response = AppConstants.ELECTRICITY_PAYMENT_SUCCESSFUL;
		
		return response;
	}


	@Override
	public String othersExpences(OthersDto others) {
		Expences expence = mapper.map(others, Expences.class);
		Expences save = expencesRepo.save(expence);
		if(save == null)
			response = AppConstants.OTHERS_PAYMENT_FAILED;
		else
			response = AppConstants.OTHERS_PAYMENT_SUCCESSFUL;
		
		return response;
	}

}
