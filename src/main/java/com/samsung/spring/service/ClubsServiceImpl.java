package com.samsung.spring.service;

import com.samsung.spring.dao.ClubsDao;
import com.samsung.spring.domain.Clubs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClubsServiceImpl implements ClubsService{
    private final ClubsDao clubsDao;
    @Override
    public Clubs add(Clubs club) {
        return clubsDao.save(club);
    }

    @Override
    public List<Clubs> getAll() {
        return clubsDao.findAll();
    }

    @Override
    public Clubs getById(long id) {
        return clubsDao.findById(id).orElse(null);
    }

    @Override
    public Clubs update(Clubs club) {
        return clubsDao.save(club);
    }

    @Override
    public void deleteById(long id) {
        clubsDao.deleteById(id);
    }
}
