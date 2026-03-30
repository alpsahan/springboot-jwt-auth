package com.alpsahan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpsahan.controller.IRestAuthController;
import com.alpsahan.dto.DtoUser;
import com.alpsahan.jwt.AuthRequest;
import com.alpsahan.jwt.AuthResponse;
import com.alpsahan.jwt.RefreshTokenRequest;
import com.alpsahan.service.IAuthService;
import com.alpsahan.service.IRefreshTokenService;

import jakarta.validation.Valid;

@RestController
public class RestAuthControllerImpl implements IRestAuthController{
	
	@Autowired
	private IAuthService authService;
	
	@Autowired
	private IRefreshTokenService refreshTokenService;

	@PostMapping("/register")
	@Override
	public DtoUser register(@Valid @RequestBody AuthRequest request) {
		
		return authService.register(request);
	}
	
	@PostMapping("/authenticate")
	@Override
	public AuthResponse authenticate(@Valid @RequestBody AuthRequest request) {
		
		return authService.authenticate(request);
	}
	
	@PostMapping("/refreshToken")
	@Override
	public AuthResponse refreshToken(@RequestBody RefreshTokenRequest request) {
		
		return refreshTokenService.refreshToken(request);
	}
	
	

}
