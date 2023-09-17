package com.example.Playlist.api;

import com.example.Playlist.model.Album;
import com.example.Playlist.model.Song;
import com.example.Playlist.repository.AlbumRepository;
import com.example.Playlist.service.AlbumService;
import com.example.Playlist.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AlbumController {
 //   @Autowired
    AlbumService albumService;
 //   @Autowired
    SongService songService;

    @Autowired
    public AlbumController(AlbumService albumService, SongService songService){
        this.albumService = albumService;
        this.songService = songService;
    }

    @GetMapping("/api/albums")
    public List<Album> getAlbums(){
        return albumService.getAlbums();
    }

    @GetMapping("/api/albums/{id}")
    public Optional<Album> getAlbum(@PathVariable int id){
        return albumService.getAlbum(id);
    }

    @GetMapping("/api/albums/{id}/songs")
    public List<Song> getAlbumSongs(@PathVariable int id){
        return songService.getSongsByAlbumId(id);
    }


    @PostMapping("/api/albums")
    public Album addAlbum(@RequestBody Album album){

        return albumService.addAlbum(album);
    }

    @PostMapping("/api/albums/{id}")
    public void deleteAlbum(@PathVariable int id){
        albumService.deleteAlbum(id);
    }

    @PutMapping("/api/albums/{id}")
    public Album updateAlbum(@RequestBody Album album,@PathVariable int id){
        return albumService.updateAlbum(album, id);
    }

}
