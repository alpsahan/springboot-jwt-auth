package com.alpsahan.service;

import com.alpsahan.jwt.AuthResponse;
import com.alpsahan.jwt.RefreshTokenRequest;
import com.alpsahan.model.RefreshToken;

public interface IRefreshTokenService {
	
	public AuthResponse refreshToken(RefreshTokenRequest request);
}
