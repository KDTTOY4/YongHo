package com.fastcampus.baseball.repository;

import com.fastcampus.baseball.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Integer> {
  Stadium findByName(String name);
}
