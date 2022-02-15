package uz.jl.services.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.jl.mappers.base.BaseGenericMapper;
import uz.jl.repository.base.BaseGenericRepository;
import uz.jl.validators.base.BaseGenericValidator;

/**
 * @author Saydali Murodullayev, Tue 12:28 AM. 2/15/2022
 */
public abstract class AbstractService<
        R extends BaseGenericRepository,
        M extends BaseGenericMapper,
        V extends BaseGenericValidator> implements BaseGenericService {

    protected final R repository;
    protected final M mapper;
    protected final V validator;

    public AbstractService(R repository, M mapper, V validator) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
    }
}
