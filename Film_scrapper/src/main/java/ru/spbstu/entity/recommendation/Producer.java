package ru.spbstu.entity.recommendation;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "producer")
public class Producer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @Column(unique = true)
  private String producer;

  public Producer(String producer) {
    this.producer = producer;
  }
}
