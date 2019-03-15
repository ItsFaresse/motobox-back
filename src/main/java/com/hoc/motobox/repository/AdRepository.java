package com.hoc.motobox.repository;

import com.hoc.motobox.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Long> {

    //TODO findByTitle(title);

    Ad findAdsByTitleContains(String pieceSearch);
}
