package com.example.photoalbumapp;

import java.time.LocalDate;

public class Photo {
    private String photoName;
    private LocalDate dateTaken;
    private String fileName;

    public Photo(String photoName, LocalDate dateTaken) {
        setPhotoName(photoName);
        setDateTaken(dateTaken);
        //This will be the name the user saves the photo as inside the Album
        fileName = String.format("images/%s.jpg",photoName);
    }

    public String getPhotoName() {
        return photoName;
    }
    //Since this is to save personal files only light validation necessary as filenames can contain any characters
    public void setPhotoName(String photoName) {
        if(photoName.length() < 30)
            this.photoName = photoName;
        else
            throw new IllegalArgumentException("Photo name too long please make the name less than 30 characters.");
    }

    public LocalDate getDateTaken() {
        return dateTaken;
    }
    //Light validation so that the date cannot be less than the year 1970
    public void setDateTaken(LocalDate dateTaken) {
        if(dateTaken.getYear() >= 1970)
            this.dateTaken = dateTaken;
        throw new IllegalArgumentException("The date must be above the year 2000");
    }
}
