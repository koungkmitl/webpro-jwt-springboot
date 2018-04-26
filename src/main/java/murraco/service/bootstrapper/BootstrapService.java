package murraco.service.bootstrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BootstrapService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootstrapService.class);
    private final List<Bootstrapper> bootstrapperList;

    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    public BootstrapService(Optional<List<Bootstrapper>> bootstrapperList) {
        this.bootstrapperList = bootstrapperList.orElse(Collections.emptyList());
    }

    public void bootstrap() {
        LOGGER.info("Bootstrapping....");

        bootstrapperList.forEach(Bootstrapper::bootstrap);
    }
}
