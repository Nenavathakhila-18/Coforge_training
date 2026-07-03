package com.coforge.day3;

public class MovieApp {

    public static void main(String[] args) {

        Movie m1 = new Movie();

        m1.setMovieName("Pushpa 2");
        m1.setDirector("Sukumar");
        m1.setRating(4.8);

        System.out.println(m1);

        Movie m2 = new Movie("RRR", "S. S. Rajamouli", 4.9);

        System.out.println(m2);
    }
}