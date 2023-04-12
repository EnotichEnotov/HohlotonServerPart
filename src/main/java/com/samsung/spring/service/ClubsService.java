package com.samsung.spring.service;

import com.samsung.spring.domain.Clubs;
import com.samsung.spring.domain.User;

import java.util.List;

public interface ClubsService {
    Clubs add(Clubs club);
    List<Clubs> getAll();
    Clubs getById(long id);
    Clubs update(Clubs club);
    void deleteById(long id);
}
