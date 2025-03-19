package com.brbank.service;

import com.brbank.entity.AuthRequest;
import com.brbank.entity.AuthResponse;
import com.brbank.entity.UserResponse;
import com.brbank.entity.UserVO;
import lombok.AllArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class AuthService {

    private final RestTemplate restTemplate;
    private final JwtUtil jwtUtil;

    public AuthResponse register(AuthRequest request) {
        request.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        final var registeredUser = restTemplate.postForObject("http://localhost:9002/users", request, UserResponse.class);

        String accessToken = jwtUtil.generate(registeredUser.getId().toString(), registeredUser.getRole(), "ACCESS");
        String refreshToken = jwtUtil.generate(registeredUser.getId().toString(), registeredUser.getRole(), "REFRESH");

        return new AuthResponse(accessToken, refreshToken);
    }
}
