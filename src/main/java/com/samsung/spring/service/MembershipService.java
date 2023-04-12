package com.samsung.spring.service;

import com.samsung.spring.domain.Membership;
import com.samsung.spring.domain.User;

import java.util.List;

public interface MembershipService {
    Membership add(Membership membership);
    List<Membership> getAll();
    Membership getById(long id);
    Membership update(Membership membership);
    void deleteById(long id);
}
