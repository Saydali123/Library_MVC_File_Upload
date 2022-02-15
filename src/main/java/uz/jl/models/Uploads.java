package uz.jl.models;

import lombok.*;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import uz.jl.models.base.Auditable;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Builder
public class Uploads extends Auditable {
    private String originalName;
    private String generatedName;
    private String contentType;
    private long size;
    private String path;
    private Resource resource;
}
