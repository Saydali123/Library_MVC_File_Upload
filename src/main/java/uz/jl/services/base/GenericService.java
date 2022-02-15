package uz.jl.services.base;

import java.util.List;

public interface GenericService<D, K> {

    D get(K id);

    List<D> getAll();
}
