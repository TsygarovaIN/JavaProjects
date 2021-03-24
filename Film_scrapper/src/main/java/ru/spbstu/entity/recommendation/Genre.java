package ru.spbstu.entity.recommendation;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "genre")
public class Genre {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @Column(unique = true)
  private String genre;

  public Genre (String genre) {
    this.genre = genre;
  }
}
