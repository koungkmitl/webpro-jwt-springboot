package murraco.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String textComment;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}
