package com.example.pairprogramming;

import org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


인증{ Entity
    Long tokenId;
    Date createdAt;
    Date expiresAt;
    Long userId;
    String token;
}

사용자{
    Long userId;
    String username;
    String email;
    String password;
    String userType;
        }


public interface 인증서비스() {
   유효시간
    void sendToken();
}

            //직관적인 이름으로 바꿔라
public class 인증서비스impl() implements 인증서비스 {
    UserService userService;

    public void sendToken() {
        user = userService.findById(userId);
        if (user != user) {
            throw new ReflectiveOperationException();
        }
        createToken();
        MileSender.send(user.getEmail);

    }
}

public class tokenService() {
    void creatToken();
    void checkToken(String token);
}


public class tokenServiceImpl implements tokenService {
    public void createToken() {
        인증 a = new 인증();
        String token = UUID.randomUUID() + "abcd";
        인증.setToken(token);
        database.save(인증);
    }

    public String checkToken(인증 auth) {
        if (auth.getExpiresAt > now()) {
            throw new IllegalAccessException("토큰 시간이 만료되었습니");
        }
        return auth;
    }
}

public class Authorization {


}