package uz.jl.property;

import org.springframework.stereotype.Component;

@Component
public class DatabaseProperties extends BaseProperty {
    public DatabaseProperties() {
        super("src/main/resources/db.properties");
    }
}
