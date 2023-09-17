package com.example.Playlist.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int AlbumId;
    public String AlbumName;
    public String MusicComposer;
}
