package com.brbank.service;

import com.brbank.entity.UserVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class UserService {

    public UserVO save(UserVO userVO) {

        final var userId = String.valueOf(new Date().getTime());
        userVO.setId(userId);
        userVO.setRole("USER");

        return userVO;
    }
}
