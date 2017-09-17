package pl.gbzl.kolecki.app.data.base.converter.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import pl.gbzl.kolecki.app.data.base.converter.IConverter;

import javax.persistence.MappedSuperclass;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
@MappedSuperclass
@Component
public abstract class Converter<S, T> implements IConverter<S, T> {

    @Override
    public List<T> convertList(List<S> source) {
        if (source == null) {
            return new ArrayList<>();
        }
        return source.stream().map(this::convert).collect(Collectors.toList());
    }

    @Override
    public Page<T> convertPage(Page<S> source) {
        if (source == null) {
            return null;
        }
        return new PageWrapper<>(source,
                convertList(source.getContent()));
    }

}