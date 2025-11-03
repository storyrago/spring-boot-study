package com.example.hello_spring.repository;

import com.example.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //optional 은 가져오는 값을 optional 로 감쌈
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
