package pl.gbzl.kolecki.app.data.base.converter;

import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by jakubkolecki on 12.09.2017.
 */
public interface IConverter<S, T> extends org.springframework.core.convert.converter.Converter<S, T> {

    List<T> convertList(List<S> source);

    Page<T> convertPage(Page<S> source);
}
