package com.fastcampus.baseball.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Entity
@NoArgsConstructor
@ToString(callSuper = true)
public class Stadium extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @Setter @Column String name;

  public Stadium(String name) {
    this.name = name;
  }
}
