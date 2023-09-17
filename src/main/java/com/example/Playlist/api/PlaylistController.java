package com.example.Playlist.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    @GetMapping("/api/playlist")
    public String getPlaylist(){
        return "<h2>Welcome to JeevaWrap</h2>";
    }
}
