package com.example.photoalbumapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class PhotoTest {
    private Photo photo;

    @BeforeEach
    void setUp() {
        photo = new Photo("TestPhotoName", LocalDate.of(2019, Month.AUGUST, 16));
    }

    @Test
    void setPhotoName() {
        photo.setPhotoName("TestPhotoName");
        assertEquals("TestPhotoName",photo.getPhotoName());
    }

    @Test
    void setPhotoNameInvalidLength(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->photo.setPhotoName("123456789012345678901234567890"));
    }

    @Test
    void setDateTaken() {
        photo.setDateTaken(LocalDate.of(2000, Month.JANUARY,1));
        assertEquals(LocalDate.of(2000, Month.JANUARY,1),photo.getDateTaken());
    }

    @Test
    void setDateTakenInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> photo.setDateTaken(LocalDate.of(1999,Month.DECEMBER,31)));
    }
}