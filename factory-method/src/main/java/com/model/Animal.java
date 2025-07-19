package com.model;

import com.annotation.Component;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component(name = "animal")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Animal {
  private String name;
}
