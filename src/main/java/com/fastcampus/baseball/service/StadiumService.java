package com.fastcampus.baseball.service;

import com.fastcampus.baseball.entity.Stadium;
import com.fastcampus.baseball.repository.StadiumRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {
  StadiumRepository stadiumRepository;

  public StadiumService(@Autowired StadiumRepository stadiumRepository) {
    this.stadiumRepository = stadiumRepository;
  }

  public String registerNewStadium(String name) {

    Stadium stadium = new Stadium(name);
    if (stadiumRepository.findByName(name) != null) return "이미 존재하는 야구장";

    stadiumRepository.save(stadium);

    return "성공";
  }

  public List<Stadium> findAll() {
    return stadiumRepository.findAll();
  }
}
