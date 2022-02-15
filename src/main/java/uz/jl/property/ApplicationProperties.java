package uz.jl.property;

import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties extends BaseProperty {

    public ApplicationProperties() {
        super("src/main/resources/application.properties");
    }

}
