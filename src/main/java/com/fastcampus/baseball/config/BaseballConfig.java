package com.fastcampus.baseball.config;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseballConfig {
  @Bean
  public Scanner getScanner() {
    return new Scanner(System.in);
  }
}
