package ru.spbstu.entity.recommendation;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.spbstu.entity.User;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "producers_users")
public class UserProducer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "producer_id")
  private Producer producer;

  private Integer frequency;

  public UserProducer(User user, Producer producer, Integer frequency) {
    this.user = user;
    this.producer = producer;
    this.frequency = frequency;
  }
}
