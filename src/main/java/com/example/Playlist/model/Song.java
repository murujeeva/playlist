package com.example.Playlist.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int songId;
    public String songName;
    public String duration;
    public int albumId;
}
