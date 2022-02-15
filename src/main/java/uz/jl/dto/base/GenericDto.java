package uz.jl.dto.base;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Saydali Murodullayev, Tue 12:45 AM. 2/15/2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class GenericDto {
    UUID id;
}
