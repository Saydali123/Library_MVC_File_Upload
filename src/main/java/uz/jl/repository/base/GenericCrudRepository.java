package uz.jl.repository.base;

import uz.jl.models.base.BaseGenericModel;

import java.io.Serializable;

public interface GenericCrudRepository<E extends BaseGenericModel, K extends Serializable>
        extends GenericRepository<E, K> {

    K create(E entity);

    void delete(K id);

    void update(E entity);
}
