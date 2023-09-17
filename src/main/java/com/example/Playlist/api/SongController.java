package com.example.Playlist.api;

import com.example.Playlist.model.Song;
import com.example.Playlist.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/api/songs")
    public List<Song> getSongs(){
        return songService.getSongs();
    }

    @GetMapping("/api/songs/{id}")
    public Optional<Song> getSong(@PathVariable int id){
        return songService.getSong(id);
    }

    @PostMapping("/api/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }
}
