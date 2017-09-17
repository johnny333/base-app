package pl.gbzl.kolecki.app.data.base.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
public interface IBaseDataService<DTO> {
    DTO postElement(DTO element);

    DTO putElement(DTO element);

    DTO patchElement(DTO element);

    DTO deleteElement(Long elementId);

    DTO getElement(Long elementId);

    Collection<DTO> getElements();

    Page<DTO> getPageOfElements(Pageable pageable);

    Class<?> getOBGenericType();

    Class<?> getDTOGenericType();
}
