package com.paulojunior97.apiblog.domain.repository;

import com.paulojunior97.apiblog.domain.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    List<Album> findAlbumsByCriador_AtivoIsTrue();
}
