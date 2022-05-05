package com.example.photoalbumapp;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Photo> album;
    private ArrayList<Photo> favPhotos;

    public Album(String albumName) {
        album = new ArrayList<>();
        favPhotos = new ArrayList<>();
    }

    /**
     * Validation for the albumName which ensures that the name does not have
     * leading or trailing white space and validates that it's 3 or more characters in length.
     * @param - getValidName
     */
    public void setAlbumName(String albumName) {
        albumName = albumName.trim();
        if(albumName.length() >= 3)
            this.albumName = albumName;
        else
            throw new IllegalArgumentException("The name must be 3 or more characters in length.");
    }

    /**
     * Add Photo object to album Array
     * @param photo
     */
    public void addPhoto(Photo photo){
        album.add(photo);
    }

    /**
     * Removes photo by name of the album
     * @return
     */
    public void removePhoto(String photoName){
        album.removeIf(photo -> photo.getPhotoName().equals(photoName));
    }

    /**
     * Add favPhoto object to album Array
     * @param photo
     */
    public void addFavPhoto(Photo photo){
        favPhotos.add(photo);
    }

    /**
     * Removes favPhoto by name of the album
     * @return
     */
    public void removeFavPhoto(String photoName){
        favPhotos.removeIf(photo -> photo.getPhotoName().equals(photoName));
    }

    public String getAlbumName() {
        return albumName;
    }

    /**
     * Displays all the photo objects in the album
     * @return
     */
    public ArrayList<Photo> getAlbum() {
        return album;
    }

    /**
     * Displays all the favPhoto objects in the album
     * @return
     */
    public ArrayList<Photo> getFavPhotos() {
        return favPhotos;
    }


}
