package murraco.dto;

import murraco.domain_enum.State;
import murraco.domain_enum.TypePublic;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

public class Test {
    private State state;
    private Date a;

    public State getState() {
        return state;
    }

    public Test setState(State state) {
        this.state = state;
        return this;
    }

    public Date getA() {
        return a;
    }

    public Test setA(Date a) {
        this.a = a;
        return this;
    }
}
