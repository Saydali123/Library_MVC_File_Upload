package uz.jl.dto.base;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Builder
public class GenericDto {
    protected UUID id = UUID.randomUUID();
}
