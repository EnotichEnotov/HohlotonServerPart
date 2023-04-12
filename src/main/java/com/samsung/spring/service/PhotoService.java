package com.samsung.spring.service;

import com.samsung.spring.domain.Photo;

import java.util.List;

public interface PhotoService {
    Photo add(Photo photo);
    List<Photo> getAll();
    Photo getById(long id);
    Photo update(Photo photo);
    void deleteById(long id);
}
