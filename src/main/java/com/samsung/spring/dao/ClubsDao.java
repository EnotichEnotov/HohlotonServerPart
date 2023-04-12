package com.samsung.spring.dao;

import com.samsung.spring.domain.Clubs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubsDao extends JpaRepository<Clubs,Long> {
}
