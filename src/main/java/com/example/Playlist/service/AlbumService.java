package com.example.Playlist.service;

import com.example.Playlist.model.Album;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AlbumService {
    public List<Album> getAlbums();
    public Optional<Album> getAlbum(int id);
    public Album addAlbum(Album album);
    public void deleteAlbum(int id);
    public Album updateAlbum(Album album, int id);

}
