package com.samsung.spring.service;

import com.samsung.spring.dao.MembershipDao;
import com.samsung.spring.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembershipServiceImpl implements MembershipService{
    private final MembershipDao membershipDao;
    @Override
    public Membership add(Membership membership) {
        return membershipDao.save(membership);
    }

    @Override
    public List<Membership> getAll() {
        return membershipDao.findAll();
    }

    @Override
    public Membership getById(long id) {
        return membershipDao.findById(id).orElse(null);
    }

    @Override
    public Membership update(Membership membership) {
        return membershipDao.save(membership);
    }

    @Override
    public void deleteById(long id) {
        membershipDao.deleteById(id);
    }
}
