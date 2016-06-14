package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by sathish on 12/3/16.
 */
@Repository
@Transactional
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    AccountRepository accountRepository;

//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;

    public Optional<User> getUserByEmail(String email) {
        return accountRepository.findOneByEmail(email);
    }

    Map<String, String> createUser(String email, String password, String role) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("status", "success");
        stringMap.put("message", "user registered successfully");
        Optional<User> user1 = accountRepository.findOneByEmail(email);
        System.out.println("user1 : " + user1);
        if (!user1.isPresent()) {
            User user = new User();
            user.setEmail(email);
            user.setRole(StringUtils.endsWithIgnoreCase("user", role) ? Role.USER : Role.ADMIN);
            user.setPasswordHash(new BCryptPasswordEncoder().encode(password));
            accountRepository.save(user);
        } else {
            stringMap.put("status", "error");
            stringMap.put("message", "Email already is existed");
        }
        return stringMap;
    }

}
