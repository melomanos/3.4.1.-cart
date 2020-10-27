package ru.netology.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movies {
  private int id;
  private String movieName;
  private String movieGenre;
  private int count;
}
