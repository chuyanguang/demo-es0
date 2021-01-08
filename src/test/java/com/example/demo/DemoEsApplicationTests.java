package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

@Slf4j
@SpringBootTest
class DemoEsApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    void testCreate() {
        userRepository.save(new User(1L, "张三", new Date(), 23, "我热爱编程，spring是一个很强大的框架"));
    }

    @Test
    void testQuery() {
        Optional<User> optionalUser = userRepository.findById(1L);
        User user = optionalUser.get();
        log.info(user.toString());
    }

    @Autowired
    void testHighClient(){
    }

}
