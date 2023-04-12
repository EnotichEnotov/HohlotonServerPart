package com.samsung.spring.dao;

import com.samsung.spring.domain.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipDao extends JpaRepository<Membership,Long> {
}
