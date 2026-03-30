package com.alpsahan.controller;

import com.alpsahan.dto.DtoEmployee;

public interface IRestEmployeeController {
	
	public DtoEmployee findEmployeeById(Long id);

}
