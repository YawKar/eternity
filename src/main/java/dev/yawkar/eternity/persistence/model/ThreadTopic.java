package dev.yawkar.eternity.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "thread_topics")
@Getter
@Setter
@Accessors(chain = true)
public class ThreadTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
}
