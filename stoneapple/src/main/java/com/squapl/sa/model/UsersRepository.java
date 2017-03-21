package com.squapl.sa.model;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface UsersRepository extends ElasticsearchRepository<Users, Long> {
    List<Users> findByName(String text);

    List<Users> findBySalary(Long salary);
}
