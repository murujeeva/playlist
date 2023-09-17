package com.example.Playlist.repository;

import com.example.Playlist.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Integer> {
    public Album findByAlbumName(String name);
}
