package pl.gbzl.kolecki.app.data.base.converter.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jakubkolecki on 12.09.2017.
 */

@RequiredArgsConstructor
public class PageWrapper<T, S> implements Page<T> {

    private final Page<S> page;

    private final List<T> content;

    @Override
    public int getTotalPages() {
        return this.page.getTotalPages();
    }

    @Override
    public long getTotalElements() {
        return this.page.getTotalElements();
    }

    @Override
    public int getNumber() {
        return this.page.getNumber();
    }

    @Override
    public int getSize() {
        return this.page.getSize();
    }

    @Override
    public int getNumberOfElements() {
        return this.page.getNumberOfElements();
    }

    @Override
    public List<T> getContent() {
        return this.content;
    }


    @Override
    public boolean hasContent() {
        return this.page.hasContent();
    }

    @Override
    public Sort getSort() {
        return this.page.getSort();
    }

    @Override
    public boolean isFirst() {
        return this.page.isFirst();
    }

    @Override
    public boolean isLast() {
        return this.page.isLast();
    }

    @Override
    public boolean hasNext() {
        return this.page.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.page.hasPrevious();
    }

    @Override
    public Pageable nextPageable() {
        return this.page.nextPageable();
    }

    @Override
    public Pageable previousPageable() {
        return this.page.previousPageable();
    }

    @Override
    public <S> Page<S> map(org.springframework.core.convert.converter.Converter<? super T, ? extends S> converter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        return this.content.iterator();
    }
}
