package com.simplecity.amp_library.model;

import java.util.List;

public class Suggestion {

    public AlbumArtist mostPlayedArtist;
    public Album mostPlayedAlbum;
    public Song mostPlayedSong;
    public List<Song> favouriteSongsOne;
    public List<Song> favouriteSongsTwo;
    public List<Album> recentlyPlayedAlbums;
    public List<Album> recentlyAddedAlbumsOne;
    public List<Album> recentlyAddedAlbumsTwo;

    public Suggestion(AlbumArtist mostPlayedAlbumArtist,
            Album mostPlayedAlbum,
            Song mostPlayedSong,
            List<Song> favouriteSongsOne,
            List<Song> favouriteSongsTwo,
            List<Album> recentlyPlayedAlbums,
            List<Album> recentlyAddedAlbumsOne,
            List<Album> recentlyAddedAlbumsTwo) {

        this.mostPlayedArtist = mostPlayedAlbumArtist;
        this.mostPlayedAlbum = mostPlayedAlbum;
        this.mostPlayedSong = mostPlayedSong;
        this.favouriteSongsOne = favouriteSongsOne;
        this.favouriteSongsTwo = favouriteSongsTwo;
        this.recentlyPlayedAlbums = recentlyPlayedAlbums;
        this.recentlyAddedAlbumsOne = recentlyAddedAlbumsOne;
        this.recentlyAddedAlbumsTwo = recentlyAddedAlbumsTwo;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "mostPlayedArtist=" + mostPlayedArtist +
                ", mostPlayedAlbum=" + mostPlayedAlbum +
                ", mostPlayedSong=" + mostPlayedSong +
                ", favouriteSongsOne=" + favouriteSongsOne +
                ", favouriteSongsTwo=" + favouriteSongsTwo +
                ", recentlyPlayedAlbums=" + recentlyPlayedAlbums +
                ", recentlyAddedAlbumsOne=" + recentlyAddedAlbumsOne +
                ", recentlyAddedAlbumsTwo=" + recentlyAddedAlbumsTwo +
                '}';
    }
}
