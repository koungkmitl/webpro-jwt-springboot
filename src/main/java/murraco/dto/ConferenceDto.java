package murraco.dto;

import murraco.domain_enum.State;
import murraco.domain_enum.TypeDoc;
import murraco.domain_enum.TypePublic;

import java.util.Date;

public class ConferenceDto {
    private Integer id;
    private State state;
    private String researchName;
    private TypePublic typePublics;
    private String conferenceName;
    private Date startDate;
    private Date endDate;
    private String place;
    private Date starTravelDate;
    private Date endTravelDate;
    private float costAbode;
    private float costRegister;
    private float maximumMoneySupport;
    private int levelOfConference;
    private TypeDoc typeDocs;
}
