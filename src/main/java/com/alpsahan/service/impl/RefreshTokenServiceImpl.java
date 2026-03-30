package com.alpsahan.service.impl;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpsahan.jwt.AuthResponse;
import com.alpsahan.jwt.JwtService;
import com.alpsahan.jwt.RefreshTokenRequest;
import com.alpsahan.model.RefreshToken;
import com.alpsahan.model.User;
import com.alpsahan.repository.RefreshTokenRepository;
import com.alpsahan.service.IRefreshTokenService;

@Service
public class RefreshTokenServiceImpl implements IRefreshTokenService{
	
	@Autowired
	private RefreshTokenRepository refreshTokenRepository;
	
	@Autowired
	private JwtService jwtService;
	
	public boolean isRefreshTokenExpired(Date expiredDate) {
		return new Date().before(expiredDate);
	}
	public RefreshToken createRefreshToken(User user) {
		RefreshToken refreshToken = new RefreshToken();
		refreshToken.setRefreshToken(UUID.randomUUID().toString());
		refreshToken.setExpireDate(new Date(System.currentTimeMillis()+1000*60*60*4));
		refreshToken.setUser(user);
		
		return refreshToken;
	}
	
	@Override
	public AuthResponse refreshToken(RefreshTokenRequest request) {
		Optional<RefreshToken> optional = refreshTokenRepository.findByRefreshToken(request.getRefreshToken());
		if(optional.isEmpty()) {
			System.out.println("REFRESH TOKEN GEÇERSİZDİR : " + request.getRefreshToken());
		}
		
		RefreshToken refreshToken = optional.get();
		if(!isRefreshTokenExpired(refreshToken.getExpireDate())) {
			System.out.println("REFRESH TOKEN EXPİRE OLMUŞTUR" + request.getRefreshToken());
		}
		
		String accessToken = jwtService.generateToken(refreshToken.getUser());
		RefreshToken savedRefreshToken = refreshTokenRepository.save(createRefreshToken(refreshToken.getUser()));
		
		return new AuthResponse(accessToken, savedRefreshToken.getRefreshToken());
	}

}
