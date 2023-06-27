package com.fastcampus.baseball;

import com.fastcampus.baseball.service.MainService;
import com.fastcampus.baseball.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BaseballApp {
  MainService mainService;
  StadiumService stadiumService;

  public BaseballApp(@Autowired MainService mainService, @Autowired StadiumService stadiumService) {
    this.mainService = mainService;
    this.stadiumService = stadiumService;
  }

  public static void main(String[] args) {
    SpringApplication.run(BaseballApp.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void run() {
    while (true) {
      String fullCommands = mainService.inputCommands();
      if ("quit".equals(fullCommands)) break;
      String[] args = fullCommands.split("\\?");
      if (args.length == 0) System.out.println("명령을 입력하세요.");
      for (String arg : args) {
        System.out.println(arg);
      }

      if ("야구장등록".equals(args[0])) {
        String name = args[1].split("=")[1];
        System.out.println(stadiumService.registerNewStadium(name));
      } else if ("야구장목록".equals(args[0])) {
        System.out.println(stadiumService.findAll());
      }
    }
  }
}
