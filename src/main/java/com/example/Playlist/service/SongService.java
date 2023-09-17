package com.example.Playlist.service;

import com.example.Playlist.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SongService {
    public List<Song> getSongs();
    public Optional<Song> getSong(int id);
    public Song addSong(Song song);
    public List<Song> getSongsByAlbumId(int albumId);
}
