package com.shopping.mall.domain.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MembersRepository extends JpaRepository<Members, Long> {

    @Query("SELECT m FROM Members m ORDER BY m.id DESC")
    List<Members> findAllDesc();
}
