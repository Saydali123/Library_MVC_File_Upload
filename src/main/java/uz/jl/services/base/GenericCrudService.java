package uz.jl.services.base;

import org.springframework.web.multipart.MultipartFile;
import uz.jl.dto.base.BaseGenericDto;
import uz.jl.dto.base.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericCrudService<
        D extends GenericDto,
        CD extends BaseGenericDto,
        UD extends GenericDto,
        K extends Serializable> extends GenericService<D, K> {


    void delete(K id);

    boolean update(UD dto);

    K create(CD dto);

    K create(CD dto, MultipartFile file);

}
