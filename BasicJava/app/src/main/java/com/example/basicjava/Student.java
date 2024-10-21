package com.example.basicjava;

import java.util.Objects;

public class Student {
    private String nama;
    private int umur;
    private String univ;

    public Student(String nama, int umur, String univ) {
        this.nama = nama;
        this.umur = umur;
        this.univ = univ;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("univ: " + univ);
    }

    public boolean isUGM() {
        return Objects.equals(univ, "UGM");
    }
}

