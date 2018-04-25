package murraco.domain;

import murraco.domain_enum.TypeImage;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String url;

    @Enumerated(EnumType.STRING)
    private TypeImage typeImage;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}
