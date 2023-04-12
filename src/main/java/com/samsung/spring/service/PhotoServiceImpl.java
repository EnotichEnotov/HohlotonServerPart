package com.samsung.spring.service;

import com.samsung.spring.dao.PhotoDao;
import com.samsung.spring.domain.Photo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService{
    private final PhotoDao photoDao;
    @Override
    public Photo add(Photo photo) {
        return photoDao.save(photo);
    }

    @Override
    public List<Photo> getAll() {
        return photoDao.findAll();
    }

    @Override
    public Photo getById(long id) {
        return photoDao.findById(id).orElse(null);
    }

    @Override
    public Photo update(Photo photo) {
        return photoDao.save(photo);
    }

    @Override
    public void deleteById(long id) {
        photoDao.deleteById(id);
    }
}
