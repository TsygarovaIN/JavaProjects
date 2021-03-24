package ru.spbstu.entity.recommendation;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.spbstu.entity.User;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "genres_users")
public class UserGenre {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "genre_id")
  private Genre genre;

  private Integer frequency;

  public UserGenre(User user, Genre genre, Integer frequency) {
    this.user = user;
    this.genre = genre;
    this.frequency = frequency;
  }
}
