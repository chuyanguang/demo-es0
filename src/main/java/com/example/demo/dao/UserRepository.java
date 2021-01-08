package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, Long> {

}
