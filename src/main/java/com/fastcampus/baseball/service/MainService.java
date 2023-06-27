package com.fastcampus.baseball.service;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  Scanner scanner;

  public MainService(@Autowired Scanner scanner) {
    this.scanner = scanner;
  }

  public String inputCommands() {
    System.out.print("어떤 기능을 요청하시겠습니까? ");
    return scanner.nextLine();
  }
}
