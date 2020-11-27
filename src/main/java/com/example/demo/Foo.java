package com.example.demo;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo {
  @Id
  UUID uuid = UUID.randomUUID();
}
