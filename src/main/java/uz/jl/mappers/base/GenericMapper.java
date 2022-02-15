package uz.jl.mappers.base;

import uz.jl.dto.base.BaseGenericDto;
import uz.jl.dto.base.GenericDto;
import uz.jl.models.base.BaseGenericModel;

import java.util.List;

/**
 * @author Saydali Murodullayev, Tue 12:47 AM. 2/15/2022
 */

/**
 * @param <E>  entity
 * @param <D>  dto
 * @param <CD> createDto
 * @param <UD> updateDto
 */

public interface GenericMapper<
        E extends BaseGenericModel,
        D extends GenericDto,
        CD extends BaseGenericDto,
        UD extends GenericDto> extends BaseGenericMapper {

    E fromCreateDto(CD dto);

    E fromUpdateDto(UD dto);

    D toDto(E entity);

    List<D> toDto(List<E> entityList);

    E fromDto(D dto);

    List<E> fromDto(List<D> dtoList);

}
