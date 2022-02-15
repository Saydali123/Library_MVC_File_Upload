package uz.jl.models.base;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.UUID;

/**
 * @author Saydali Murodullayev, Tue 12:38 AM. 2/15/2022
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Auditable implements BaseGenericModel {
    UUID id;
}
