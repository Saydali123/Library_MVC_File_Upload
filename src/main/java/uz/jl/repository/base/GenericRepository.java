package uz.jl.repository.base;

import uz.jl.models.base.BaseGenericModel;

import java.io.Serializable;
import java.util.List;

public interface GenericRepository<E extends BaseGenericModel, K extends Serializable> {


    E get(K id);

    List<E> getAll();
}
