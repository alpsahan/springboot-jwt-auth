package com.alpsahan.controller;

import com.alpsahan.dto.DtoUser;
import com.alpsahan.jwt.AuthRequest;
import com.alpsahan.jwt.AuthResponse;
import com.alpsahan.jwt.RefreshTokenRequest;

public interface IRestAuthController {
	
	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
	
	public AuthResponse refreshToken(RefreshTokenRequest request);
}
