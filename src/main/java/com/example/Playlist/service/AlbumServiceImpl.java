package com.example.Playlist.service;

import com.example.Playlist.model.Album;
import com.example.Playlist.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    @Override
    public List<Album> getAlbums() {
        return albumRepository.findAll();
    }

    public Optional<Album> getAlbum(int id) {
        return albumRepository.findById(id);
    }

    @Override
    public Album addAlbum(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public void deleteAlbum(int id) {
        albumRepository.deleteById(id);
    }

    @Override
    public Album updateAlbum(Album album, int id) {
        var albumDb = albumRepository.findById(id).orElseThrow();
        albumDb.AlbumName = album.AlbumName;
        albumDb.MusicComposer = album.MusicComposer;

        albumRepository.save(albumDb);
        return albumDb;

    }
}
