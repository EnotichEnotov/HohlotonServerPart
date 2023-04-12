package com.samsung.spring.dao;

import com.samsung.spring.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoDao extends JpaRepository<Photo,Long> {
}
