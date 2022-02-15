package uz.jl.services.base;

import java.util.List;

/**
 * @author Saydali Murodullayev, Tue 12:37 AM. 2/15/2022
 */
public interface GenericService<D, K> {

    D get(K id);

    List<D> getAll();
}
