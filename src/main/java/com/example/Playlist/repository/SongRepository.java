package com.example.Playlist.repository;

import com.example.Playlist.model.Song;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song,Integer> {
    List<Song> findByAlbumId(int albumId);
}
