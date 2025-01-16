package zad2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VideoGame v1 = new VideoGame("Rally", "Racing", LocalDate.parse("2025-01-16"));
        VideoGame v2;
        try{
            v2 = (VideoGame)v1.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

        v1.setReleaseDate(LocalDate.parse("2025-01-01"));
        System.out.println(v1.getReleaseDate());
        System.out.println(v2.getReleaseDate());
    }
}
