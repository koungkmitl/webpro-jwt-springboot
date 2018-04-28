package murraco.dto;

import murraco.domain_enum.State;
import murraco.domain_enum.TypePublic;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

public class Test {
    private State state;

    public State getState() {
        return state;
    }

    public Test setState(State state) {
        this.state = state;
        return this;
    }
}
