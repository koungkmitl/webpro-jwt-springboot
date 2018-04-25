package murraco.domain;

import murraco.domain_enum.State;
import murraco.domain_enum.TypeDoc;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Teacher extends Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String testTeacher;
//    private int qualityOfConferenceId;
//    private Date sentResearchDate;
//    private Date dateResultConsider;
//    private Date lastDateRegister;
//    private int numberOfJournal;
//    private float costPerJournal;
//    private String flightDestination;
//    private float flightCost;
//    private float airportVat;
//    private int abodeNight;
//    private float abodePerNight;
//    private int allowanceDay;
//    private float allowancePerDay;
//    private float costOfTravelInForeign;
//    private float costOfTravelInDomestic;
//    private float sumAllCost;
//    private Date date;
//    @Enumerated(EnumType.STRING)
//    private State state;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "conference_id")
//    private Conference conference;



}
