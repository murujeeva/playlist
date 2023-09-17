package com.example.Playlist.service;

import com.example.Playlist.model.Song;
import com.example.Playlist.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SongServiceImpl implements SongService{
    @Autowired
    SongRepository songRepository;

    @Override
    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> getSong(int id) {
        return songRepository.findById(id);
    }

    @Override
    public Song addSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public List<Song> getSongsByAlbumId(int albumId) {
        return songRepository.findByAlbumId(albumId);
    }
}
