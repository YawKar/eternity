package dev.yawkar.eternity.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "news_topics")
@Getter
@Setter
@Accessors(chain = true)
public class NewsTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private LocalDateTime timestamp;
}
