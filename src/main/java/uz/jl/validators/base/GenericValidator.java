package uz.jl.validators.base;

/**
 * @author Saydali Murodullayev, Tue 12:51 AM. 2/15/2022
 */
public interface GenericValidator<CD, UD, K> extends
        BaseGenericValidator {

    void validOnCreate(CD dto);

    void validOnUpdate(UD dto);
}
