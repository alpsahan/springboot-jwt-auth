package com.alpsahan.service;

import com.alpsahan.dto.DtoUser;
import com.alpsahan.jwt.AuthRequest;
import com.alpsahan.jwt.AuthResponse;

public interface IAuthService {
	
	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
}
